package it.unipr.informatica.exam;

public class TapePlayer implements Player{
	Tape tapeInside;
	public void accept(Media med) {
		tapeInside = (Tape) med;
	}
	public void play() {
		if(tapeInside == null)
			System.out.println("Error! Insert a tpe.");
		else 
			System.out.println(tapeInside.readTape()); 
	}
}
