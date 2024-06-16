package it.unipr.informatica.BUILDER;

public class BuilderDesignPattern {

	public static void main(String[] args) {
		Computer c1 = new Computer.ComputerBuilder("500 Gb", "2 Gb")
		.setBluetoothEnabled(true)
		.setGraphicsCardEanbled(true)
		.build();
		System.out.println("Computer c1 has HDD of " + c1.getHDD() +", and RAM of: "+ c1.getRam());
		System.out.println("Bluetooth is " + c1.isBluetoothEnabled());
		System.out.println("Graphics card is " + c1.isGraphicsCardEnabled());
	}

}
