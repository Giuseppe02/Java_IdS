package it.unipr.informatica.exam;

public class Place implements MapElement {
	private String placeLabel;
	
	public void setLabel(String label) {
		placeLabel = label;
	}
	public String getPaintingData() {
		return "city: " + placeLabel;
	}

}
