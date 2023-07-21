package Exception;

public class Demo {
	public static void main(String[] args) {
		System.out.println("welcome");
		int n1 = 10;
		int n2 = 0;
		System.out.println(n1);
		System.out.println(n2);
		try {
			System.out.println(n1 / n2);
		} catch (Exception e) {
			// System.out.println("Values not divide by zero ");
			// System.out.println(e);
			 e.printStackTrace();
		}
		System.out.println("thank you");
	}

}
