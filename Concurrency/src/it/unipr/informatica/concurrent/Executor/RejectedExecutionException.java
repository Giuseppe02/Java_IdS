package it.unipr.informatica.concurrent.Executor;

public class RejectedExecutionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RejectedExecutionException(String message) {
		super(message);
	}
	
}
