package ch01;

public class Handle {
	// 속성
	String rotation;

	// 기능
	public void turn(String rotation) {
		this.rotation = rotation;
	}

	// 기능
	public String getTurn() {
		return rotation;
	}
}