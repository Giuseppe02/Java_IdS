package it.unipr.informatica.concurrent.BlockingQueue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ArrayBlockingQueue<T> implements BlockingQueue<T>{
	private Object[] queue;
	private int in, out;
	private int count, size;
	private Lock lock;
	private Condition isNotEmpty, isNotFull;
	
	public ArrayBlockingQueue(int size) {
		if (size < 1) {
			throw new IllegalArgumentException("size < 1");
		}
		this.queue = queue;
		this.in = 0; // su cui fare la prox put
		this.out =0; // su cui fare la prox take
		this.count = 0; // memorizzare il num di elem in coda
		this.size = size; // memorizzare la lunghezza
		this.lock = new ReentrantLock();
		this.isNotEmpty = lock.newCondition();
		this.isNotFull = lock.newCondition();
	}
	public T take() throws InterruptedException {
		try {
			lock.lock();
			while (count == 0) {
				isNotEmpty.await();
			}
			T result = (T) queue[out];
			queue[out] = null;
			--count;
			isNotFull.signal();
			
			return result;
		} finally {
			lock.unlock();
		}
	}
	@Override
	public void put(T object) throws InterruptedException {
		if(object == null)
			throw new NullPointerException("object = null");
		try {
			lock.lock();
			while(count == size)
				isNotFull.await();
			queue[in] = object;
			in = (in + 1) % size;
			isNotEmpty.signal();
 		} 
		finally {
			lock.unlock();
		}
	}
	
	@Override
	public boolean isEmpty() {
		lock.lock();
		boolean result = (count == 0);
		lock.unlock();
		return result;
	}
	 
	// ci dice quanto spazio libero c'e'
	@Override
	public int remainingCapacity() {
		lock.unlock();
		int result = size - count;
		lock.unlock();
		return result;
	}
	
	// puliamo la coda settando i valori a 0
	@Override
	public void clear() {
		lock.lock();
		in = out = count = 0;
		queue = new Object[size];
		// segnaliamo che la coda non e' piu' vuota
		isNotFull.signalAll();
		lock.unlock();
	}	
	
}
