package Class.R0507;

public class Car {
	// 필드
	String company;
	String model;
	int year;

	Car() {

	}

	// 생성자
	Car(String company) {// 매개변수 String 1개짜리 생성자
		this.company = company;
	}

	// 매개 변수의 타입, 갯수, 순서가 다르면 다른 생성자로 인식
	Car(String company, String model) {// 매개변수 String, String 2개짜리 생성자
		this(company);// 위의 매개 변수 1개 짜리 생성자 호출
		this.model = model;
	}

	// 자바는 매개 변수의 타입으로만 구분, 매개 변수명은 무관
	Car(int year, String company, String model) {// 매개변수 String, String, int 3개짜리 생성자
		this(company, model);// 위에 매개 변수 2개짜리 생성자 호출
		this.year = year;
	}

	Car(String company, int year, String model) {// 매개변수 String, String, int 3개짜리 생성자
		this.company = company;
		this.model = model;
		this.year = year;
	}

	Car(String company, String model, int year) {// 매개변수 String, String, int 3개짜리 생성자
		this.company = company;
		this.model = model;
		this.year = year;
	}
	// 메소드
}