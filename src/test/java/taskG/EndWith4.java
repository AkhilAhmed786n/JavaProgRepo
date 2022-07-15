package taskG;

public class EndWith4 {
	public static void main(String[] args) {

		int num = 1, n;
		
		System.out.print(num);
		for (int i = 0; i < 9; i++) {

			n = num + 10;
			num = n;
			System.out.print(" "+n);
		}

	}

}
