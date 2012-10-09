package net.avantic.course.vacation.service.mail;

import net.avantic.course.vacation.service.NotificationService;

public class MailNotificationServiceImpl implements NotificationService {

	/* This is a mock service for educational purposes */
	
	public void notify(String address, String message) {
		System.out.println("Notifying " + address + ": " + message);
	}

}
