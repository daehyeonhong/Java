package ch08;

public class ArrayExample65 {
	public static void main(String[] args) {
		String[][] strArray = { 
				{ "hong", "1234", "seoul" }, 
				{ "kim", "1111", "suwon" },
				{ "wang", "3333", "bucheon" } 
		};

		for (String[] strings : strArray) {
			int count = 0;

			for (String string1 : strings) {
				System.out.print(string1);

				if (count++ != strArray.length - 1) {
					System.out.print(", ");
				}

			}
			System.out.println();
		}
	}
}