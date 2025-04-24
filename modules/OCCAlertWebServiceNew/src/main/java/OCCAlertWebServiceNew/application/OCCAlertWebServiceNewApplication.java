package OCCAlertWebServiceNew.application;

import OCCModuleNew.model.OccMessageNew;
import OCCModuleNew.service.OccMessageNewLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import org.osgi.service.component.annotations.Component;

@ApplicationPath("/occ-multiservicenew")
@Component(immediate=true, service={Application.class})
public class OCCAlertWebServiceNewApplication
  extends Application
{
  private static Log log = LogFactoryUtil.getLog(OCCAlertWebServiceNewApplication.class);
  
  public Set<Object> getSingletons()
  {
    return Collections.singleton(this);
  }
  
  @GET
  @Path("/getMultiOCCAlert")
  @Produces({"application/json"})
  public String getMultiOCCAlert(@HeaderParam("username") String username, @HeaderParam("password") String password)
  {
    log.info("OCCAlertWebServiceNewApplication.getMultiOCCAlert()");
    boolean authorization = userAuthentication(username, password);
    log.info("authorization ::" + authorization);
    JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
    JSONObject jsonObject1 = JSONFactoryUtil.createJSONObject();
    JSONObject jsonObject2 = JSONFactoryUtil.createJSONObject();
    JSONObject jsonObject3 = JSONFactoryUtil.createJSONObject();
    JSONObject jsonObject4 = JSONFactoryUtil.createJSONObject();
    JSONObject jsonObject5 = JSONFactoryUtil.createJSONObject();
    if (authorization)
    {
      List<OccMessageNew> occMsgDetails = new ArrayList();
      occMsgDetails = OccMessageNewLocalServiceUtil.getOccMessageNews(-1, -1);
      
      //log.info("occMsgDetails ::" + occMsgDetails);
      log.info("occMsgDetails is empty :: " + Validator.isNotNull(occMsgDetails));
      boolean responseflag = false;
      int n = occMsgDetails.size() + 1;
      log.info("occMsgDetails length :: " + occMsgDetails.size());
      int count = 1;
      if (Validator.isNotNull(occMsgDetails))
      {
        for (OccMessageNew occMessageNew : occMsgDetails)
        {
          //System.out.println("count " + count);
          if (count == n - 5)
          {
            String MsgSendDate = occMessageNew.getMSgSendDate().toString();
            String severity1 = occMessageNew.getSeverity();
            String[] data = MsgSendDate.split("\\s+");
            String date1 = data[0];
            String time1 = data[1];
            String msg1 = occMessageNew.getMessage();
            String listName1 = setCode(occMessageNew.getListName());
            String msgId1 = String.valueOf(occMessageNew.getMSG_ID());
            jsonObject1.put("msgId", msgId1);
            jsonObject1.put("date", date1);
            jsonObject1.put("time", time1);
            jsonObject1.put("textOfMsg", msg1);
            jsonObject1.put("code", listName1);
            jsonObject1.put("severity", severity1);
          }
          else if (count == n - 1)
          {
            String MsgSendDate = occMessageNew.getMSgSendDate().toString();
            String severity2 = occMessageNew.getSeverity();
            String[] data = MsgSendDate.split("\\s+");
            String date2 = data[0];
            String time2 = data[1];
            String msg2 = occMessageNew.getMessage();
            String listName2 = setCode(occMessageNew.getListName());
            String msgId2 = String.valueOf(occMessageNew.getMSG_ID());
            jsonObject2.put("msgId", msgId2);
            jsonObject2.put("date", date2);
            jsonObject2.put("time", time2);
            jsonObject2.put("textOfMsg", msg2);
            jsonObject2.put("code", listName2);
            jsonObject2.put("severity", severity2);
          }
          else if (count == n - 2)
          {
            String MsgSendDate = occMessageNew.getMSgSendDate().toString();
            String severity3 = occMessageNew.getSeverity();
            String[] data = MsgSendDate.split("\\s+");
            String date3 = data[0];
            String time3 = data[1];
            String msg3 = occMessageNew.getMessage();
            String listName3 = setCode(occMessageNew.getListName());
            String msgId3 = String.valueOf(occMessageNew.getMSG_ID());
            jsonObject3.put("msgId", msgId3);
            jsonObject3.put("date", date3);
            jsonObject3.put("time", time3);
            jsonObject3.put("textOfMsg", msg3);
            jsonObject3.put("code", listName3);
            jsonObject3.put("severity", severity3);
          }
          else if (count == n - 3)
          {
            String MsgSendDate = occMessageNew.getMSgSendDate().toString();
            String severity4 = occMessageNew.getSeverity();
            String[] data = MsgSendDate.split("\\s+");
            String date4 = data[0];
            String time4 = data[1];
            String msg4 = occMessageNew.getMessage();
            String listName4 = setCode(occMessageNew.getListName());
            String msgId4 = String.valueOf(occMessageNew.getMSG_ID());
            jsonObject4.put("msgId", msgId4);
            jsonObject4.put("date", date4);
            jsonObject4.put("time", time4);
            jsonObject4.put("textOfMsg", msg4);
            jsonObject4.put("code", listName4);
            jsonObject4.put("severity", severity4);
          }
          else if (count == n - 4)
          {
            String MsgSendDate = occMessageNew.getMSgSendDate().toString();
            String severity5 = occMessageNew.getSeverity();
            String[] data = MsgSendDate.split("\\s+");
            String date5 = data[0];
            String time5 = data[1];
            String msg5 = occMessageNew.getMessage();
            String listName5 = setCode(occMessageNew.getListName());
            String msgId5 = String.valueOf(occMessageNew.getMSG_ID());
            jsonObject5.put("msgId", msgId5);
            jsonObject5.put("date", date5);
            jsonObject5.put("time", time5);
            jsonObject5.put("textOfMsg", msg5);
            jsonObject5.put("code", listName5);
            jsonObject5.put("severity", severity5);
          }
          count++;
        }
      }
      else
      {
        responseflag = false;
        jsonObject.put("ERROR", "No User Found !");
      }
      return "[" + jsonObject2.toJSONString() + "," + jsonObject3.toJSONString() + "," + jsonObject4.toJSONString() + "," + jsonObject5.toJSONString() + "," + jsonObject1.toJSONString() + "]";
    }
    jsonObject.put("Authentication", "failed");
    return jsonObject.toJSONString();
  }
  
  @GET
  @Path("/getOCCAlertNew")
  @Produces({"application/json"})
  public String getOCCAlert(@HeaderParam("username") String username, @HeaderParam("password") String password)
  {
    log.info("OccAlertWebService.getUserInfo()");
    
    boolean authorization = userAuthentication(username, password);
    
    log.info("authorization ::" + authorization);
    JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
    if (authorization)
    {
      List<OccMessageNew> occMsgDetails = new ArrayList();
      
      occMsgDetails = OccMessageNewLocalServiceUtil.getOccMessageNews(-1, -1);
      
      log.info("occMsgDetails is empty :: " + Validator.isNotNull(occMsgDetails));
      String date = "";
      String time = "";
      String msg = "";
      String listName = "";
      String msgId = "";
      String severity = "";
      boolean responseflag = false;
      log.info("occMsgDetails length :: " + occMsgDetails.size());
      int count = 0;
      if (Validator.isNotNull(occMsgDetails))
      {
        for (OccMessageNew occMsgDetail : occMsgDetails)
        {
          count++;
          if (count == occMsgDetails.size())
          {
            String MsgSendDate = occMsgDetail.getMSgSendDate().toString();
            severity = occMsgDetail.getSeverity();
            String[] data = MsgSendDate.split("\\s+");
            date = data[0];
            time = data[1];
            log.info("code ::" + occMsgDetail.getListName());
            listName = setCode(occMsgDetail.getListName());
            log.info("List:: " + listName);
            
            msg = occMsgDetail.getMessage();
            log.info("msg::" + msg);
            msgId = String.valueOf(occMsgDetail.getMSG_ID());
            log.info("msgId::" + msgId);
            responseflag = true;
            break;
          }
        }
      }
      else
      {
        responseflag = false;
        jsonObject.put("ERROR", "No User Found !");
      }
      if (responseflag)
      {
        log.info("creating Msg Response");
        jsonObject.put("msgId", msgId);
        jsonObject.put("date", date);
        jsonObject.put("time", time);
        jsonObject.put("textOfMsg", msg);
        jsonObject.put("code", listName);
        jsonObject.put("severity", severity);
        log.info("jsonObject " + jsonObject.toJSONString());
      }
      return "[" + jsonObject.toJSONString() + "]";
    }
    jsonObject.put("Authentication", "failed");
    return jsonObject.toJSONString();
  }
  
  public boolean userAuthentication(String username, String password)
  {
    if (("occadmin".equals(username)) && ("@cc@dm!n".equals(password))) {
      return true;
    }
    return false;
  }
  
  public String setCode(String code)
  {
    String responseCode = "";
    if (code.contains("G1"))
    {
      responseCode = "A";
      return responseCode;
    }
    if (code.contains("G2"))
    {
      responseCode = "B";
      return responseCode;
    }
    if (code.contains("MOOPL Group"))
    {
      responseCode = "C";
      return responseCode;
    }
    if (code.contains("Testing-1"))
    {
      responseCode = "D";
      return responseCode;
    }
    if (code.contains("Testing-2"))
    {
      responseCode = "E";
      return responseCode;
    }
    return responseCode;
  }
}
