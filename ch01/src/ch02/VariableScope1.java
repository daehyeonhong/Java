package ch02;

public class VariableScope1 {

	public static void main(String[] args) {
		int var1;//main 메소드 내에서 선언된 로컬 변수
		
		if(true) {
			int var2;
			var1 = 10;//main 메소드 내의 if 블럭에서 사용 가능
			var2 = 20;
			System.out.println("var1="+var1);
			System.out.println("var2="+var2);
			//System.out.println("var3="+var3); 다른 블럭 내의 변수 사용 불가
		}
		
		for(int i = 0; i < 10; i++) {
			int var3;
			var3 = i;//정수 변수 var3에 정수 변수i의 값을 대입
			System.out.println("var3="+var3);
			System.out.println("var1="+var1);
			//System.out.println("var2="+var2); 다른 블럭 내의 변수 사용 불가
			var1 = 20;//main 메소드 내의 for 블럭에서 사용 가능
		}
		
		System.out.println("var1="+var1);//main 메소드 내에서 사용 가능
		//System.out.println("var2="+var2);//하위 블럭에서 선언된 변수는 상위 블럭에서 사용 불가
		//System.out.println("var3="+var3);//하위 블럭에서 선언된 변수는 상위 블럭에서 사용 불가
		
	}
}
