package it.unipr.informatica.exam20240604;

public interface ConcurrentRunnerA {
	public Object execute(Task t1, Task t2) throws InterruptedException;
}
