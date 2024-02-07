package it.unipr.informatica.exam;

public class CDRecorder implements Recorder {
	CD cdInside;
	public void accept(Media med) {
		cdInside = (CD) med;
	}
	
	public void record(String sound) {
		if(cdInside == null) {
			System.out.println("Error! Insert a CD.");
		}
		else
			cdInside.writeOnDisk(sound);
	}

}
