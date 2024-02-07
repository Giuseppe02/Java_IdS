package it.unipr.informatica.examples.example02;


public class Consumer implements Runnable{
	private int id;
	private BlockingQueue<String> queue;
	
	public Consumer(int id, BlockingQueue<String> queue) {
		if(id < 0)
			throw new IllegalArgumentException("id < 0");
		if(queue == null)
			throw new IllegalArgumentException("queue is null");
		this.id = id;
		this.queue = queue;
	}
	
	@Override 
	public void run() {
		try {
			for(int i = 0;i < 5; i++) {
				String message = queue.take();
				System.out.println("Consumer " + id + " received " + message);
				// Thread in attesa tra 100 e 150ms
				Thread.sleep(40 + (int) (50 *Math.random()));
			}
		}catch(InterruptedException e) {
			System.err.println("Producer "+ id + "Interrupted");
		}
	}
	
	
}
