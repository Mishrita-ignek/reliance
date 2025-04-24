package OccSirenAppWebService.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import OCCModuleNew.model.OccMessageNew;
import OCCModuleNew.service.OccMessageNewLocalServiceUtil;

@ApplicationPath("/sirenapp")
@Component(immediate = true, service = Application.class)
public class OccSirenAppWebServiceApplication extends Application {
	
	private static Log log=LogFactoryUtil.getLog(OccSirenAppWebServiceApplication.class);

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	 @GET
	 @Path("/getSirenApp")
	 @Produces("application/json")
	 public String getMultiOCCAlert(@HeaderParam("username")String username , @HeaderParam("password")String password) {
		 
		  log.info("OCCAlertWebServiceNewApplication.getMultiOCCAlert()");
		  boolean authorization = userAuthentication(username,password);
		  log.info("authorization ::"+authorization);
		  JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		  JSONObject jsonObject1 = JSONFactoryUtil.createJSONObject();
		  JSONObject jsonObject2 = JSONFactoryUtil.createJSONObject();
		  JSONObject jsonObject3 = JSONFactoryUtil.createJSONObject();
		  JSONObject jsonObject4 = JSONFactoryUtil.createJSONObject();
		  JSONObject jsonObject5= JSONFactoryUtil.createJSONObject();
		  if(authorization){
			  List<OccMessageNew> occMsgDetails=new ArrayList<>();
			  occMsgDetails= (List<OccMessageNew>)OccMessageNewLocalServiceUtil.getOccMessageNews(-1, -1);
			  //occMsgDetails= (List<OccMessageNew>)OccMessageNewLocalServiceUtil.getMsgsAlert();
			  log.info("occMsgDetails ::"+ occMsgDetails);
			  log.info("occMsgDetails is empty :: "+Validator.isNotNull(occMsgDetails));
			  boolean responseflag=false;
			  int n=occMsgDetails.size()+1;
			  log.info("occMsgDetails length :: "+occMsgDetails.size());
			  int count= 1;
			  String msgId1,date1,time1,msg1,listName1,severity1,msgId2,date2,time2,msg2,listName2,severity2,msgId3,date3,time3,msg3,listName3,severity3,msgId4,date4,time4,msg4,listName4,severity4,msgId5,date5,time5,msg5,listName5,severity5;
			  if(Validator.isNotNull(occMsgDetails)) {
		
				  for (OccMessageNew occMessageNew : occMsgDetails) {
					  System.out.println("count "+count);
					  if(count==(n-5)){
						  String MsgSendDate=occMessageNew.getMSgSendDate().toString();
						  severity1=occMessageNew.getSeverity();
						  String[] data = MsgSendDate.split("\\s+");
						  date1=data[0];
						  time1=data[1];
						  msg1= occMessageNew.getMessage();
						  listName1=setCode(occMessageNew.getListName());
						  msgId1=String.valueOf(occMessageNew.getMSG_ID());
					       jsonObject1.put("incid", "11");
						   jsonObject1.put("msgId", msgId1);
						   jsonObject1.put("date", date1);
						   jsonObject1.put("time", time1);
						   jsonObject1.put("textOfMsg", msg1);
						   jsonObject1.put("code", listName1);
						   jsonObject1.put("severity", severity1); 
					  }else if(count==(n-1)){
						  String MsgSendDate=occMessageNew.getMSgSendDate().toString();
						  severity2=occMessageNew.getSeverity();
						  String[] data = MsgSendDate.split("\\s+");
						  date2=data[0];
						  time2=data[1];
						  msg2= occMessageNew.getMessage();
						  listName2=setCode(occMessageNew.getListName());
						  msgId2=String.valueOf(occMessageNew.getMSG_ID());
						   jsonObject2.put("incid", "12");
						   jsonObject2.put("msgId", msgId2);
						   jsonObject2.put("date", date2);
						   jsonObject2.put("time", time2);
						   jsonObject2.put("textOfMsg", msg2);
						   jsonObject2.put("code", listName2);
						   jsonObject2.put("severity", severity2);
					  }else if(count==(n-2)){
						  String MsgSendDate=occMessageNew.getMSgSendDate().toString();
						  severity3=occMessageNew.getSeverity();
						  String[] data = MsgSendDate.split("\\s+");
						  date3=data[0];
						  time3=data[1];
						  msg3= occMessageNew.getMessage();
						  listName3=setCode(occMessageNew.getListName());
						  msgId3=String.valueOf(occMessageNew.getMSG_ID());
						   jsonObject3.put("incid", "13");
						   jsonObject3.put("msgId", msgId3);
						   jsonObject3.put("date", date3);
						   jsonObject3.put("time", time3);
						   jsonObject3.put("textOfMsg", msg3);
						   jsonObject3.put("code", listName3);
						   jsonObject3.put("severity", severity3);
					  }else if(count==(n-3)){
						  String MsgSendDate=occMessageNew.getMSgSendDate().toString();
						  severity4=occMessageNew.getSeverity();
						  String[] data = MsgSendDate.split("\\s+");
						  date4=data[0];
						  time4=data[1];
						  msg4= occMessageNew.getMessage();
						  listName4=setCode(occMessageNew.getListName());
						  msgId4=String.valueOf(occMessageNew.getMSG_ID());
						   jsonObject4.put("incid", "14");
						   jsonObject4.put("msgId", msgId4);
						   jsonObject4.put("date", date4);
						   jsonObject4.put("time", time4);
						   jsonObject4.put("textOfMsg", msg4);
						   jsonObject4.put("code", listName4);
						   jsonObject4.put("severity", severity4);
					  }else if(count==(n-4)){
						  String MsgSendDate=occMessageNew.getMSgSendDate().toString();
						  severity5=occMessageNew.getSeverity();
						  String[] data = MsgSendDate.split("\\s+");
						  date5=data[0];
						  time5=data[1];
						  msg5= occMessageNew.getMessage();
						  listName5=setCode(occMessageNew.getListName());
						  msgId5=String.valueOf(occMessageNew.getMSG_ID());
						   
						   jsonObject5.put("msgId", msgId5);
						   jsonObject5.put("date", date5);
						   jsonObject5.put("incid", "15");
						   jsonObject5.put("time", time5);
						   jsonObject5.put("textOfMsg", msg5);
						   jsonObject5.put("code", listName5);
						   jsonObject5.put("severity", severity5);
					  }
					   count++;
				}
			  }else{
				  responseflag=false;
				  jsonObject.put("ERROR", "No User Found !");
			  }
			  return "["+jsonObject2.toJSONString()+","+jsonObject3.toJSONString()+","+jsonObject4.toJSONString()+","+jsonObject5.toJSONString()+","+jsonObject1.toJSONString()+"]";
		  }else{
			  jsonObject.put("Authentication", "failed");
			  return jsonObject.toJSONString();
		  }
		 
		 
	 }
	 
	 
	 public boolean userAuthentication(String username,String password){
		 if("occadmin".equals(username) && "@cc@dm!n".equals(password))
			 return true;
		 return false;
	 }
	 
	 
	 public String setCode(String code){
		 String responseCode="";
		
		 if(code.contains("G1")){
			 responseCode="A" ;
			 return responseCode;
		 }else if(code.contains("G2")){
			 responseCode="B" ;
			 return responseCode;
		 }else if(code.contains("MOOPL Group")){
			 responseCode="C" ;
			 return responseCode;
		 }else if(code.contains("Testing-1")){
			 responseCode="D" ;
			 return responseCode;
		 }else if(code.contains("Testing-2")){
			 responseCode="E" ;
			 return responseCode;
		 }
		 
		 return responseCode;
	 }

	@GET
	@Path("/morning/{name}")
	@Produces("text/plain")
	public String morning(
		@PathParam("name") String name,
		@QueryParam("drink") String drink) {

		String greeting = "Good Morning " + name;

		if (drink != null) {
			greeting += ". Would you like some " + drink + "?";
		}

		return greeting;
	}

}