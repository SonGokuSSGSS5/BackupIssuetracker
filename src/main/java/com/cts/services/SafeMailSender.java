package com.cts.services;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.MailFormBean;



@Service
public class SafeMailSender {
	
	
	@Autowired
	MailHandler mailSender;
	public void sendMail(MailFormBean mf) {
	try {
		
		String appendedSubject="Name:"+mf.getName()+"\n"+"SenderMail Id:"+mf.getEmailId()+"\n"+mf.getContent();
		mailSender.sendMail(mf.getSubject(), appendedSubject);
	} catch (AddressException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MessagingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Mail tried to be sent!");
}
}
