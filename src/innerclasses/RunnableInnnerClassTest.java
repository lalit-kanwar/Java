package innerclasses;

public class RunnableInnnerClassTest {

	public static void main(String[] args) {

		RunnableInnnerClass t = new RunnableInnnerClass();
		t.m1(new Runnable() {

			@Override
			public void run() {
				System.out.println("Run overriden from Runnable");
			}
		});
	}

}
