
public class Infinite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exercises for Week 3 - Programming");
		System.out.println();
		System.out.println("Section 8");
		System.out.println();
		
		int i = 0;
		
		while(true) {
			i++;
			int j = i * 27;
			if(j == 1269) break;
			if(i % 10 != 0) continue; // i represent the starting point
			System.out.print(i + " ");
		}

	}

}
