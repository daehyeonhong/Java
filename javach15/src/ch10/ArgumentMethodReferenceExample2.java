package ch10;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceExample2 {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function = new ToIntBiFunction<String, String>() {

			@Override
			public int applyAsInt(String t, String u) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
//function = (t, u) -> t.compareToIgnoreCase(u);