package ch01;
//리터럴- 정수리터럴의 기본 타입-int/실수 리터럴의 기본 타입-double
public class LiteralExam9 {

		public static void main(String[] args) {
			
			int i = 12;//정수 타입의 리터럴은 int타입이 default
			int j = 24;//int 타입 리터럴로 간주
			long l = 24l;
			float f = 0.1234f;
			double d = .1234d;//실수 타입의 리터럴은 double 타입이 default
			float e = (float) .1234;//실수 타입 double 리터럴로 간주
			
			System.out.println("i="+i);
			System.out.println("l="+l);
			System.out.println("f="+f);
			System.out.println("d="+d);
			System.out.println("j="+j);
			System.out.println("e="+e);
			
		}
}
