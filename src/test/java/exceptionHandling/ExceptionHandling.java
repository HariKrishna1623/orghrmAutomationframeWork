package exceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {
System.out.println("execution started");
		int a = 10;
		int b = 0;
		int c = 0;
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		finally {
			System.out.println(c);
			System.out.println("ececution end");
		}
	}

}
