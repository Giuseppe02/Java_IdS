package it.unipr.informatica.exam;

public class Tape implements Media {
	private String tape = "";
	public void saveOnTape(String sound) {
		tape = sound;
	}
	public String readTape() {
		return tape;
	}

}
