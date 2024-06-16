package it.unipr.informatica.ITERATOR;

import java.util.List;

//Aggregate Concrete
public class Company implements Aggregate<Impiegato> {
	private List<Impiegato> impieagti;

	public Company(List<Impiegato> impieagti) {
		this.impieagti = impieagti;
	}
	
	@Override
	public Iterator<Impiegato> createIterator(){
		return new ConcreteIterator(impieagti);
	}
}
