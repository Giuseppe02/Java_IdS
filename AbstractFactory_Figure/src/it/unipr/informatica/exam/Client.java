package it.unipr.informatica.exam;

public class Client {
	public static void main(String[] args ) {
		FiguraFactory factory = new MiaFiguraFactory();
		Figura c = factory.createCerchio();
		Figura r = factory.createRettangolo();
		
		c.disegna();
		r.disegna();
	}
}
