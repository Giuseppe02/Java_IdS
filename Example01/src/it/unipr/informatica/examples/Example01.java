package it.unipr.informatica.examples;

public class Example01 {
	private boolean done = false;
	
	private void go() {
		new Waiter().start();
		new Notifier().start();
	}
	
	public static void main(String[] args) {
		new Example01().go();
	}
	
	private class Notifier extends Thread{
		@Override
		public void run() {
			System.out.println("Notifier started");
			
				try {
					Thread.sleep(5000);
					done = true;
					System.out.println("Notified");
				}catch(InterruptedException e) {
					System.out.println("Interrrupted");
					return;
				}
			
			System.out.println("Notifier terminated");
		}
	}
	
	private class Waiter extends Thread{
		@Override
		public void run() {
			System.out.println("Waiter started");

			do {
				System.out.println("About to sleep");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println("Interrrupted");
					return;
				}
			}while(!done);
			
			System.out.println("Waiter terminated");
		}
	}

}
