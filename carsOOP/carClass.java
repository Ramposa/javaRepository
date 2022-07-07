import static java.lang.System.out;

public class carClass {
	
	String vehicleRegistration;
	String model;
	String brand;
	String color;
	String dateMade;
	String fuelType;
	int height;
	int width;
	
	public carClass(final String vehicleRegistration, final String model, final String brand, final String color, final String dateMade, final String fuelType, final int height, final int width) {
		// Constructor with arguments
		
		this.vehicleRegistration = vehicleRegistration;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.dateMade = dateMade;
		this.fuelType = fuelType;
		this.height = height;
		this.width = width;
	
    }

    /*class 4x4 extends carClass {

    }*/

	public void displayInfo() {
		// TODO Auto-generated method stub
		
		out.println("Vehicle Information:"+
				"\n"+
				"\nVehicle Registration: "+ vehicleRegistration +
				"\nBrand: "+ brand +
				"\nModel: "+ model +
				"\nColor: "+ color +
				"\nDate Manufactured "+ dateMade +
				"\nFuel Type: "+ fuelType +
				"\nHeight: "+ height + "mm" +
				"\nWidth: "+ width + "mm" +
				"\n");
		
	}

}
