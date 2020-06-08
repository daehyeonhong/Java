package Exercise.DATE0526.testA;

public class A_a {
	private static A_a instance;
	private String message = "a";

	public static A_a getInstance() {
		if (instance == null) {
			instance = new A_a();
		}
		return instance;
	}

	private A_a() {
		message = "a";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}