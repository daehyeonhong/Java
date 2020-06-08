package chap03;

public class FloatExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		//float var2 = 3.14;//float변수  = double 리터럴>>>오류 발생
		float var3 = 3.14f;//실수값f형태로 float타입 리터럴 표현
		
		//정밀도
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789f;
		
		System.out.println("var1:"+var1);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		System.out.println("var5:"+var5);
		
		//E
		int var6 = 3000000;
		double var7 = 3e6;// 3*10^6 double타입
		float var8 = 3e6f;//3*10^6 flaot 타입
		double var9 = 2e-3;//2*10^-3 double 타입
		
		System.out.println("var6:"+var6);
		System.out.println("var7:"+var7);
		System.out.println("var8:"+var8);
		System.out.println("var9:"+var9);
	}
}
