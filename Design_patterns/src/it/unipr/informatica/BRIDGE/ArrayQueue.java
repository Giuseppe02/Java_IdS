package it.unipr.informatica.BRIDGE;

import java.util.ArrayList;
import java.util.List;

public class ArrayQueue implements Queue{
	private List<Object> queue;
	public ArrayQueue() {
		this.queue = new ArrayList<>();
	}
	
	@Override
	public void push(Object elem) {
		if(elem == null) throw new IllegalArgumentException("element is null");
		synchronized (queue) {
			queue.add(elem);
			queue.notify();
		}
	}
	@Override
	public Object take() {
		synchronized (queue) {
			while(queue.size()== 0) {
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
