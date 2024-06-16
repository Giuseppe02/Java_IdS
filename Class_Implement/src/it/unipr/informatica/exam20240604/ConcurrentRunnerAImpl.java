package it.unipr.informatica.exam20240604;

public class ConcurrentRunnerAImpl implements ConcurrentRunnerA{
	
	@Override
	public Object execute(Task t1, Task t2) throws InterruptedException{
		final Object lock = new Object();
		final Object[] result = new Object[1];
		final boolean[] isResultSet = {false};
		
		Thread thr1 = new Thread(()->{
			try {
				Object res = t1.run();
				synchronized (lock) {
					if(!isResultSet[0]) {
						result[0] = res;
						isResultSet[0] = true;
						lock.notify();
					}
				}
			} catch (Exception e) {
				if(!isResultSet[0]) {
					result[0] = e;
					isResultSet[0] = true;
					lock.notify();
				}
			}
		});
		
		Thread thr2 = new Thread(()->{
			try {
				Object res = t2.run();
				synchronized (lock) {
					if(!isResultSet[0]) {
						result[0] = res;
						isResultSet[0] = true;
						lock.notify();
					}
				}
			} catch (Exception e) {
				if(!isResultSet[0]) {
					result[0] = e;
					isResultSet[0] = true;
					lock.notify();
				}
			}
		});
		
		thr1.start();
		thr2.start();
		
		synchronized (lock) {
			while(!isResultSet[0])
				lock.wait();
		}		
		return result[0];
	}

}
