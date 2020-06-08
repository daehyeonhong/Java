package ch01;
//단항 연산:증감(++,--)
public class IncreaseDecreaseOperationExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------");
		x++;//후치연산
		System.out.println("x=" + x);
		++x;//전치연산
		System.out.println("x=" + x);
		
		System.out.println("------------");
		y--;//후치연산
		System.out.println("y="+y);
		--y;//전치연산
		System.out.println("y="+y);
		
		System.out.println("------------");
		z = x++;//현재 x값 12를 z에 대입 후 1증가(13)
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------");
		z = ++x;//현재 x값 1증가한 14로 바뀐 후 z에 대입
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------");
		z = ++x + y++;//z = 15 + 8
		System.out.println("z=" + z);//23
		System.out.println("x=" + x);//15
		System.out.println("y=" + y);//9
	}
}
