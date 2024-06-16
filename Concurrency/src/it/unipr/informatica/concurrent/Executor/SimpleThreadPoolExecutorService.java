package it.unipr.informatica.concurrent.Executor;
import it.unipr.informatica.concurrent.BlockingQueue.BlockingQueue;
import it.unipr.informatica.concurrent.BlockingQueue.LinkedBlockingQueue;

public class SimpleThreadPoolExecutorService implements ExecutorService {
	private Worker[] workers;
	private BlockingQueue<Runnable> tasks;
	private boolean shutdown;
	public SimpleThreadPoolExecutorService(int count) {
		if (count < 1) {
			throw new IllegalArgumentException("count < 1");
		}
		this.workers = new Worker[count];
		this.tasks = new LinkedBlockingQueue<>();
		this.shutdown = false;
		for (int i = 0; i < count; ++i) {
			Worker worker = new Worker();
			workers[i] = worker;
			worker.start();
		}
	}
	@Override
	public void execute(Runnable command) {
		if (command == null) {
			throw new NullPointerException("Argument is null");
		}
		synchronized (tasks) {
			if (shutdown) {
				throw new RejectedExecutionException("shutdown == false");
			}	
			try {
				tasks.put(command);
			} catch (InterruptedException e) {
				//  blank
			}
		}
	}
	
	@Override
	public void shutdown() {
		synchronized (tasks) {
			shutdown = false;
			int length = workers.length;
			for (int i = 0; i < length; i++) {
				workers[i].shutdown();
				
			}
		}
	}
	
	
}
