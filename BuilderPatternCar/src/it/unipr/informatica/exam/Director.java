package it.unipr.informatica.exam;

public class Director {
	public void buildBugatti(Builder builder) {
		builder.brand("Bugatti")
				.color("Blue")
				.nbrOfDoors(2)
				.engine("8L")
				.height(115);
	}
	public void buildFerrari(Builder builder) {
		builder.brand("Ferrari")
				.color("Red")
				.nbrOfDoors(2)
				.engine("7L")
				.height(105);
	}
}
