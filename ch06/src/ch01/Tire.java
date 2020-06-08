package ch01;

public class Tire {
	//타이어 사용횟수
	int runCount;
	//생성자 초깃값 사용횟수5
	Tire() {
		runCount = 5;
	}
	//한 번 사용시 횟수 1씩 감소
	void run() {
		runCount--;
	}
}