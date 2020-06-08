package chap03;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		int i = 128;
		System.out.println("최소값:" + Byte.MIN_VALUE);
		System.out.println("최대값:" + Byte.MAX_VALUE);
		
		if((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) { // '||' or연산 A || B -> A가 참이거나 B가 참이면 참
			System.out.println("byte타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		}else {
			byte b = (byte)i;// -128~127;, 초기값으로 128 입력 불가
			System.out.println(b);
		}
		
		byte b = (byte)i;// -128~127;, 초기값으로 128 입력 불가
		System.out.println(b);
		
	}
}
