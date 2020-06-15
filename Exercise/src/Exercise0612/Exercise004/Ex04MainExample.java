package Exercise0612.Exercise004;

public class Ex04MainExample {
	public static void main(String[] args) {
		Member1 member = new Member1("blue", "이파란");
		System.out.println(member);// member가 print문의 매개변수로 넘어가면 toString()자동 호출
	}
}

class Member1 {
	private String id;
	private String name;

	public Member1(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member1 [id=" + id + ", name=" + name + "]";
	}
}