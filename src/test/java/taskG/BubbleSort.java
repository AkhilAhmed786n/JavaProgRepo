package taskG;

public class BubbleSort {
	public static void main(String[] args) {

		int a[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = a.length - 1;
		int temp;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
