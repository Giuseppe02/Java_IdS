package it.unipr.informatica.BRIDGE;

import java.util.Iterator;

public class DesignPatternBridge {
	
	public static void main(String[] args) {
		MyQueue queue = new MyQueue(new ArrayQueue());
		for (int i = 0; i < 10; ++i) {
			new Thread(()->{
				System.out.println("Thread Consumer: "+ Thread.currentThread().getName() +" "+queue.pop());
			}).start();
		}
		for (int i = 0; i < 10; ++i) {
			int id = i;
			new Thread(()->{
				System.out.println("Thread Producer: "+ Thread.currentThread().getName() +" "+ id);
				queue.push(id);
			}).start();
		}
	}
}
