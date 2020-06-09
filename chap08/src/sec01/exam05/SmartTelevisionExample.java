package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {

		SmartTelevision tv = new SmartTelevision();

		RemoteControl rc = tv;
		rc.turnOff();
		rc.setVolume(5);
		rc.turnOff();

		Searchable searchable = tv;
		searchable.search("http://www.naver.com");
	}
}