package net.avantic.course.vacation.exception;

@SuppressWarnings("serial")
public class ValidationException extends RuntimeException {

	public ValidationException(String message) {
		super(message);
	}

}
