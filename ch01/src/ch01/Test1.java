package ch01;

public class Test1 {

	public static void main(String[] args) {
		char a = '\uD64D';
		char b = '\uAE38';
		char c = '\uB3D9';
		
		char d = 0xD64D;
		System.out.println("char d:"+d);
		
		System.out.println(""+a+b+c);//""+'\uD64D' => "ȫ", "ȫ" + "\uAE38" => "ȫ��", "ȫ��" + '\uB3D9' => "ȫ�浿" 
		System.out.print(a);
		System.out.print(b);
		System.out.println(c);
		
		System.out.println(10+20);
		System.out.println(""+10+20);//"" + 10 => "10", "10" + 20 => "1020"
	}
}
