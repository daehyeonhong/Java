package Exercise.DATE0428;

public class PromotionCastingExam {
	public static void main(String[] args) {
		int intValue = 103029770;
		System.out.println(toBinary(intValue));
		byte byteValue = (byte) intValue;// 강제형변환

		System.out.println(byteValue);// 값 손실 발생
		System.out.printf(toBinary(byteValue));
		System.out.println();
		int var = 0x12340041;
		System.out.println(toBinary(var));
	}

	//32비트
	public static String toBinary(int intVar) {
		String str = Integer.toBinaryString(intVar);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

	//8비트
	public static String toBinary(byte byteVar) {
		String str = Integer.toBinaryString(byteVar);
		while (str.length() < 8) {
			str = "0" + str;
		}
		return str;

	}
}