package generalProg;

import java.util.Scanner;

public class MultilplePrimeNumProg {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int total = 0;
		for (int i = 1; i < num; i++) {

			int count = 0;

			for (int j = 1; j < num; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.print(i+" ");
				total++;
			}
		}

		System.out.println("\nTotally there are " + total + " prime numbers from 0 to 100");
		
		
	}

}
