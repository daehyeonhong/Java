package Exercise0511.Exercise018T;

//�̱���
//�ڽ� Ÿ���� instance�ʵ� ���� �� �ʱ�ȭ ���� �����ڴ� private
//�⺻ �����ڴ� private�� ����
//�ڽ� Ÿ���ǰ�ü instance�� ���� �� �� �ִ� public ���� ������ getInstance()�� ����
public class ShopService {
	private static ShopService instance = new ShopService();

	private ShopService() {

	}

	public static ShopService getInstance() {
		return instance;
	}
}