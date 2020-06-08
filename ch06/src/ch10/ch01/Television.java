package ch10.ch01;

public class Television {
	// static 멤버
	static String company = "samsung";
	static String model;
	static String info;
	static int seq;

	// 인스턴스 멤버
	String iInfo;

	// static 초기화 블럭
	static {
		model = "UHD4K";
		info = company + model;
	}

	Television() {
		iInfo = info + ++seq;
	}

	@Override
	public String toString() {
		return "Television [iInfo=" + iInfo + "]";
	}

}