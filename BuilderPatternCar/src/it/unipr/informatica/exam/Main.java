package it.unipr.informatica.exam;

public class Main {
	public static void main(String[] args) {
		Director director = new Director();
		
		// Prodotto finale referito a Car
		CarBuilder builder = new CarBuilder();
		director.buildBugatti(builder);
		builder.model("Chiron");
		System.out.println(builder.build());
		
		// Prodotto finale riferito a CarSchema
		CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
		director.buildFerrari(schemaBuilder);
		schemaBuilder.engine("90").nbrOfDoors(4).model("2021 model");
		System.out.println(schemaBuilder.build());
	}

}
