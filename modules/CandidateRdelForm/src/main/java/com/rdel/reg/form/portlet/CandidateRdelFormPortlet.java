package com.rdel.reg.form.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.redlatm.form.model.CandidateForm;
import com.redlatm.form.service.CandidateFormLocalServiceUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.osgi.service.component.annotations.Component;

@Component(immediate=true, property={"com.liferay.portlet.display-category=category.sample", "com.liferay.portlet.instanceable=true", "javax.portlet.display-name=CandidateRdelForm Portlet", "javax.portlet.init-param.template-path=/", "javax.portlet.init-param.view-template=/view.jsp", "javax.portlet.resource-bundle=content.Language", "javax.portlet.security-role-ref=power-user,user"}, service={Portlet.class})
public class CandidateRdelFormPortlet
  extends MVCPortlet
{
  private static String ROOT_FOLDER_NAME = "CandidateFileUpload";
  private static String ROOT_FOLDER_DESCRIPTION = "This folder is create for Upload documents";
  private static long PARENT_FOLDER_ID = 0L;
  private static final int ONE_GB = 1073741824;
  private static final String baseDir = "/tmp/uploaded/";
  private static final String fileInputName = "uploadedFile";
  private static Log log = LogFactoryUtil.getLog(CandidateRdelFormPortlet.class);
  Long result = null;
  
  public void render(RenderRequest renderRequest, RenderResponse renderResponse)
    throws IOException, PortletException
  {
    super.render(renderRequest, renderResponse);
  }
  
  @ProcessAction(name="updateCandidateForm")
  public void updateCandidateApplicationForm(ActionRequest actionRequest, ActionResponse actionResponse)
    throws Exception
  {
    log.info("CandidateRegFormPortlet.saveCandidateApplicationForm()");
    
    Long caId = Long.valueOf(Long.parseLong(actionRequest.getParameter("caId")));
    String name = actionRequest.getParameter("firstName");
    String surname = actionRequest.getParameter("surname");
    String fatherOrSpouse = actionRequest.getParameter("fatherOrSpouse");
    String AadharNo = actionRequest.getParameter("AadharNo");
    String panNumber = actionRequest.getParameter("panNumber");
    String BankAcNo = actionRequest.getParameter("BankAcNo");
    String EmpExResgnNo = actionRequest.getParameter("EmpExResgnNo");
    String dob = actionRequest.getParameter("dob");
    String NativeLoc = actionRequest.getParameter("NativeLoc");
    String motherTongue = actionRequest.getParameter("motherTongue");
    String identificationMark = actionRequest.getParameter("identificationMark");
    String domicile = actionRequest.getParameter("domicile");
    String languagesKnown = actionRequest.getParameter("languagesKnown");
    
    String Company = actionRequest.getParameter("Company");
    String location = actionRequest.getParameter("location");
    String Role = actionRequest.getParameter("Role");
    String fromEx = actionRequest.getParameter("fromEx");
    String toEx = actionRequest.getParameter("toEx");
    String reasonLeaving = actionRequest.getParameter("reasonLeaving");
    
    String ph_State = actionRequest.getParameter("ph_State");
    String religion = actionRequest.getParameter("religion");
    String caste = actionRequest.getParameter("caste");
    String subCast = actionRequest.getParameter("subCast");
    String mrtOption = actionRequest.getParameter("mrtOption");
    String ableToJoin = actionRequest.getParameter("joinOption");
    String npMonth = actionRequest.getParameter("npMonth");
    String npDays = actionRequest.getParameter("npDays");
    String Address = actionRequest.getParameter("Address");
    String city = actionRequest.getParameter("city");
    String InState = actionRequest.getParameter("InState");
    String pinNumber = actionRequest.getParameter("pinNumber");
    String emailId = actionRequest.getParameter("emailId");
    log.info(" Email : " + emailId);
    String AlEmailId = actionRequest.getParameter("AlEmailId");
    String mobNumberber = actionRequest.getParameter("mobNumberber");
    String AlMobNumberber = actionRequest.getParameter("AlMobNumberber");
    String ALPersonName = actionRequest.getParameter("ALPersonName");
    
    String mainQualification = actionRequest.getParameter("mainQualification");
    String OtherQaul = actionRequest.getParameter("OtherQaul");
    if ("Other".equals(mainQualification)) {
      mainQualification = OtherQaul;
    }
    String specialization = actionRequest.getParameter("specialization");
    String trade = actionRequest.getParameter("trade");
    String totalExp = actionRequest.getParameter("totalExp");
    String skillLevel = actionRequest.getParameter("skillLevel");
    String scFrom = actionRequest.getParameter("scFrom");
    String ScvalidTill = actionRequest.getParameter("ScvalidTill");
    String docName = actionRequest.getParameter("docName");
    String docAddres = actionRequest.getParameter("docAddres");
    String docRegnNo = actionRequest.getParameter("docRegnNo");
    String mFvalidTill = actionRequest.getParameter("mFvalidTill");
    
    String CEaddress = actionRequest.getParameter("CEaddress");
    String cCompany = actionRequest.getParameter("cCompany");
    String workingSince = actionRequest.getParameter("workingSince");
    String designation = actionRequest.getParameter("designation");
    String ctcFixed = actionRequest.getParameter("ctcFixed");
    String ctcVariable = actionRequest.getParameter("ctcVariable");
    String ctcTotal = actionRequest.getParameter("ctcTotal");
    String role = actionRequest.getParameter("role");
    String Location = actionRequest.getParameter("Location");
    String npDuration = actionRequest.getParameter("npDuration");
    String f_company_name_1 = actionRequest.getParameter("f_company_name_1");
    String f_from_1 = actionRequest.getParameter("f_from_1");
    String f_to_1 = actionRequest.getParameter("f_to_1");
    String f_location_1 = actionRequest.getParameter("f_location_1");
    String f_designation_1 = actionRequest.getParameter("f_designation_1");
    String f_ctc_fixed_1 = actionRequest.getParameter("f_ctc_fixed_1");
    String f_ctc_variable_1 = actionRequest.getParameter("f_ctc_variable_1");
    String f_ctc_total_1 = actionRequest.getParameter("f_ctc_total_1");
    String f_remark_1 = actionRequest.getParameter("f_remark_1");
    String f_company_name_2 = actionRequest.getParameter("f_company_name_2");
    String f_from_2 = actionRequest.getParameter("f_from_2");
    String f_to_2 = actionRequest.getParameter("f_to_2");
    String f_location_2 = actionRequest.getParameter("f_location_2");
    String f_designation_2 = actionRequest.getParameter("f_designation_2");
    String f_ctc_fixed_2 = actionRequest.getParameter("f_ctc_fixed_2");
    String f_ctc_variable_2 = actionRequest.getParameter("f_ctc_variable_2");
    String f_ctc_total_2 = actionRequest.getParameter("f_ctc_total_2");
    String f_remark_2 = actionRequest.getParameter("f_remark_2");
    String f_company_name_3 = actionRequest.getParameter("f_company_name_3");
    String f_from_3 = actionRequest.getParameter("f_from_3");
    String f_to_3 = actionRequest.getParameter("f_to_3");
    String f_location_3 = actionRequest.getParameter("f_location_3");
    String f_designation_3 = actionRequest.getParameter("f_designation_3");
    String f_ctc_fixed_3 = actionRequest.getParameter("f_ctc_fixed_3");
    String f_ctc_variable_3 = actionRequest.getParameter("f_ctc_variable_3");
    String f_ctc_total_3 = actionRequest.getParameter("f_ctc_total_3");
    String f_remark_3 = actionRequest.getParameter("f_remark_3");
    String f_company_name_4 = actionRequest.getParameter("f_company_name_4");
    String f_from_4 = actionRequest.getParameter("f_from_4");
    String f_to_4 = actionRequest.getParameter("f_to_4");
    String f_location_4 = actionRequest.getParameter("f_location_4");
    String f_designation_4 = actionRequest.getParameter("f_designation_4");
    String f_ctc_fixed_4 = actionRequest.getParameter("f_ctc_fixed_4");
    String f_ctc_variable_4 = actionRequest.getParameter("f_ctc_variable_4");
    String f_ctc_total_4 = actionRequest.getParameter("f_ctc_total_4");
    String f_remark_4 = actionRequest.getParameter("f_remark_4");
    String f_company_name_5 = actionRequest.getParameter("f_company_name_5");
    String f_from_5 = actionRequest.getParameter("f_from_5");
    String f_to_5 = actionRequest.getParameter("f_to_5");
    String f_location_5 = actionRequest.getParameter("f_location_5");
    String f_designation_5 = actionRequest.getParameter("f_designation_5");
    String f_ctc_fixed_5 = actionRequest.getParameter("f_ctc_fixed_5");
    String f_ctc_variable_5 = actionRequest.getParameter("f_ctc_variable_5");
    String f_ctc_total_5 = actionRequest.getParameter("f_ctc_total_5");
    String f_remark_5 = actionRequest.getParameter("f_remark_5");
    String f_qualification_1 = actionRequest.getParameter("f_qualification_1");
    String f_Institute_1 = actionRequest.getParameter("f_Institute_1");
    String f_year_1 = actionRequest.getParameter("f_year_1");
    String f_grade_1 = actionRequest.getParameter("f_grade_1");
    String f_qualification_2 = actionRequest.getParameter("f_qualification_2");
    String f_Institute_2 = actionRequest.getParameter("f_Institute_2");
    String f_year_2 = actionRequest.getParameter("f_year_2");
    String f_grade_2 = actionRequest.getParameter("f_grade_2");
    String f_qualification_3 = actionRequest.getParameter("f_qualification_3");
    String f_Institute_3 = actionRequest.getParameter("f_Institute_3");
    String f_year_3 = actionRequest.getParameter("f_year_3");
    String f_grade_3 = actionRequest.getParameter("f_grade_3");
    String f_qualification_4 = actionRequest.getParameter("f_qualification_4");
    String f_Institute_4 = actionRequest.getParameter("f_Institute_4");
    String f_year_4 = actionRequest.getParameter("f_year_4");
    String f_grade_4 = actionRequest.getParameter("f_grade_4");
    String f_qualification_5 = actionRequest.getParameter("f_qualification_5");
    String f_Institute_5 = actionRequest.getParameter("f_Institute_5");
    String f_year_5 = actionRequest.getParameter("f_year_5");
    String f_grade_5 = actionRequest.getParameter("f_grade_5");
    String f_qualification_10 = actionRequest.getParameter("f_qualification_10");
    String f_Institute_10 = actionRequest.getParameter("f_Institute_10");
    String f_year_10 = actionRequest.getParameter("f_year_10");
    String f_grade_10 = actionRequest.getParameter("f_grade_10");
    String f_qualification_7 = actionRequest.getParameter("f_qualification_7");
    String f_Institute_7 = actionRequest.getParameter("f_Institute_7");
    String f_year_7 = actionRequest.getParameter("f_year_7");
    String f_grade_7 = actionRequest.getParameter("f_grade_7");
    String f_qualification_8 = actionRequest.getParameter("f_qualification_8");
    String f_Institute_8 = actionRequest.getParameter("f_Institute_8");
    String f_year_8 = actionRequest.getParameter("f_year_8");
    String f_grade_8 = actionRequest.getParameter("f_grade_8");
    log.info(" Candidate CaId : " + caId);
    
    UploadPortletRequest upload = PortalUtil.getUploadPortletRequest(actionRequest);
    String fileName = upload.getFileName("file");
    fileName = caId + fileName;
    String contentType = upload.getContentType("file");
    long size = upload.getSize("file").longValue();
    log.info("size" + size);
    File tempFile = upload.getFile("file");
    log.info("tempFile" + tempFile);
    InputStream is = upload.getFileAsStream("file");
    if (Validator.isNotNull(fileName))
    {
      Date today = new Date();
      SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
      String formattedDate = formatter.format(today);
      







      Properties properties = PortalUtil.getPortalProperties();
      





      String dirPath = "/application/CandidateProfileUploads" + File.separator;
      System.out.println("dirPath ---: " + dirPath);
      File NewfileDir = new File(dirPath);
      if (!NewfileDir.exists())
      {
        log.info("FileuploadPortlet.uploadDocument()::mkdir");
        NewfileDir.mkdir();
      }
      System.out.println("NewfileDir: " + NewfileDir);
      FileUtil.copyFile(tempFile, new File(dirPath + fileName));
      FileUtil.delete(tempFile);
      log.info("success");
      SessionMessages.add(actionRequest, "success");
    }
    this.result = CandidateFormLocalServiceUtil.saveCandidateForm(caId, name, surname, fatherOrSpouse, AadharNo, panNumber, BankAcNo, EmpExResgnNo, dob, NativeLoc, motherTongue, identificationMark, domicile, languagesKnown, Company, location, Role, fromEx, toEx, reasonLeaving, ph_State, religion, caste, subCast, mrtOption, ableToJoin, npMonth, npDays, Address, city, InState, pinNumber, emailId, AlEmailId, mobNumberber, AlMobNumberber, ALPersonName, mainQualification, specialization, trade, totalExp, skillLevel, scFrom, ScvalidTill, docName, docAddres, docRegnNo, mFvalidTill, CEaddress, cCompany, workingSince, designation, ctcFixed, ctcVariable, ctcTotal, role, Location, npDuration, f_company_name_1, f_from_1, f_to_1, f_location_1, f_designation_1, f_ctc_fixed_1, f_ctc_variable_1, f_ctc_total_1, f_remark_1, f_company_name_2, f_from_2, f_to_2, f_location_2, f_designation_2, f_ctc_fixed_2, f_ctc_variable_2, f_ctc_total_2, f_remark_2, f_company_name_3, f_from_3, f_to_3, f_location_3, f_designation_3, f_ctc_fixed_3, f_ctc_variable_3, f_ctc_total_3, f_remark_3, f_company_name_4, f_from_4, f_to_4, f_location_4, f_designation_4, f_ctc_fixed_4, f_ctc_variable_4, f_ctc_total_4, f_remark_4, f_company_name_5, f_from_5, f_to_5, f_location_5, f_designation_5, f_ctc_fixed_5, f_ctc_variable_5, f_ctc_total_5, f_remark_5, f_qualification_1, f_Institute_1, f_year_1, f_grade_1, f_qualification_2, f_Institute_2, f_year_2, f_grade_2, f_qualification_3, f_Institute_3, f_year_3, f_grade_3, f_qualification_4, f_Institute_4, f_year_4, f_grade_4, f_qualification_5, f_Institute_5, f_year_5, f_grade_5, f_qualification_10, f_Institute_10, f_year_10, f_grade_10, f_qualification_7, f_Institute_7, f_year_7, f_grade_7, f_qualification_8, f_Institute_8, f_year_8, f_grade_8, fileName);
    if (this.result != null)
    {
      log.info(" UserId : " + this.result);
      log.info(" CandidateApplicationForm Submit Successfull ");
      actionResponse.setRenderParameter("mvcPath", "/jsp/thankyou.jsp");
    }
  }
  
  @ProcessAction(name="userlogin")
  public void userlogin(ActionRequest actionRequest, ActionResponse actionResponse)
  {
    List<CandidateForm> candidateList = null;
    try
    {
      String username = ParamUtil.getString(actionRequest, "username");
      String password = ParamUtil.getString(actionRequest, "password");
      
      candidateList = CandidateFormLocalServiceUtil.validateUserLoginService(username, password);
      if (candidateList != null)
      {
        PortletSession sessionScope = actionRequest.getPortletSession();
        sessionScope.setAttribute("candidateForm", candidateList, 1);
        actionRequest.setAttribute("candidateForm", candidateList);
        actionRequest.setAttribute("successfullyLogin", "Welcome");
        actionResponse.setRenderParameter("mvcPath", "/jsp/candidatehome.jsp");
      }
      else
      {
        actionResponse.setRenderParameter("msg", "0");
        actionResponse.setRenderParameter("mvcPath", "/jsp/candidate_login.jsp");
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  @ProcessAction(name="candidatechangepassword")
  public void candidatechangepassword(ActionRequest actionRequest, ActionResponse actionResponse)
  {
    String result = "";
    try
    {
      String oldpassword = ParamUtil.getString(actionRequest, "oldpassword");
      String password = ParamUtil.getString(actionRequest, "password");
      String passwordconfirmation = ParamUtil.getString(actionRequest, "passwordconfirmation");
      String emailId = ParamUtil.getString(actionRequest, "emailId");
      
      result = CandidateFormLocalServiceUtil.setCandidatePasswordServiceImpl(oldpassword, password, emailId);
      if (result == "SUCCESS")
      {
        actionRequest.setAttribute("changePassResponse", "Your password has been sucessfully reset.");
        actionResponse.setRenderParameter("mvcPath", "/jsp/candidatehome.jsp");
      }
      else
      {
        actionRequest.setAttribute("changePassWrongResponse", "Entered Old Password is Wrong.");
        actionResponse.setRenderParameter("mvcPath", "/jsp/candidate_changepassword.jsp");
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  @ProcessAction(name="forgotpassword")
  public void forgotpassword(ActionRequest actionRequest, ActionResponse actionResponse)
  {
    String emailId = "";
    String pwd = "";
    String msg = "Email id does not exists.!";
    try
    {
      String email = ParamUtil.getString(actionRequest, "email");
      List<CandidateForm> emailList = CandidateFormLocalServiceUtil.getValidateCandidateEmailServiceImpl(email);
      if (emailList.isEmpty())
      {
        actionRequest.setAttribute("incorrectemail", msg);
        actionResponse.setRenderParameter("mvcPath", "/jsp/candidate_forgetpassword.jsp");
      }
      else
      {
        for (CandidateForm candidateApplicationForm : emailList)
        {
          emailId = candidateApplicationForm.getEmailAddress();
          pwd = candidateApplicationForm.getPassword();
        }
        if (email.equals(emailId))
        {
          actionResponse.setRenderParameter("mvcPath", "/jsp/candidate_login.jsp");
        }
        else
        {
          actionRequest.setAttribute("incorrectemail", msg);
          actionResponse.setRenderParameter("mvcPath", "/jsp/candidate_forgetpassword.jsp");
        }
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  @ProcessAction(name="logout")
  public void logout(ActionRequest actionRequest, ActionResponse actionResponse)
  {
    PortletSession portletSession = actionRequest.getPortletSession();
    portletSession.invalidate();
    
    actionRequest.setAttribute("successfullyLogout", "Logout");
    actionResponse.setRenderParameter("mvcPath", "/jsp/candidate_login.jsp");
  }
  
  public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
    throws IOException, PortletException
  {
    String fileName = resourceRequest.getParameter("uploadFileName");
    try
    {
      File file = new File("D:/fileupload/" + fileName);
      InputStream in = new FileInputStream(file);
      HttpServletResponse httpRes = PortalUtil.getHttpServletResponse(resourceResponse);
      HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(resourceRequest);
      ServletResponseUtil.sendFile(httpReq, httpRes, file.getName(), in, "application/download");
      in.close();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  @ProcessAction(name="register")
  public void register(ActionRequest actionRequest, ActionResponse actionResponse)
  {
    String result = "";
    String existCandidate = null;
    try
    {
      String firstname = ParamUtil.getString(actionRequest, "firstname");
      String lastname = ParamUtil.getString(actionRequest, "lastname");
      String email = ParamUtil.getString(actionRequest, "email");
      String passwd = ParamUtil.getString(actionRequest, "passwd");
      String AadharNo = actionRequest.getParameter("AadharNo");
      String mobNumber = actionRequest.getParameter("mobNumberber");
      String mainQualification = actionRequest.getParameter("mainQualification");
      String OtherQaul = actionRequest.getParameter("OtherQaul");
      if ("Other".equals(mainQualification)) {
        mainQualification = OtherQaul;
      }
      String specialization = actionRequest.getParameter("specialization");
      String address = actionRequest.getParameter("Address");
      String city = actionRequest.getParameter("city");
      String InState = actionRequest.getParameter("InState");
      String pinNumber = actionRequest.getParameter("pinNumber");
      
      System.out.println("address - " + address + " || InState - " + InState);
      System.out.println("city - " + city + " || pinNumber - " + pinNumber);
      


      existCandidate = CandidateFormLocalServiceUtil.getCandidateEmailId(email);
      if ("ERROR".equals(existCandidate))
      {
        Long caId = Long.valueOf(CounterLocalServiceUtil.increment());
        CandidateForm candidateRegistrationForm = CandidateFormLocalServiceUtil.createCandidateForm(caId.longValue());
        


        candidateRegistrationForm.setFirstName(firstname);
        candidateRegistrationForm.setSurname(lastname);
        candidateRegistrationForm.setEmailAddress(email);
        candidateRegistrationForm.setPassword(passwd);
        candidateRegistrationForm.setAadharCardNo(AadharNo);
        candidateRegistrationForm.setMobile(mobNumber);
        candidateRegistrationForm.setMainQualification(mainQualification);
        candidateRegistrationForm.setSpecialization(specialization);
        candidateRegistrationForm.setAddress(address);
        candidateRegistrationForm.setCity(city);
        candidateRegistrationForm.setState(InState);
        candidateRegistrationForm.setPin(pinNumber);
        
        result = CandidateFormLocalServiceUtil.saveCandidateRegistrationForm(candidateRegistrationForm);
        if (result == "SUCCESS")
        {
          actionRequest.setAttribute("successfullyRegister", "You have Successfully Registered.");
          actionResponse.setRenderParameter("mvcPath", "/jsp/candidate_login.jsp");
        }
        else
        {
          actionResponse.setRenderParameter("mvcPath", "/jsp/error.jsp");
        }
      }
      else
      {
        actionResponse.setRenderParameter("msg", "0");
        actionResponse.setRenderParameter("mvcPath", "/view.jsp");
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
      actionResponse.setRenderParameter("mvcPath", "/jsp/error.jsp");
    }
  }
}
