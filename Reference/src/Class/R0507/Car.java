package Class.R0507;

public class Car {
	// �ʵ�
	String company;
	String model;
	int year;

	Car() {

	}

	// ������
	Car(String company) {// �Ű����� String 1��¥�� ������
		this.company = company;
	}

	// �Ű� ������ Ÿ��, ����, ������ �ٸ��� �ٸ� �����ڷ� �ν�
	Car(String company, String model) {// �Ű����� String, String 2��¥�� ������
		this(company);// ���� �Ű� ���� 1�� ¥�� ������ ȣ��
		this.model = model;
	}

	// �ڹٴ� �Ű� ������ Ÿ�����θ� ����, �Ű� �������� ����
	Car(int year, String company, String model) {// �Ű����� String, String, int 3��¥�� ������
		this(company, model);// ���� �Ű� ���� 2��¥�� ������ ȣ��
		this.year = year;
	}

	Car(String company, int year, String model) {// �Ű����� String, String, int 3��¥�� ������
		this.company = company;
		this.model = model;
		this.year = year;
	}

	Car(String company, String model, int year) {// �Ű����� String, String, int 3��¥�� ������
		this.company = company;
		this.model = model;
		this.year = year;
	}
	// �޼ҵ�
}