package ch02;

public class Test4 {

	public static void main(String[] args) {
		int birthYear = 2001;
		
		System.out.println("안녕하세요 \t 여러분\n");
		System.out.println("저의 이름은" + ' ' + "\'홍길동\'" + "입니다");
		System.out.println("그리고, 저는 올 해" + ' ' + '(' + (2020 - birthYear + 1) + ')' + "살 입니다.");
		
		
		/*int age = 2020 - birthYear + 1;
		System.out.println("그리고, 저는 올 해 ("+age+")살 입니다");*/
		
		int age1 = 1;
		int thisYear = 2020;
		while(birthYear<thisYear) {
			age1 ++;
			birthYear ++;
		}
		
		System.out.println("그리고, 저는 올 해 ("+age1+")살 입니다");
	}
}
