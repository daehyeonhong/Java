package ch08;

public class ArrayExample64 {
	public static void main(String[] args) {
		String[] snake = { "±∏∑∑¿Ã", "∆»∑∑¿Ã", "ƒ•∑∑¿Ã", "¿∞∑∑¿Ã", "ø¿∑∑¿Ã" };
		for (int i = 0; i < snake.length; i++) {
			System.out.print(snake[i]);
			if (i != snake.length - 1) {
				System.out.print(" " + ", ");
			}
			if (i == snake.length - 1) {
				System.out.print("!!!");
			}
		}
		System.out.println();

		int count = 0;
		for (String s : snake) {
			System.out.print(s);
			if (count++ != snake.length - 1) {
				System.out.print(" " + ", ");
			}

		}
		System.out.println();
	}
}