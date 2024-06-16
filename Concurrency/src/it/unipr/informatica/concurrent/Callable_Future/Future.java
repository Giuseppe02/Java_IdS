package it.unipr.informatica.concurrent.Callable_Future;

import it.unipr.informatica.concurrent.Executor.ExecutionException;

public interface Future<T> {
	public T get() throws InterruptedException, ExecutionException;
	public boolean isDone();
}
