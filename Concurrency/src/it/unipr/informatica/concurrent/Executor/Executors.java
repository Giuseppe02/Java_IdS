package it.unipr.informatica.concurrent.Executor;

public class Executors {
	public static ExecutorService newFixedThreadPool(int count) {
		return new SimpleThreadPoolExecutorService(count);	
	}
	private Executors() {
		// blank
	}
}
