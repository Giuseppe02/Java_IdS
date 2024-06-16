package it.unipr.informatica.BRIDGE;

abstract class BridgeQueue {
	protected Queue queue;
	protected BridgeQueue(Queue queue) {
		this.queue = queue;
	}
	public abstract void push(Object elem);
	public abstract Object pop();
}
