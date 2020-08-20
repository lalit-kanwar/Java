package exception;

public class ExceptionTest {

	public void Dividing(int a, int b) {
		if (b == 2) {
			throw new DivideByTwoException("Dividing by 2");
		}
		if (b == 0) {
			throw new DivideByZeroException("Dividing By 0");

		}
	}

}
