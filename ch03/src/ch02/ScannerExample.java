package ch02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		//Scanner instance 생성
		// new 클래스명([매개변수]);
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		
		while(isRun) {
			System.out.println("이름을 입력하세요:");
			String name = scanner.next();//키보드 입력토큰을 문자열로 출력
			System.out.println("거주 도시를 입력하세요:");
			String city = scanner.next();//키보드 입력토큰을 문자열로 출력
			System.out.println("나이를 입력하세요:");
			int age = scanner.nextInt();//키보드 입력 토큰을 int로 출력
			System.out.println("몸무게를 입력하세요:");
			double weight = scanner.nextDouble();//키보드 입력토큰을 double로 출력
			System.out.println("미혼여부를 true/false로 입력하세요");
			boolean single = scanner.nextBoolean();//키보드 입력토큰을 boolean으로 출력
			
			System.out.println("이름:"+name);
			System.out.println("도시:"+city);
			System.out.println("나이:"+age);
			System.out.println("몸무게:"+weight);
			System.out.println("미혼여부:"+single);
			
			System.out.println("계속할까요?:");
			System.out.println("Yes/No");
			char yesNo = scanner.next().charAt(0);//문자 하나 받기
			if(yesNo=='n' || yesNo=='N') {
				isRun =! isRun;
			}
		}//while문 끝.
		System.out.println("종료");
		//Scanner인스턴스 제거
		scanner.close();
	}
}
