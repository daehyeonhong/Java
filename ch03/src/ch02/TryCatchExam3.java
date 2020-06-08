package ch02;

public class TryCatchExam3 {
	public static void main(String[] args) {
		System.out.println("hello");
		try {
			returnExcept();//함수 호출(실행) - 함수명을 기술;
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		System.out.println("hi");
	}
	//메소드
	//접근제한자 생성위치 리턴타입 메소드명() throws 던질예외{명령문;}
	public static void returnExcept() throws Exception {
		throw new Exception("강제 오류발생");
	}
}
