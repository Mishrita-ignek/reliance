package attendence.rinfra.scheduler.portlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletConfig;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.JavaConstants;
import com.liferay.portal.kernel.util.StringPool;
import com.relianceada.energy.portal.email.api.EmailApi;

import attendence.rinfra.scheduler.constants.AttendenceRinfraSchedulerPortletKeys;
import attendence.rinfra.scheduler.report.RinfraAttendenceReport;
import attendence.rinfra.services.model.AttendenceTransaction;
import attendence.rinfra.services.model.EmpMaster;
import attendence.rinfra.services.service.AttendenceTransactionLocalServiceUtil;
import attendence.rinfra.services.service.EmpMasterLocalServiceUtil;

/**
 * @author CBT151521
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.display-name=attendence-rinfra-scheduler Portlet",
		"javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AttendenceRinfraSchedulerPortletKeys.AttendenceRinfraScheduler,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class AttendenceRinfraSchedulerPortlet extends MVCPortlet {

	private EmailApi emailServiceApi;

	@Reference
	public void setEmailApi(EmailApi emailServiceApi) {
		this.emailServiceApi = emailServiceApi;
	}

	private static final Log log = LogFactoryUtil.getLog(AttendenceRinfraSchedulerPortlet.class);

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		List<EmpMaster> empMasterList = EmpMasterLocalServiceUtil.getEmpMasters(-1, -1);
		// log.info(empMasterList);

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateTime = now.format(format);
		String dateTime1 = now.format(format1);
		List<String> codeList = new ArrayList<String>();

		List<AttendenceTransaction> attendenceList = AttendenceTransactionLocalServiceUtil
				.getAttendenceTrann(dateTime.substring(0, 10));
		// log.info(attendenceList);
		//List<AttendenceTransaction> transactionList = new ArrayList<AttendenceTransaction>();

		// for (AttendenceTransaction t : attendenceList) {
		// if (!"Present".equalsIgnoreCase(t.getAttendenceMode())) {
		// transactionList.add(t);
		// // codeList.add(t.getEmployeeCode());
		// }
		// }

		// log.info(transactionList);
		RinfraAttendenceReport attendenceReport = null;
		//List<RinfraAttendenceReport> attendenceReportlist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> defencelist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> eClist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> metrolist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> delhiMetrolist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> roadslist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> corporatelist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> airportlist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> transmissionlist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> brpllist = new ArrayList<RinfraAttendenceReport>();
		List<RinfraAttendenceReport> bypllist = new ArrayList<RinfraAttendenceReport>();

		for (AttendenceTransaction a : attendenceList) {
			if (!"Present".equalsIgnoreCase(a.getAttendenceMode())) {
				if ("Defence".equalsIgnoreCase(a.getUserDefined2())) {

					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode(a.getAttendenceMode());
					attendenceReport.setDateAndTime(a.getAttendenceDateTime());

					defencelist.add(attendenceReport);
					codeList.add(a.getEmployeeCode());
				} else if ("E&C".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode(a.getAttendenceMode());
					attendenceReport.setDateAndTime(a.getAttendenceDateTime());

					eClist.add(attendenceReport);
					codeList.add(a.getEmployeeCode());
				} else if ("Mumbai Metro".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode(a.getAttendenceMode());
					attendenceReport.setDateAndTime(a.getAttendenceDateTime());

					metrolist.add(attendenceReport);
					codeList.add(a.getEmployeeCode());
				} else if ("Delhi Metro".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					delhiMetrolist.add(attendenceReport);
				} else if ("Roads".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode(a.getAttendenceMode());
					attendenceReport.setDateAndTime(a.getAttendenceDateTime());

					roadslist.add(attendenceReport);
					codeList.add(a.getEmployeeCode());
				} else if ("Corporate".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode(a.getAttendenceMode());
					attendenceReport.setDateAndTime(a.getAttendenceDateTime());

					corporatelist.add(attendenceReport);
					codeList.add(a.getEmployeeCode());
				} else if ("Aviation".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode(a.getAttendenceMode());
					attendenceReport.setDateAndTime(a.getAttendenceDateTime());

					airportlist.add(attendenceReport);
					codeList.add(a.getEmployeeCode());
				} else if ("Transmission".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode(a.getAttendenceMode());
					attendenceReport.setDateAndTime(a.getAttendenceDateTime());

					transmissionlist.add(attendenceReport);
					codeList.add(a.getEmployeeCode());
				} else if ("BRPL".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode(a.getAttendenceMode());
					attendenceReport.setDateAndTime(a.getAttendenceDateTime());

					brpllist.add(attendenceReport);
					codeList.add(a.getEmployeeCode());
				} else if ("BYPL".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode(a.getAttendenceMode());
					attendenceReport.setDateAndTime(a.getAttendenceDateTime());

					bypllist.add(attendenceReport);
					codeList.add(a.getEmployeeCode());
				}
			}else{
				codeList.add(a.getEmployeeCode());
			}
		}

		// log.info(eClist);
		// log.info(codeList);

		for (EmpMaster a : empMasterList) {
			if (!codeList.contains(a.getEmployeeCode())) {
				if ("Defence".equalsIgnoreCase(a.getUserDefined2())) {

					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					defencelist.add(attendenceReport);
				} else if ("E&C".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					eClist.add(attendenceReport);
				} else if ("Mumbai Metro".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					metrolist.add(attendenceReport);
				} else if ("Delhi Metro".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					delhiMetrolist.add(attendenceReport);
				} else if ("Roads".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					roadslist.add(attendenceReport);
				} else if ("Corporate".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					corporatelist.add(attendenceReport);
				} else if ("Aviation".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					airportlist.add(attendenceReport);
				} else if ("Transmission".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					transmissionlist.add(attendenceReport);
				} else if ("BRPL".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					brpllist.add(attendenceReport);
				} else if ("BYPL".equalsIgnoreCase(a.getUserDefined2())) {
					attendenceReport = new RinfraAttendenceReport();
					attendenceReport.setCode(a.getEmployeeCode());
					attendenceReport.setName(a.getEmployeeName());
					attendenceReport.setMobile(a.getMobile());
					attendenceReport.setGrade(a.getUserDefined1());
					attendenceReport.setMode("");
					attendenceReport.setDateAndTime("");

					bypllist.add(attendenceReport);
				}
			}
		}

		Map<String, List<RinfraAttendenceReport>> map = new HashMap<>();
		map.put("Defence", defencelist);
		map.put("E&C", eClist);
		map.put("Mumbai Metro", metrolist);
		map.put("Roads", roadslist);
		map.put("Corporate", corporatelist);
		map.put("Airport & Aviation", airportlist);
		map.put("Transmission", transmissionlist);
		map.put("BRPL", brpllist);
		map.put("BYPL", bypllist);
		//map.put("Delhi Metro", delhiMetrolist);

		// log.info(map);

		// for (AttendenceTransaction a : attendenceList) {
		// for (EmpMaster e : empMasterList) {
		// if (!a.getEmployeeCode().equalsIgnoreCase(e.getEmployeeCode())) {
		//
		// attendenceReport = new RinfraAttendenceReport();
		// attendenceReport.setCode(a.getEmployeeCode());
		// attendenceReport.setName(a.getEmployeeName());
		// attendenceReport.setMobile(a.getMobile());
		// attendenceReport.setMode(a.getAttendenceMode());
		// attendenceReport.setDateAndTime(a.getAttendenceDateTime());
		//
		// codeList.add(a.getEmployeeCode());
		// attendenceReportlist.add(attendenceReport);
		// }
		// }
		// }

		/*
		 * if (Validator.isNotNull(attendenceList)) { for (AttendenceTransaction
		 * a : attendenceList) { attendenceReport = new
		 * RinfraAttendenceReport();
		 * attendenceReport.setCode(a.getEmployeeCode());
		 * attendenceReport.setName(a.getEmployeeName());
		 * attendenceReport.setMobile(a.getMobile());
		 * attendenceReport.setMode(a.getAttendenceMode());
		 * attendenceReport.setDateAndTime(a.getAttendenceDateTime());
		 * 
		 * codeList.add(a.getEmployeeCode());
		 * attendenceReportlist.add(attendenceReport); } }
		 * 
		 * if (codeList.isEmpty()) { for (EmpMaster emp : empMasterList) {
		 * attendenceReport = new RinfraAttendenceReport();
		 * attendenceReport.setCode(emp.getEmployeeCode());
		 * attendenceReport.setName(emp.getEmployeeName());
		 * attendenceReport.setMobile(emp.getMobile());
		 * attendenceReport.setMode(""); attendenceReport.setDateAndTime("");
		 * 
		 * attendenceReportlist.add(attendenceReport); } } else { for (EmpMaster
		 * emp : empMasterList) { if (!codeList.contains(emp.getEmployeeCode()))
		 * { attendenceReport = new RinfraAttendenceReport();
		 * attendenceReport.setCode(emp.getEmployeeCode());
		 * attendenceReport.setName(emp.getEmployeeName());
		 * attendenceReport.setMobile(emp.getMobile());
		 * attendenceReport.setMode(""); attendenceReport.setDateAndTime("");
		 * 
		 * attendenceReportlist.add(attendenceReport); } } }
		 */
		// log.info(attendenceReportlist);

		File file = null;
		try {

			String[] columnNames = { "Employee Code, Name, Grade, Mobile No, Attendence Mode, Date And Time" };

			file = generateExcel(columnNames, map, "Rinfra Attendence Report");

			StringBuffer sb = new StringBuffer();

			// sb.append(new
			// StringBuilder(AttendenceRinfraSchedulerPortletKeys.MESSAGE1).toString());
			// sb.append(System.getProperty("line.separator"));
			sb.append(new StringBuilder(AttendenceRinfraSchedulerPortletKeys.MESSAGE + dateTime1).toString());
			// log.info(sb);
			String message = (new StringBuilder()).append(sb.toString()).toString();
			StringWriter outputWriter = new StringWriter();
			outputWriter.write(message);

			String[] address = AttendenceRinfraSchedulerPortletKeys.TOMAILID.split(",");
			for (String toMail : address) {
				emailServiceApi.reportSendEmailWithTemplateAndAttachement(
						AttendenceRinfraSchedulerPortletKeys.FROMMAILID, toMail,
						AttendenceRinfraSchedulerPortletKeys.BCCMAILID,
						AttendenceRinfraSchedulerPortletKeys.SUBJECT + dateTime1, outputWriter, file);
				// log.info(AttendenceRinfraSchedulerPortletKeys.SUBJECT+dateTime1);
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		super.render(renderRequest, renderResponse);
	}

	public File generateExcel(String[] columnNames, Map<String, List<RinfraAttendenceReport>> map, String sheetName) {

		File csvFile = createNewCSVFile(sheetName);
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(csvFile);
			// creating header
			for (String columnHeader : columnNames) {

				fileWriter.append(columnHeader);
				fileWriter.append(StringPool.COMMA);
			}
			fileWriter.append(StringPool.NEW_LINE);
			// creating data
			Object[][] tableData = null;

			if (map.isEmpty()) {

				tableData = new Object[][] { { "null", "null", "null", "null", "null", "null", "null" } };

				for (Object[] row : tableData) {
					for (Object cell : row) {
						String cellValue = String.valueOf(cell);
						fileWriter.append(cellValue);
						fileWriter.append(StringPool.COMMA);
					}
					fileWriter.append(StringPool.NEW_LINE);
				}

			} else {
				for (Map.Entry<String, List<RinfraAttendenceReport>> entry : map.entrySet()) {
					String company = entry.getKey();
					List<RinfraAttendenceReport> reports = entry.getValue();

					fileWriter.append(StringPool.BLANK);
					fileWriter.append(company);
					fileWriter.append(StringPool.NEW_LINE);

					for (RinfraAttendenceReport request : reports) {

						tableData = new Object[][] { { request.getCode(), request.getName(), request.getGrade(),
								request.getMobile(), request.getMode(), request.getDateAndTime() } };

						for (Object[] row : tableData) {
							for (Object cell : row) {
								String cellValue = String.valueOf(cell);
								fileWriter.append(cellValue);
								fileWriter.append(StringPool.COMMA);
							}
							fileWriter.append(StringPool.NEW_LINE);
						}
					}
				}
			}
			fileWriter.flush();
		} catch (Exception e) {
			log.error("Error occured in writeCsvFile " + e);
		} finally {
			try {
				if (fileWriter != null) {
					// fileWriter.flush();
					fileWriter.close();
				}
			} catch (IOException e) {
				log.error("Error occured in writeCsvFile " + e);
			}
		}
		return csvFile;
	}

	public File createNewCSVFile(String sheetName) {
		LocalDate today = LocalDate.now();
		int dd = today.getDayOfMonth();
		String date = "_" + dd + "-" + today.getMonthValue() + "-" + today.getYear() + "_";
		String fileName = sheetName + date;
		log.info("-----------------File name " + fileName);
		File file = FileUtil.createTempFile(fileName, "csv");
		// log.info(file.getAbsolutePath());
		log.info("-----------------File generated " + file);
		return file;
	}

	public void hideDefaultLiferayErrorMessage(PortletRequest request) {
		PortletConfig portletConfig = (PortletConfig) request.getAttribute(JavaConstants.JAVAX_PORTLET_CONFIG);
		SessionMessages.add(request, ((LiferayPortletConfig) portletConfig).getPortletId()
				+ SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
	}
}