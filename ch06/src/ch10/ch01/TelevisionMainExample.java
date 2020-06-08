package ch10.ch01;

public class TelevisionMainExample {
	public static void main(String[] args) {
		Television[] tvs = new Television[5];
		
		for (int i = 0; i < tvs.length; i++) {
			tvs[i]=new Television();
		}
		for (Television t : tvs) {
			System.out.println(t);
		}
	}
}