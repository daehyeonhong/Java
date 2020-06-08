package ch03;

public class LogicalOperatrExample1 {
	public static void main(String[] args) {
		System.out.println(!true);
		System.out.println();
		
		//^ 같으면 false 다르면 true
		System.out.println(true^true);	//false
		System.out.println(true^false);	//true
		System.out.println(false^true);	//true
		System.out.println(false^false);//false
		System.out.println();
		
		//|,|| 한 쪽이 true면 다른 쪽 상관 없이 결과는 true
		System.out.println(true|true);	//true
		System.out.println(true|false);	//true
		System.out.println(false|true);	//true
		System.out.println(false|false);//false
		System.out.println();
		
		// &, && 한 쪽이 false면 다른 한 쪽 상관 없이 결과는 false
		System.out.println(true&true);	//true
		System.out.println(true&false);	//false
		System.out.println(false&true);	//false
		System.out.println(false&false);//false
		
	}
}