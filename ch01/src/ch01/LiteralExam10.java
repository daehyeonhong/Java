package ch01;
//리터럴 자바 7 이후 버전
public class LiteralExam10 {

	public static void main(String[] args) {
		int price = 20_100;// 20100과 동일
		long cardNumber = 1234_5678_1357_9998L;// 1234567813579998L와 같음
		long controlBits = 0b10110100_01011011_10110011_111110000L;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		int age = 2______5;// 25와 동일
		
		System.out.println("price="+price);
		System.out.println("cardNumber="+cardNumber);
		System.out.println("controlBits"+controlBits);
		System.out.println("maxLong="+maxLong);
		System.out.println("age="+age);
	}
}
