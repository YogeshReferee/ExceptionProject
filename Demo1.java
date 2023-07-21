package Exception;

public class Demo1 {
	public static void main(String[] args) {
		String a = "Yogesh";
		try {
			int num = Integer.parseInt(a);
			System.out.println(num);
		} catch (ArithmeticException aa) {
			System.out.println("is arithmetic");
		} catch (NullPointerException bb) {
			System.out.println("is NullPointer");
		} catch (NumberFormatException cc) {
			System.out.println("numberFormateException");
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
