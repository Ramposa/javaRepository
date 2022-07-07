public class carObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carClass car1 = new carClass("BD51 SMR", "1 Series", "BMW", "White", "20/10/2015", "Diesel", 4329, 1984);	
			/* String vehicleRegistration, String model, String brand, String color, String dateMade, String fuelType, int height, int width
			
			*carClass car1 = new carClass("1 Series", "BMW", "White", "20/10/15", 50, 50);
			* variables 
			*/
		
		car1.displayInfo(); // This calls to car1 strings/ ints then displays the information at class displayInfo()
		
		carClass car2 = new carClass("DD66 SQL", "Ford", "Focus ST-Line", "Grey", "09/09/2019", "Petrol", 4387, 4667);
		
		car2.displayInfo();
		
	}

}
