package exception;

public class InnerCatchNotbutOuterMatch {

	public static void main(String[] args) {
		methodCall(-5);

	}

	public static void methodCall(int ar) {

		try {
			int a = ar;/// Integer.parseInt("ar");
			System.out.println("given ar is " + ar);
			try {
				int[] x = new int[a];
				System.out.println("array size is " + x.length);

			} catch (NullPointerException npe) {
				System.out.println("NFE raised");
			}
			int b = a + 20;
			System.out.println("a+20 is " + b);
		} catch (ArrayIndexOutOfBoundsException ae) {

			System.out.println("pass one int value");
		} catch (NumberFormatException pfe) {

			System.out.println("pass only int value");
		}
		/*
		 * catch (NegativeArraySizeException ne) {
		 * 
		 * int[] x = new int[3];
		 * 
		 * System.out.println("in outer try array size " + x.length);
		 * 
		 * }
		 */System.out.println("End Program");
	}

}
