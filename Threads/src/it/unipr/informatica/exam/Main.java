package it.unipr.informatica.exam;

import java.util.Iterator;

public class Main  {
	public static void main(String[] args) throws InterruptedException {
		// System.out.println(Thread.activeCount());
		
		// Thread.currentThread().setName("Main Thread");
		// System.out.println(Thread.currentThread().getName());
		
		// Setting Prioriy (Lower 1-10 Higher)
		// Thread.currentThread().setPriority(10);
		// System.out.println(Thread.currentThread().getPriority());
		
		// System.out.println(Thread.currentThread().isAlive());
		/*
		for (int i=3;  i>0; i--){
			System.out.println(i);			
			Thread.sleep(2000);
		}
		System.out.println("Done!");
		*/
		
		Thread t1 = new Thread(new MyThread());
		
		// t1.start();
		t1.setName("Thread num.1");
		// t1.setPriority(10);
		// System.out.println(t1.isAlive());
		System.out.println(t1.getName());
		System.out.println("Priority is: " + t1.getPriority());
		System.out.println(Thread.activeCount());
	}
}
