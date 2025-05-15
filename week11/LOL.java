package week11;

public class LOL extends Game {

	public LOL(String title, String version) {
		super(title, version); // 부모 클래스의 생성자로 초기화
	}
	
	@Override
	public void gameDesc() {
		System.out.println("롤은 세계 최고의 MOBA 게임입니다.");
	}
}
