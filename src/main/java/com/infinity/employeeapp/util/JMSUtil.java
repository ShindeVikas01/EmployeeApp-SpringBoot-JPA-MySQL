package com.infinity.employeeapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class JMSUtil {
	@Autowired
	JavaMailSender javaMailSender;
	
	public void sendMail(String to,String subject,String body) {
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setTo(to);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(body);
		
		javaMailSender.send(simpleMailMessage);
	}

}
