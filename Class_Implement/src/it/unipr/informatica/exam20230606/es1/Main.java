package it.unipr.informatica.exam20230606.es1;

public class Main {

	public static void main(String[] args) {
		AImpl aimpl = new AImpl();
		Object o = new Object();
		
		Thread t1 = aimpl.m1(o);
		Thread t2 = aimpl.m1(o);
		Thread t3 = aimpl.m1(o);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
