package chap03;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte타입은 int타입으로 변환 후 연산에 참여
		//int byteValue3 = byteValue1 + byteValue2;
		int intValue = byteValue1 + byteValue2;
		
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char 타입은 int타입으로 변환 후에 연산에 참여
		//int charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드"+intValue2);
		System.out.println("출력문자"+(char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue;
		System.out.println(intValue);
		
		int intValue5 = 10;
		//int intValue6 = 10/4.0;
		double doubleValue = intValue5/4.0;
		System.out.println(doubleValue);
		
		System.out.println(intValue3);
		System.out.println(intValue4);
	}
}
