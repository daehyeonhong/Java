package sec01.exam04;

public interface RemoteControl {
	// constructor
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// method
	void turnOn();

	void turnOff();

	void setVolume(int volume);
}