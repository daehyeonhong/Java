package ch01;
//리터럴 - 특수 용도의 문자 (escape문자)
// \로 시작
public class LiteralExam7 {
	
	public static void main(String[] args) {
		
		System.out.println("hello \t 여러분");//한 탭 만큼 공백 띄우기
		System.out.println("\n 반갑습니다 \n");//한 줄 아래로 내리기
		System.out.println("\'홍길동\'님!!!");// '인용 부호
		System.out.println("\"일지매\"도 반갑습니다.");// \" "인용 부호
		System.out.println("c:\\workspace\\ch01\\LiteralExam7.java");//디렉토리 경로 지정 \\인용 부호
		System.out.println("\uac00");//unicode 입력 다음에 오는 \uac00이 유니코드
		
	}
}
