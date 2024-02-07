package it.unipr.informatica.exam;

public class CDPlayer implements Player{
	CD cdInside;
	public void accept(Media med) {
		cdInside = (CD) med;
	}
	public void play() {
		if(cdInside == null)
			System.out.println("Error! Insert a CD.");
		else
			System.out.println(cdInside.readOnDisk());
	}
}
