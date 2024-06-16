package it.unipr.informatica.ITERATOR;

import java.util.List;
import java.util.NoSuchElementException;

public class ConcreteIterator implements Iterator<Impiegato>{
	private int currentIndex = 0;
	private List<Impiegato> impiegati;
	
	
	public ConcreteIterator(List<Impiegato> impiegati) {
		this.impiegati = impiegati;
	}
	@Override
	public boolean hasNext() {
		return currentIndex < impiegati.size();
	}
	@Override
	public Impiegato next() {
		if(!hasNext())
			throw new NoSuchElementException();
		return impiegati.get(currentIndex++);
	}
}
