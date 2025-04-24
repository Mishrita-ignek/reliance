package attendence.rinfra.web.portlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.Cookie;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import attendence.rinfra.services.exception.NoSuchAttendenceTransactionException;
import attendence.rinfra.services.model.AttendenceTransaction;
import attendence.rinfra.services.model.EmpMaster;
import attendence.rinfra.services.model.EmpOtpMaster;
import attendence.rinfra.services.service.AttendenceTransactionLocalServiceUtil;
import attendence.rinfra.services.service.EmpMasterLocalServiceUtil;
import attendence.rinfra.services.service.EmpOtpMasterLocalServiceUtil;
import attendence.rinfra.services.service.persistence.AttendenceTransactionPersistence;
import attendence.rinfra.web.constants.AttendenceRinfraWebPortletKeys;

/**
 * @author CBT151521
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=attendence-rinfra-web Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AttendenceRinfraWebPortletKeys.AttendenceRinfraWeb,
		"javax.portlet.resource-bundle=content.Language",
		"com.liferay.portlet.header-portlet-javascript=/js/jquery.dataTables.min.js",
		"com.liferay.portlet.footer-portlet-css=/css/jquery.dataTables.min.css",
		"com.liferay.portlet.footer-portlet-css=/css/main.css",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class AttendenceRinfraWebPortlet extends MVCPortlet {

	private static final Log log = LogFactoryUtil.getLog(AttendenceRinfraWebPortlet.class);

	@Reference
	AttendenceTransactionPersistence attendenceTransactionLocalService;

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// AttendenceTransaction attendence = null;
		// String empcode = ParamUtil.getString(renderRequest, "empCode");
		//
		// //log.info(empcode);
		// if (Validator.isNotNull(empcode)) {
		// LocalDateTime now = LocalDateTime.now();
		// DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy
		// HH:mm:ss");
		// String formatDateTime = now.format(format);
		//
		// try {
		// attendence =
		// attendenceTransactionLocalService.findByemployeeCode(empcode);
		// } catch (NoSuchAttendenceTransactionException e) {
		// log.info("NoSuchAttendenceTransactionException");
		// }
		// String mode = attendence.getAttendenceDateTime();
		// // log.info(mode);
		// if (mode.substring(0, 2) == formatDateTime.substring(0, 2)) {
		// renderRequest.setAttribute("submit", "ok");
		// }
		// }
		super.render(renderRequest, renderResponse);
	}

	@ProcessAction(name = "sendCookie")
	public void sendCookie(ActionRequest actionRequest, ActionResponse actionResponse) {

		String empcode = ParamUtil.getString(actionRequest, "empcode");
		String empname = ParamUtil.getString(actionRequest, "empname");
		// log.info(empcode);
		String date = "";
		String mode = "";
		// String mode = ParamUtil.getString(actionRequest, "mode");

		List<AttendenceTransaction> attendence = null;
		EmpMaster empMaster = null;

		if (Validator.isNotNull(empcode)) {
			try {
				empMaster = EmpMasterLocalServiceUtil.getEmpMaster(empcode);
			} catch (Exception e) {
				log.error("NoSuchAttendenceTransactionException");
			}
			if (Validator.isNotNull(empMaster)) {
				actionRequest.setAttribute("code", empcode);
				actionRequest.setAttribute("name", empMaster.getEmployeeName());
				actionRequest.setAttribute("mobile", empMaster.getMobile());
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				String attendenceDateTime = now.format(format);
				attendence = AttendenceTransactionLocalServiceUtil.getAttendenceTrann(empcode,
						attendenceDateTime.substring(0, 10));
				if (Validator.isNotNull(attendence)) {
					log.debug("attendence found - " + attendence);
					for (AttendenceTransaction a : attendence) {
						date = a.getAttendenceDateTime().substring(0, 10);
						mode = a.getAttendenceMode();
					}
					if (attendenceDateTime.substring(0, 10).equalsIgnoreCase(date)) {
						// log.info(attendenceDateTime.substring(0, 10)+" =
						// "+date);
						actionRequest.setAttribute("submit", "ok");
						actionRequest.setAttribute("mode", mode);
					}
				}
				actionResponse.setRenderParameter("mvcPath", "/attendence.jsp");
			} else {
				actionResponse.setRenderParameter("mvcPath", "/view.jsp");
			}
		}
		hideDefaultLiferayErrorMessage(actionRequest);
	}

	@ProcessAction(name = "emp")
	public void registerEmp(ActionRequest actionRequest, ActionResponse actionResponse) {

		String empcode = ParamUtil.getString(actionRequest, "empcode");
		String empname = ParamUtil.getString(actionRequest, "empname");
		String mobile = ParamUtil.getString(actionRequest, "mobile");
		String attendenceMode = ParamUtil.getString(actionRequest, "attendenceMode");
		// log.info(attendenceMode);
		AttendenceTransaction attendence = null;
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String attendenceDateTime = now.format(format);
		EmpMaster empMaster = null;
		
		try {
			empMaster = EmpMasterLocalServiceUtil.getEmpMaster(empcode);
		} catch (Exception e) {
			log.info("NoSuchEmpMasterException");
		}

		Long caId = Long.valueOf(CounterLocalServiceUtil.increment());

		attendence = AttendenceTransactionLocalServiceUtil.createAttendenceTransaction("" + caId);
		attendence.setEmployeeCode(empcode);
		attendence.setEmployeeName(empname);
		attendence.setMobile(mobile);
		attendence.setUserDefined1(empMaster.getUserDefined1());
		attendence.setUserDefined2(empMaster.getUserDefined2());
		attendence.setAttendenceMode(attendenceMode);
		attendence.setAttendenceDateTime(attendenceDateTime);
		attendence = AttendenceTransactionLocalServiceUtil.addAttendenceTransaction(attendence);
		actionRequest.setAttribute("code", empcode);
		actionRequest.setAttribute("name", empname);
		actionRequest.setAttribute("mode", attendenceMode);

		SessionMessages.add(actionRequest, "request-submitted");
		actionRequest.setAttribute("requestMsg", "Your Attendence has been submitted.");
		actionResponse.setRenderParameter("mvcPath", "/attendence.jsp");

		// Cookie code = new Cookie("empcode", empcode);
		// Cookie name = new Cookie("empname", empname);
		//
		//
		// // Add both the cookies in the response header.
		// actionResponse.addCookie(code);
		// actionResponse.addCookie( name );

		hideDefaultLiferayErrorMessage(actionRequest);
	}

	@ProcessAction(name = "getEmp")
	public void register(ActionRequest actionRequest, ActionResponse actionResponse) {

		String empcode = ParamUtil.getString(actionRequest, "empcode");
		String otp = ParamUtil.getString(actionRequest, "otp");

		// EmpOtpMaster otpMaster = null;
		EmpMaster empMaster = null;
		try {
			empMaster = EmpMasterLocalServiceUtil.getEmpMaster(empcode);
			// otpMaster =
			// EmpOtpMasterLocalServiceUtil.getEmpOtpMaster(empMaster.getMobile());
			// log.info(otpMaster);
		} catch (PortalException e) {
			log.error(e);
			// e.printStackTrace();
		}

		actionRequest.setAttribute("emp", empMaster);
		actionRequest.setAttribute("code", empMaster.getEmployeeCode());
		actionRequest.setAttribute("name", empMaster.getEmployeeName());
		actionRequest.setAttribute("mobile", empMaster.getMobile());
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formatDateTime = now.format(format);
		List<AttendenceTransaction> attendence = null;
		String dateTime = "";
		String mode = "";
		// log.info(empcode);
		try {
			attendence = AttendenceTransactionLocalServiceUtil.getAttendenceTrann(empcode,
					formatDateTime.substring(0, 10));
			// log.info(attendence);
		} catch (Exception e) {
			log.info(e.getMessage());
			// e.printStackTrace();
		}
		if (Validator.isNotNull(attendence)) {
			// log.info(dateTime);
			for (AttendenceTransaction a : attendence) {
				mode = a.getAttendenceMode();
				dateTime = a.getAttendenceDateTime();
			}
			if (dateTime != "" || !dateTime.isEmpty()) {
				if (dateTime.substring(0, 2).equalsIgnoreCase(formatDateTime.substring(0, 2))) {
					actionRequest.setAttribute("submit", "ok");
					actionRequest.setAttribute("mode", mode);
				}
			}
		}
		actionResponse.setRenderParameter("mvcPath", "/attendence.jsp");
		hideDefaultLiferayErrorMessage(actionRequest);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		String resourceId = resourceRequest.getResourceID();
		// log.info(resourceId);

		if ("checkOtp".equalsIgnoreCase(resourceId)) {

			String empcode = ParamUtil.getString(resourceRequest, "empcode");
			String otp = ParamUtil.getString(resourceRequest, "otp");

			EmpOtpMaster otpMaster = null;
			EmpMaster empMaster = null;
			try {
				empMaster = EmpMasterLocalServiceUtil.getEmpMaster(empcode);
				otpMaster = EmpOtpMasterLocalServiceUtil.getEmpOtpMaster(empMaster.getMobile());
				// log.info(otpMaster);
			} catch (PortalException e) {
				log.error(e);
				// e.printStackTrace();
			}
			if (Validator.isNotNull(otpMaster)) {
				if (otpMaster.getOtp().equalsIgnoreCase(otp)) {
					PrintWriter out = resourceResponse.getWriter();
					JSONObject json = JSONFactoryUtil.createJSONObject();
					json.put("otp", "valid");
					out.write(json.toString());
					// out.write("no");
					out.flush();
					out.close();

				} else {
					resourceRequest.setAttribute("otpError", "Invalid Otp");
					PrintWriter out = resourceResponse.getWriter();
					JSONObject json = JSONFactoryUtil.createJSONObject();
					json.put("otp", "inValid");
					out.write(json.toString());
					// out.write("no");
					out.flush();
					out.close();
				}
			}

		}

		if ("sendOtp".equalsIgnoreCase(resourceId)) {
			String empCode = resourceRequest.getParameter("empCode");
			// String empcode = ParamUtil.getString(resourceRequest, "empcode");
			// log.info(empCode);
			EmpMaster empMaster = null;
			if (Validator.isNotNull(empCode)) {
				try {

					empMaster = EmpMasterLocalServiceUtil.getEmpMaster(empCode);
				} catch (Exception e) {
					resourceRequest.setAttribute("empCode", "Please Enter valid EmployeeCode.");
					log.error(" No EmpMaster exists with the primary key " + empCode);

					super.serveResource(resourceRequest, resourceResponse);
					// e.printStackTrace();
				}
			}
			// log.info(empMaster);
			if (Validator.isNotNull(empMaster)) {
				String mobile = empMaster.getMobile();

				if (Validator.isNotNull(mobile)) {
					String otp = "" + generateOTP();
					String msg = "Your One Time Password is #P_OTP#. Do not share this OTP to anyone for security reasons.";
					msg = msg.replace("#P_OTP#", otp);
					// log.info(msg);
					boolean smsSend = sendSMS(mobile, msg);
					//log.info(smsSend);
					if (smsSend) {
						EmpOtpMaster otpMaster = null;
						try {
							otpMaster = EmpOtpMasterLocalServiceUtil.getEmpOtpMaster(mobile);
						} catch (PortalException e) {
							log.error("No EmpOtpMaster exists with the primary key "+mobile);
							// e.printStackTrace();
						}
						if (Validator.isNotNull(otpMaster)) {
							otpMaster.setOtp(otp);
							otpMaster = EmpOtpMasterLocalServiceUtil.updateEmpOtpMaster(otpMaster);
							// log.info(otpMaster);
						} else {
							otpMaster = EmpOtpMasterLocalServiceUtil.createEmpOtpMaster(mobile);
							otpMaster.setOtp(otp);
							otpMaster = EmpOtpMasterLocalServiceUtil.addEmpOtpMaster(otpMaster);
						}
						// log.info(otpMaster);
						resourceRequest.setAttribute("empCode", empCode);
						resourceRequest.setAttribute("mobile", mobile);
						resourceRequest.setAttribute("showOTP", Boolean.valueOf(true));
						PrintWriter out = resourceResponse.getWriter();
						JSONObject json = JSONFactoryUtil.createJSONObject();
						json.put("mobile", mobile);
						json.put("sms", "send");
						out.write(json.toString());
						// out.write("send");
						// out.write(mobile);
						out.flush();
						out.close();
					}else{
						PrintWriter out = resourceResponse.getWriter();
						JSONObject json = JSONFactoryUtil.createJSONObject();
						json.put("sms", "no");
						out.write(json.toString());
						// out.write("no");
						out.flush();
						out.close();
					}
				}
			} else {
				resourceRequest.setAttribute("empCode", "Please Enter valid EmployeeCode.");
				PrintWriter out = resourceResponse.getWriter();
				JSONObject json = JSONFactoryUtil.createJSONObject();
				json.put("code", "no");
				out.write(json.toString());
				// out.write("no");
				out.flush();
				out.close();
			}
		}
		hideDefaultLiferayErrorMessage(resourceRequest);
		super.serveResource(resourceRequest, resourceResponse);
		

	}

	public boolean sendSMS(String mobileNumber, String sMSBody) {

		String encodedURL = "https://japi.instaalerts.zone/failsafe/HttpLink?aid=508443&pin=bses@56&signature=BSESRP";
		String SmsMobileParamObj = "mnumber";
		String SmsMsgParamObj = "message";

		try {

			StringBuffer postData = new StringBuffer(StringPool.BLANK);

			postData.append(SmsMobileParamObj).append(StringPool.EQUAL).append(mobileNumber);
			postData.append(StringPool.AMPERSAND);
			postData.append(SmsMsgParamObj).append(StringPool.EQUAL).append(URLEncoder.encode(sMSBody, "UTF-8"));

			byte[] postDataBytes = postData.toString().getBytes("UTF-8");

			URL url = new URL(encodedURL);
			HttpURLConnection uc = (HttpURLConnection) url.openConnection();

			uc.setDoOutput(true);
			uc.setRequestMethod("POST");
			uc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			uc.setRequestProperty("charset", "utf-8");
			uc.setRequestProperty("Content-Length", Integer.toString(postDataBytes.length));
			uc.getOutputStream().write(postDataBytes);
			uc.getResponseMessage();

			StringBuffer response = new StringBuffer();
			if (uc.getResponseCode() == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
				String inputLine;
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
			}
			String responseStr = response.toString();
			StringBuffer sb1 = new StringBuffer("responseStr === ");
			sb1.append(responseStr);
			log.info(sb1);

		} catch (Exception e) {
			log.error("SMS Exception - " + e.getMessage() + " - " + e);
			return false;
		}
		return true;

	}

	public long generateOTP() {
		Random random = new Random();
		return random.nextInt(9000000) + 1000000;
	}

	public void hideDefaultLiferayErrorMessage(PortletRequest request) {
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, ((LiferayPortletConfig) portletConfig).getPortletId()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
	}
}