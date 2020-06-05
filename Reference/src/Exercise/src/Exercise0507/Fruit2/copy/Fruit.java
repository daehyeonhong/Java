package Exercise.src.Exercise0507.Fruit2.copy;

public class Fruit {

	private String kind;
	private int prise;
	private Brix brix;
	private int sale;
	// 생성자 3개 짜리

	public int getSale(int i) {
		return sale-=i;
	}

	public Fruit(String kind, int prise, Brix brix) {
		this.kind = kind;
		this.prise = prise;
		this.brix = brix;
	}

	@Override
	public String toString() {
		return "Fruit [kind=" + kind + ", prise=" + prise + ", brix=" + brix + "]";
	}

	public String getKind() {
		return kind;
	}

	public int getPrise() {
		return prise;
	}

	public Brix getBrix() {
		return brix;
	}

}