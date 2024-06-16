package it.unipr.informatica.BRIDGE;

public class MyQueue extends BridgeQueue {
	
	protected MyQueue(Queue queue) {
		super(queue);
	}
	@Override
	public void push(Object eleme) {
		queue.push(eleme);
	}
	@Override
	public Object pop() {
		return queue.take();
	}
}
