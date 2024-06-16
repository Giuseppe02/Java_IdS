package it.unipr.informatica.ITERATOR;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Impiegato> impiegati = new ArrayList<>();
		impiegati.add(new Impiegato ("Marco",200));
		impiegati.add(new Impiegato ("Giuseppe",300));
		impiegati.add(new Impiegato ("Alice",1000));
		
		Company company = new Company(impiegati);
		Iterator<Impiegato> iterator = company.createIterator();
		
		double totalSalary = 0;
		while(iterator.hasNext()) {
			totalSalary += iterator.next().getSalario();
		}
		System.out.println("Salario totale: "+ totalSalary);
	
	
	}

}
