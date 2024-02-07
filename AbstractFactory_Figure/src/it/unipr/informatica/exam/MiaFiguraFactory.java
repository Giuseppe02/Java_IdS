package it.unipr.informatica.exam;

// Concrete Factory

// Possiamo crearne n, ciascuna dei quali,
// implementa l'interfaccia Abstract Factory e tutti i suoi metodi,
// mediante i quali sarà possibile ottenre i Concrete Product.


public class MiaFiguraFactory extends FiguraFactory {
	@Override
	public Figura createRettangolo() {
		return new MioRettangolo();
	}
	@Override
	public Figura createCerchio() {
		return new MioCerchio();
	}
}
