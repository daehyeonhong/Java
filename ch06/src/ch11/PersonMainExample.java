package ch11;

public class PersonMainExample {
	public static void main(String[] args) {
		Person person = new Person("001130-1234567", "홍길동");
		System.out.println(person.nation);
		System.out.println(person.ssn);
		System.out.println(person.name);
		// 수정 - 변수는 수정 가능
		person.name = "일지매";
		// 상수는 최초 초기화 이후에는 수정 불가
		// person.nation = "usa";
		// person.ssn = "001025-1234567";
		System.out.println(person.name);
	}
}