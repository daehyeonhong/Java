package ch10;

public class Television {
	String company;
	String model;
	String info;

	// instance �ʱ�ȭ ��
	{
		company = "samsung";
		model = "UHD8K";
		info = company + model;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", model=" + model + ", info=" + info + "]";
	}
}