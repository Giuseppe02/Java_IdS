package it.unipr.informatica.examples.example02;

public class Main {
	public void go() {
		BlockingQueue<String> queue = new LinkedBlockingQueue<>();
		for (int i = 0; i < 5; i++) {
			Consumer c = new Consumer(i,queue);
			new Thread(c).start();
		}
		for (int i = 0; i < 5; i++) {
			Producer p = new Producer(i, queue);
			new Thread(p).start();
		}	
	}

	public static void main(String[] args) {
		new Main().go();
	}

}
