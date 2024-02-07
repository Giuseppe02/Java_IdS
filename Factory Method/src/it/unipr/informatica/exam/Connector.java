package it.unipr.informatica.exam;

public class Connector implements MapElement {
	private String connectorLabel;
	Place place1,place2;
	
	public void setLabel(String label) {
		connectorLabel = label;
	}
	
	public void setPlacesConnected(Place origin, Place destination) {
		place1 = origin;
		place2 = destination;
	}
	public String getPaintingData(){
		return connectorLabel + " [ From " + 
				place1.getPaintingData() + " to " +
				place2.getPaintingData() + " ] ";
	}
}
