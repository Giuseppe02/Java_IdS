package it.unipr.informatica.BUILDER;

class Computer {
	private String HDD;
	private String RAM;
	
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getRam(){
		return RAM;
	}
	public String getHDD() {
		return HDD;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isGraphicsCardEnabled;
	}
	private Computer(ComputerBuilder builder) {
		this.RAM = builder.RAM;
		this.HDD = builder.HDD;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}
	
	// Builder class
	public static class ComputerBuilder {
		private String HDD;
		private String RAM;
		
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}
		public ComputerBuilder setGraphicsCardEanbled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
	}
}
