package ch01;

public class NullPointExceptionExample2 {
	public static void main(String[] args) {

		String str = null;
		str = "hello";// 문자열 리터럴로 생성하면 new String()처럼 생성됨
		System.out.println(str.hashCode());
		System.out.println("1번 " + System.identityHashCode(str));

		str = new String("hello");
		System.out.println(str.hashCode());
		System.out.println("2번 " + System.identityHashCode(str));
		System.out.println("총 문자수:" + str.length());

		str = new String("hello");
		System.out.println(str.hashCode());
		System.out.println("3번 " + System.identityHashCode(str));
		System.out.println("총 문자수:" + str.length());

		str = new String("hello");
		System.out.println(str.hashCode());// 객체가 저장된 HashCode값
		System.out.println("4번 " + System.identityHashCode(str));// 객체의 저장된 물리공간의 주소값

		String str1 = new String("hello");

		// str 변수와 str1 참조 변수가 가리키는 객체가 동일한가?false
		System.out.println(str == str1);
		// str 변수가 가리키는 객체의 내용은 str1 변수가 가리키는 객체의 내용이 같은가? true
		System.out.println(str.contentEquals(str1));
		System.out.println("총 문자수:" + str.length());
	}
}