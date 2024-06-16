package it.unipr.informatica.exam20230606.es3;

public class QueueIterator implements Iterator<Object> {
	private int currentIndex;
	private QueueImpl queue;
	
	public QueueIterator(QueueImpl queue) {
		this.currentIndex = 0;
		this.queue = queue;
	}
	public boolean hasNext() {
		return currentIndex < queue.codaElementi.size();
	}
	public Object next() {
		if(!hasNext())
			throw new IllegalArgumentException("nothing in the queue");
		return queue.codaElementi.get(currentIndex++);
	}
	
}
