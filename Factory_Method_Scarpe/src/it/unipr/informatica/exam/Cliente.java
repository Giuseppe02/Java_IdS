package it.unipr.informatica.exam;

public class Cliente {
	public static void main(String[] args) {
		Commesso commesso = new Commesso();
		Scarpe scarpe =  commesso.getScarpe("ginnastica");
		System.out.println(scarpe.getClass());
	}
}
