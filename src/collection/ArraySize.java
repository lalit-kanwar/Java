package collection;

public class ArraySize {

	public static void main(String[] args) {

		int[] a = new int[10];
		System.out.println(a);
		System.out.println(a.length);

		a[0] = 10;
		a[1] = 20;
		System.out.println(a.length);

		a[5] = 40;
		System.out.println(a.length);

		System.out.println();

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
