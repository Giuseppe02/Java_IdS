package it.unipr.informatica.exam;

public class CD implements Media {
	private String track = "";
	
	public void writeOnDisk(String sound) {
		track = sound;
	}
	public String readOnDisk() {
		return track;
	}

}
