package Exception;

public class Demo {
	public static void main(String[] args) {
		System.out.println("welcome");
		int num1 = 10;
		int num2 = 0;
		System.out.println(num1);
		System.out.println(num2);
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
			// System.out.println("Values not divide by zero ");
			// System.out.println(e);
			 e.printStackTrace();
		}
		System.out.println("thank you");
	}

}
