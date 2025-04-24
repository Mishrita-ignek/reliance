<html>
<body>
	<h4>Dear Sir / Madam </h4>
	<h4>This is the Energy Theft Reported on <a href=${siteLink}><u>www.relianceenergy.in</u></a> dated ${date} at ${time}</h4>
	
	<table align="center" border="2"  width="100%">
		<tbody>
			<#list emailBodyList?keys as key> 
				<tr>
	    			<td><b>${key}</b></td><td>${emailBodyList[key]} </td>
	    		</tr>
			</#list>
		</tbody>
	</table>
	<p>The information contained in this electronic message (email) and any attachments to this email are intended for the exclusive use of the
	addressee(s) and access to this email by any one else is unauthorised. The email may contain proprietary, confidential or privileged 
	information or information relating to Reliance Group. If you are not the intended recipient, please notify the sender by telephone, fax, or 
	return email and delete this communication and any attachments thereto, immediately from your computer. Any dissemination, distribution, or 
	copying of this communication and the attachments thereto (in whole or part), in any manner, is strictly prohibited and actionable at law. The 
	recipient acknowledges that emails are susceptible to alteration and their integrity can not be guaranteed and that Company does not 
	guarantee that any e-mail is virus-free and accept no liability for any damage caused by any virus transmitted by this email.</p>



</body>
</html>