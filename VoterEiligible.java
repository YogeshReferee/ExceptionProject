package Exception;

public class VoterEiligible {
	public static void main(String[] args) throws AgeException {
		System.out.println("welcome");
		int a = Integer.parseInt(args[0]);
		if (a >= 18) {
			System.out.println("Eiligible");
		} else {
			throw new AgeException("not Eiligible");
		}
		System.out.println("continues the process");
		System.out.println("thank u");
	}

}
