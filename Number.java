package Exception;

public class Number {
	public static void main(String[] args) {
		String a = "yogesh";
		try {
			int b = Integer.parseInt(a);
		} catch (ArithmeticException aa) {
			System.out.println("is arithmetic");
		} catch (NullPointerException bb) {
			bb.printStackTrace();
		} catch (NumberFormatException cc) {
			System.out.println("numberFormateException");
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("hello");
		}

	}
}
