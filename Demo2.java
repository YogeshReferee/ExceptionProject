package Exception;

public class Demo2 {
	public static void main(String[] args) {
		String a=args[0];
		try {
		System.out.println(a.charAt(30));
		}
		catch (ArithmeticException aa) {
			System.out.println("is arithmetic");
		} catch (NullPointerException bb) {
			System.out.println("is NullPointer");
		} catch (StringIndexOutOfBoundsException cc) {
			System.out.println("StringIndexOutOfBoundsException");
		} catch (Exception e) {
			System.out.println(e);
}
		finally {
			System.out.println("good");
		}
		}
}


