package it.unipr.informatica.BRIDGE;

import java.util.LinkedList;
import java.util.List;

public class LinkedQueue implements Queue{
	private List<Object> queue;
	
	public LinkedQueue(){
		this.queue = new LinkedList<>();
	}
	@Override
	public void push(Object elem) {
		if(elem == null) throw new IllegalArgumentException("elem is null");
		synchronized (queue) {
			queue.add(elem);
			queue.notify();
		}
	}
	@Override
	public Object take() {
		synchronized (queue) {
			while (queue.size() == 0) {
				try {
					queue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Object elem = queue.remove(0);
			return elem;
		}
	}
}
