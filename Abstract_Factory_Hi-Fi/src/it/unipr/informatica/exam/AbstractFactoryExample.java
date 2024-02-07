package it.unipr.informatica.exam;

public class AbstractFactoryExample {
	
	public static void main(String[] args) {
		Client client = new Client();
		
		System.out.println("**Testing tape devices");
		client.selectTechnology(new TapeDevicesFactory());
		client.test("Hey lady put your hands....");
		
		System.out.println("**Testing CD devices");
		client.selectTechnology(new CDDevicesFactory());
		client.test("UPS UPS UPS....");
	}

}
