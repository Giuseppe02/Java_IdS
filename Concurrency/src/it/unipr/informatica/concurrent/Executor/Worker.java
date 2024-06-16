package it.unipr.informatica.concurrent.Executor;

public class Worker implements Runnable {
	private boolean shutdown;
	private Thread thread;
	public Worker() {
		this.shutdown = false;
		this.thread = new Thread(this);
	}
	
	@Override
	public void run() {
		for(;;)
		{
			synchronized (thread) {
				if (shutdown) {
					return;
				}
				try {
					Runnable runnable = tasks.take();
					runnable.run();
				} catch (InterruptedException e) {
					return;
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		}
	}
	
	public void start() {
		thread.start();
	}
	public void shutdown() {
		synchronized (thread) {
			shutdown = true;
			thread.interrupt();
		}
	}
}
