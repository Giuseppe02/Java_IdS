package it.unipr.informatica.exam;

// Abstract Factory

// definisce i metodi per i quali sarà possibile 
// ottenere gli Abstract Product

public abstract class FiguraFactory {
	public abstract Figura createRettangolo();
	public abstract Figura createCerchio();
}
