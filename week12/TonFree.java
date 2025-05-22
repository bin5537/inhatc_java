package week12;

public class TonFree implements EarPhone {
	TonFree() {
		System.out.println("\nLG 블루투스 이어폰 톤프리 연결");
	}
	@Override
	public void play() {
		System.out.println("LG TonFree - 음악 재생중...");
	}

	@Override
	public void stop() {
		System.out.println("LG TonFree - 음악 멈춤");
	}

}
