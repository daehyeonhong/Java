package Exercise0511.Exercise014T;

public class Member {
	// �ʵ�
	private String name;
	private String id;
	private String password;
	private int age;

	// ������
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	// getters/setters �޼ҵ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}