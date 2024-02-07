package it.unipr.informatica.examples;

public class Example00 {
	public static void go() {
		for(int j=0; j<5; ++j) {
			Thread a = new ThreadA(j);
			a.start();	
			
			Thread b = new Thread(new ThreadB(j));
			b.start();
			
			Thread c = new ThreadC(j);
			c.start();
			
			Thread d = new Thread(new ThreadD(j));
			d.start();
		}	
	}
	
	public static void main(String[] args) {
		Example00.go();
	}
	
	
	// Classi Inner
	public static class ThreadC extends Thread{
		public static int id;
		
		public ThreadC(int id) {
			if(id < 0)
				throw new IllegalArgumentException("id");
			this.id = id;
		}
		@Override
		public void run() {
			for(int i=0;i < 10; ++i) 
				System.out.println("C: "+ i +" - id: "+ id);
		}
	}
	
	public static class ThreadD implements Runnable{
		public static int id;
		
		public ThreadD(int id) {
			if(id < 0)
				throw new IllegalArgumentException("id");
			this.id = id;
		}
		@Override
		public void run() {
			for(int i=0;i < 10; ++i) 
				System.out.println("D: "+ i +" - id: "+ id);
		}
	}
}
