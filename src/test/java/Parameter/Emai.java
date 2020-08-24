package Parameter;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Emai {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		
		System.out.println("++++++++++++Started++++");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("vipanshuw@travelboutiqueonline.com", "Fareportal@2"));
		email.setSSLOnConnect(true);
		email.setFrom("vipanshu.walia@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("vipanshuahluwaliawalia@gmail.com");
		email.send();
		System.out.println("++++++++++++end++++");

	}

}
