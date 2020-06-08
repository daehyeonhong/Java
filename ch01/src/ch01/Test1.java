package ch01;

public class Test1 {

	public static void main(String[] args) {
		char a = '\uD64D';
		char b = '\uAE38';
		char c = '\uB3D9';
		
		char d = 0xD64D;
		System.out.println("char d:"+d);
		
		System.out.println(""+a+b+c);//""+'\uD64D' => "全", "全" + "\uAE38" => "全辨", "全辨" + '\uB3D9' => "全辨悼" 
		System.out.print(a);
		System.out.print(b);
		System.out.println(c);
		
		System.out.println(10+20);
		System.out.println(""+10+20);//"" + 10 => "10", "10" + 20 => "1020"
	}
}
