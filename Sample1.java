package Exception;

public class Sample1 {
	public static void main(String[] args) {
		String a = null;
		try {
			System.out.println(a.toUpperCase());
		} catch (ArithmeticException aa) {
			System.out.println("is arithmetic");
		} catch (NullPointerException bb) {
			bb.printStackTrace();
		} catch (NumberFormatException cc) {
			System.out.println("numberFormateException");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("hi");
	}
}
