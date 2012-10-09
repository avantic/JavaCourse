package net.avantic.course.vacation.web.command;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

public class DoVacationRequestCommand {

	private String name;
	
	private String mail;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private DateTime initialDate;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private DateTime finalDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public DateTime getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(DateTime initialDate) {
		this.initialDate = initialDate;
	}

	public DateTime getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(DateTime finalDate) {
		this.finalDate = finalDate;
	}
	
}
