package generalProg;

public class FibonacciProg {

	public static void main(String[] args) {
		
		/*
		 * Fibonacci is like 0,1,1,2,3,5,8,13,21,34,........1
		 * 
		 */

		int a = 0, b = 1, c;

		for (int i = 0; i <= 5; i++) {
			
			c = a + b;
			b = a;
			a = c;
			
			System.out.println(c);
		}
		
	}
}
