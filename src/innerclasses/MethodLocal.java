package innerclasses;

public class MethodLocal {

	static int a = 10;
	int b = 20;

	static void m1() {
		final int c = 30;
		int d = 40;

		class B {

			void m1(final int e, int f) {
				System.out.println(a);
				// System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(f);
			}
		}

	}

	void m2() {
		class C {
			void m2() {
				System.out.println(a);
				System.out.println(b);
			}
		}
	}

	public static void main(String[] args) {

		MethodLocal a1 = new MethodLocal();
		MethodLocal a2 = new MethodLocal();
		a1.a = 5;
		a1.b = 6;
		a1.m1();
		a1.m2();

		a2.a = 7;
		a2.b = 8;
		a2.m1();
		a2.m2();

	}

}
