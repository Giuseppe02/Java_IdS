package it.unipr.informatica.concurrent.Callable_Future;

import it.unipr.informatica.concurrent.Executor.ExecutionException;

public class SimpleFuture<T> implements Future {
	private Object mutex;
	private boolean done;
	private T value;
	private Throwable exception;
	
	SimpleFuture(){
		this.mutex = new Object();
		this.done = false;
		this.exception = null;
		this.value = null;
	}
	@Override
	public boolean isDone() {
		synchronized (mutex) {
			return done;
		}
	}
	@Override
	public T get() throws InterruptedException, ExecutionException{
		synchronized (mutex) {
			if(!done)
				mutex.wait();
			if(exception != null)
				throw new ExecutionException(exception);
			return value;
		}
	}
	
	public void setValue(T obj) {
        synchronized (mutex) {
            if (done) {
                throw new IllegalArgumentException("done is true");
            }
            value = obj;
            done = true;
            mutex.notifyAll();
        }
    }

    public void setException(Throwable t) {
        if(t == null)
          throw new IllegalArgumentException("throwable is null");
    	synchronized (mutex) {
            if (done) {
                throw new IllegalStateException("done is true");
            }
            exception = t;
            done = true;
            mutex.notifyAll();
        }
    }
}
