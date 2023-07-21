package Exception;

public class Login {
	public static void main(String[] args) throws LoginException {
		System.out.println("Welcome");
		String id = args[0];
		String pass = args[1];
		if (id.equals("1168") && pass.equals("yogi")) {
			System.out.println("Your id processing");
		} else {
			throw new LoginException("Your id not Authorzied");
		}
		System.out.println("thank u");
	}
}