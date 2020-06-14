package Exercise0612.Exercise012;

public class StringConverterExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = new Integer(strData1);
		// intData1 = Integer.parseInt(strData1);
		// intData1 = Integer.valueOf(strData1);

		int intData2 = 150;
		String strData2 = Integer.toString(intData2);
		// strData2 = String.valueOf(intData2);

		System.out.println(intData1);
		System.out.println(strData2);
	}
}