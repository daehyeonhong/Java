package Exercise0423.Exercise03;

public class Exercise03R {
	public static void main(String[] args) {
		int score = 85;
		String result = !(score > 90)? "��" : "��";//false->true
		System.out.println("result:"+result);
		
		if (!(score>90)) {
			result = "��";
		} else {
			result = "��";
		}
		System.out.println("result:"+result);
	}
}
