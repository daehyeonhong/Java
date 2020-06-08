package ch01;
//단항 연산자 :부호(+,-)
public class SignOperationExample {

	public static void main(String[] args) {
		int x= -100;//리터럴 앞에 부호(-)
		int result1 = +x;//변수 앞에 부호(+)
		int result2 = -x;//변수 앞에 부호(-):-(-100) => +100
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);

		short s = 100;
		//short result3 = -s;//-byte =>int 타입으로 변환 되어서 저장 불가
		int result = -s;
		System.out.println("result=" + result);
		
	}

}
