package instance.test;

public class FebbinociSeriesFound {
	public static boolean isPerfectSquare(int a) {
		int s = (int) Math.sqrt(a);
		// System.out.println(s * s == a);
		return (s * s == a);

	}

	public static void main(String[] args) {

		// Given fevvinocii Series is (1 2 3 5 8 13 21 34 55 89 144 233);
		int first = 0, second = 1;
		System.out.println("febinocii Series are : ");
		for (int i = 0; i < 20; i++) {
			if (i <= 1) {
				System.out.println(i);
			} else {
				int last = first + second;
				first = second;
				second = last;

				System.out.print(" " + last);
			}
		}
		System.out.println();
		System.out.println(" 1, 25, 5, 8, 90, 54, 78, 21 ");

		int[] x = { 1, 25, 5, 8, 90, 54, 78, 21 };
		System.out.println("from Given Array find Febbinocii Series and Print");

		for (int i = 0; i < x.length; i++) {
			int n = x[i];
			if (isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4)) {

				System.out.print(" " + x[i]);
			}

		}

	}

}
