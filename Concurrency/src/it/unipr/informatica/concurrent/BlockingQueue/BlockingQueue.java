package it.unipr.informatica.concurrent.BlockingQueue;

public interface BlockingQueue<T> {
	// aggiungo
	public void put(T e) throws InterruptedException;
	// rimuovo
	public T take() throws InterruptedException;
	// ritorna il numero di elementi disponibili
	public int remainingCapacity();
	// verifico se la coda e' vuota
	public boolean isEmpty();
	// elimino reference alla coda
	public void clear();
	
}
