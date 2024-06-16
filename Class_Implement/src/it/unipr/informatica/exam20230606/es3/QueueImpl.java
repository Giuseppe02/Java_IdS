package it.unipr.informatica.exam20230606.es3;

import java.util.ArrayList;
import java.util.List;

public class QueueImpl implements Queue {
	public List<Object> codaElementi;
	
	public QueueImpl() {
		this.codaElementi = new ArrayList<>();
	}
	
	@Override
	public void add(Object val) {
		codaElementi.add(val);
	}
	@Override
	public Object remove() {
		if(codaElementi.isEmpty())
			throw new IllegalStateException("element in the queue is null");
		return codaElementi.remove(0);
	}
	
	public Iterator<Object> createIterator(){
		return new QueueIterator(this);
	}
}
