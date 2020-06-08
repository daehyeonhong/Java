package Exercise0511.Exercise018T;

//싱글톤
//자신 타입의 instance필드 선언 및 초기화 접근 제한자는 private
//기본 생성자는 private로 선언
//자신 타입의객체 instance를 접근 할 수 있는 public 접근 제한자 getInstance()를 선언
public class ShopService {
	private static ShopService instance = new ShopService();

	private ShopService() {

	}

	public static ShopService getInstance() {
		return instance;
	}
}