package enumclass;

public class ColorTest {

	public static void main(String[] args) {
		System.out.println("Color Test main");
		System.out.println(Color.RED);
		System.out.println(Color.BLUE);

		System.out.println(Color.a);
		Color.m1();

		System.out.println(Color.RED.x);
		System.out.println(Color.BLUE.x);
		System.out.println(Color.GREEN.x);

		Color.RED.m2();
		Color.BLUE.m2();
	}
}
