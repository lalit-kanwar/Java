package enumclass;

public enum Color {
	RED(15), BLUE(25), GREEN;
	static int a = 10;
	int x = 20;

	static void m1() {
		System.out.println("SM1");
	}

	void m2() {
		System.out.println("NSM2");
	}

	static {
		System.out.println("SB");
	}
	{
		System.out.println("NSB");
	}

	Color() {
		System.out.println("no-arg Cons");
		this.x = 50;
	}

	Color(int x) {
		System.out.println("int-arg cons");
		this.x = x;
	}

	public static void main(String[] args) {

		System.out.println("Color main");
	}
}
