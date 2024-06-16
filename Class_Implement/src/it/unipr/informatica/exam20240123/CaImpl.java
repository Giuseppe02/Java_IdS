package it.unipr.informatica.exam20240123;

public class CaImpl implements Ca {
	private final Object lock = new Object();
	@Override
	public int ma(Runnable[] a) {
		for (int i = 0; i < a.length; i++) {
			int temp = i;
			Thread t1 = new Thread(()->{
				synchronized (lock) {
					a[temp].run();
				}
			});
		}
		return -1;
	}
}
