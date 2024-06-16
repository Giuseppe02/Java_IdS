package it.unipr.informatica.exam20230606.es1;

public class AImpl implements A{
	final Object lock = new Object();
	
	@Override
	public Thread m1(Object obj) {
		return new Thread(()->{
			synchronized (lock) {
				m2(obj);
			}
		});
	}
	
	private void m2(Object o) {
		if (o == null)
			System.out.println("Argument is null");
		else
			System.out.println(o.toString());
	}
}
