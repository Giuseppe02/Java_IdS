package it.unipr.informatica.exam20240123;

public class CaImpl2 implements Ca {
	private final Object lock = new Object();
	private boolean isFirstFinished = false;
	private int firstfinishIndex = -1;
	@Override
	public int ma(Runnable[] a) {
		for (int i = 0; i < a.length; i++) {
			int temp = i;
			Thread t1 = new Thread(()->{
				synchronized (lock) {
					if (!isFirstFinished) {
						a[temp].run();
						firstfinishIndex = temp;
						isFirstFinished = true;
					}
				}
			});
			t1.start();
		}
		return firstfinishIndex;
	}
}
