package it.unipr.informatica.exam;
import java.io.*;

public class FactoryMethodExample {
	public static void main(String[] args) throws IOException {
		// Creazione dei tool per il gestore degli elementi
		ConnectorHandler cTool = new ConnectorHandler();
		PlaceHandler pTool = new PlaceHandler();
		
		//Vars
		Place startPoint, endPoint;
		Connector route;
		
		//Creazione di 2 punti e una connessione
		System.out.println("1st. place creation");
		startPoint = (Place) pTool.createElement();
		System.out.println("2st. place creation");
		endPoint = (Place) pTool.createElement();
		System.out.println("Connector creation");
		route = (Connector ) cTool.createElement();
		
		//Colleghiamo i posti con la connessione
		cTool.connect(route, startPoint, endPoint);
		
		//stampiamo la mappa
		pTool.paintElement(startPoint);
		pTool.paintElement(endPoint);
		cTool.paintElement(route);
	}

}
