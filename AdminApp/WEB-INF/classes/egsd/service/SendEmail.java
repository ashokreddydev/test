package egsd.service;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;

public class SendEmail {

	public String sendEmail(String fname, String email, String username, String password, String userType) {
		
		SendGrid sendgrid = new SendGrid("hanuman.kachwa", "HEY_RAM@87");

	    SendGrid.Email sendemail = new SendGrid.Email();
	    sendemail.addTo(email);
	    sendemail.setFrom("no-reply@egsd.info");
	    sendemail.setSubject("eGSD Admin Registration");
	    
	    System.out.println(userType);
	    
	    if( userType.equals("Location Admin") )
	    {
	    	sendemail.setHtml("<div style='font-family: Calibri,sans-serif;font-size:11pt;'>Hi "+fname+",<br/><br/>An account has been created for you as a Directory/Location Administrator in the eGSD Content Administration Portal. This allows you to manage content for your location in the eGSD electronic guest service directory mobile app. This mobile app can then be provided for the free and convenient use of your guests. To get started building your app content, log in as follows:<br/><br/>To log in, go to the eGSD admin portal url: http://admin.egsd.mobi<br/><br/><b>Your username : "+username+"</b><br/><b>Your temporary password : "+password+"</b><br/><br/>Note: Please change your password after you first log in.<br/><br/>Thanks, and welcome to our eGSD electronic guest service directory mobile app system!<br/><br/>eGSD Support Team<br/><br/>(For administrative support you may call 888-777-9832 opt 3)</div>");
	    }
	    else
	    {
	    	sendemail.setHtml("<div style='font-family: Calibri,sans-serif;font-size:11pt;'>Hi "+fname+",<br/><br/>An account created for you as "+userType+" for eGSD admin application with the following credentials.<br/><br/><b>Username : "+username+"</b><br/><b>Password : "+password+"</b><br/><br/>Please change your password for the first time login.<br/><br/>Login to the following link: http://egsd.mobldir.com:8080/egsdAdminApp/<br/><br/>Thanks,<br/>eGSD Support Team</div>");
	    }
	    
	    //sendemail.setText("Hi "+fname+",\n\nAn account created for you as "+userType+" with the for eGSD admin application with the username : "+username+" and\npassword : "+password+". Please change your password for the first time login.\n\nLogin to the following link: http://egsd.mobldir.com:8080/egsdAdminApp/\n\nThanks,\neGSD Support Team ");

	    try {
	      SendGrid.Response response = sendgrid.send(sendemail);
	      System.out.println(response.getMessage());
	      
	    }
	    catch (SendGridException e) {
	      System.err.println(e);
	     
	    }
		return "successfully sent";

	}

}
