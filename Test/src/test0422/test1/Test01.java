package test0422.test1;

public class Test01 {
	public static void main(String[] args) {
		int o, b, r, e;//변수명은 직관적으로
		o = 127;
		b = 12;//박스는 상수로 정의 가능.
		
		r = o/b;
		e = o%b;
		System.out.println(b+"개입 "+r+"상자, 나머지 "+e+"개");
	}
}