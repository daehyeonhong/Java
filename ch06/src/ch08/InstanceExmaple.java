package ch08;

public class InstanceExmaple {
	// non-static 멤버(인스턴스 맴버)는 객체 생성없이는 사용 불가
	int field1;

	// field2는 로드 되어서 생성돼있지만, field1는 인스턴트 맴버이므로 생성돼있지 않음.
	// field2가 field1을 사용 불가
	// static int field2 = field1 + 10;

	// 로드된 field2의 초기값은 0
	// int field3 = field2 + 10;

	public static void main(String[] args) {

	}
}