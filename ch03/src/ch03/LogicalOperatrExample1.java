package ch03;

public class LogicalOperatrExample1 {
	public static void main(String[] args) {
		System.out.println(!true);
		System.out.println();
		
		//^ ������ false �ٸ��� true
		System.out.println(true^true);	//false
		System.out.println(true^false);	//true
		System.out.println(false^true);	//true
		System.out.println(false^false);//false
		System.out.println();
		
		//|,|| �� ���� true�� �ٸ� �� ��� ���� ����� true
		System.out.println(true|true);	//true
		System.out.println(true|false);	//true
		System.out.println(false|true);	//true
		System.out.println(false|false);//false
		System.out.println();
		
		// &, && �� ���� false�� �ٸ� �� �� ��� ���� ����� false
		System.out.println(true&true);	//true
		System.out.println(true&false);	//false
		System.out.println(false&true);	//false
		System.out.println(false&false);//false
		
	}
}