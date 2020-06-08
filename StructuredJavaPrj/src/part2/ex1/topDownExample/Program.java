package part2.ex1.topDownExample;

public class Program {
	public static void main(String[] args) {
		int[][] lottos = null;
		int menu;
		boolean running = true;
		while (running) {
			menu = inputMenu();
			switch (menu) {
			case 1:
				lottos = createLottosAuto();
				break;
			case 2:
				lottos = createLottoManual();
				break;
			case 3:
				printLottos(lottos);
				break;
			case 4:
				running = false;
				break;
			}
		}
	}

	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub

	}

	private static int[][] createLottoManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] createLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {

		return 0;
	}
}