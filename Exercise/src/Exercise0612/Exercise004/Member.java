package Exercise0612.Exercise004;

public class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// 여기서 코드를 작성하세요.
	@Override
	public String toString() {
		return (getId() + ": " + getName());
	}
}
