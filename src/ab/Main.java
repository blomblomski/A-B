package ab;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// Given to integers, A and B.
		// Their sum needs to be calculated.
		Random ran = new Random();
		
		for(int i = 0; i < 10; i++) {
			AB(ran.nextInt(100),ran.nextInt(100));
		}
	}
	
	public static void AB(int a, int b) 
	{
		int sum = a + b;
		
		System.out.println(a + " + " + b +" = " + sum);
	}

}
