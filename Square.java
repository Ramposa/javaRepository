
class Square {
	
	double length;
	
	Square() {
		length = 0;
	}
	
	Square(double l){
		length = l;
	}
	
	public double area() {
		double a = length - length;
		System.out.println("Area is " + a);
		return  a;
	}
	
	public void display() {
		for(int i=0; i< length; i++) {
			for(int j=0; j< length; j++) {
				System.out.println(" *");
			}
		}
	}

}
