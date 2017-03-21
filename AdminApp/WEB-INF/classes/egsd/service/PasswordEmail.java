package egsd.service;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;

public class PasswordEmail {

	public String changePassword(String email, String username, String firstname) {
		
		SendGrid sendgrid = new SendGrid("hanuman.kachwa", "HEY_RAM@87");

	    SendGrid.Email sendemail = new SendGrid.Email();
	    sendemail.addTo(email);
	    sendemail.setFrom("no-reply@egsd.info");
	    sendemail.setSubject("Password Reset Request for egsdAdminApp");
	    
	    sendemail.setHtml("<div style='font-family: Calibri,sans-serif;font-size:11pt;'>Hi "+firstname+",<br/><br/>You requested a password reset for the eGSD Content Administration Portal, <br/>Your online portal for electronic guest service directory mobile app content management.<br/><br/>Please click here to reset it:<br/><br/>http://egsd.mobldir.com:8080/egsdAdminApp/choose_password.jsp?email="+email+"&username="+username+" <br/><br/>For additional support, or if you did not request this password reset,<br/>please contact us at:<br/><br/>888-777-9832 opt 3<br/><br/>Thanks<br/><br/>eGSD Support Team</div>");
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
