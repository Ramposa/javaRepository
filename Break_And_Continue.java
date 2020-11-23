
public class Break_And_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Exercises for Week 3 - Programming");
		System.out.println();
		System.out.println("Section 7");
		
		for(int i = 0; i < 100; i++) {
			if(i == 74) break; // at 74 or higher this will break the loop.
			if(i % 9 != 0) continue; // i = 9, means it will go in 9s
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
