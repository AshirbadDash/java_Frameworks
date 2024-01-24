package exception;

public class Throw{
	public static void main(String[] args) {
		int p = 100;
		int q = 0;
//		int c = a / b;
//		System.out.println(c);
		Test test = new Test();
		try {

			test.divide(100, 0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception handled");
		}
	}

//  EXCEPTION OBJECT
	// exception class name
	// description (message)
	// stack trace(location)

//	default exception handler

}

class Test {
	int a = 10;
	int b = 30;

	void divide(int a, int b) {
		this.a = a;
		this.b = b;

		int c = a / b;
		throw new ArithmeticException();
//		System.out.println(c);

	}
}
