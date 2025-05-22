package week12;

public class Buds implements EarPhone {
	public Buds() {
		System.out.println("\n새로 구입한 Galaxy Buds 연결");
	}
	
	@Override
	public void play() {
		System.out.println("Galaxy Buds - 음악 재생중...");
	}

	@Override
	public void stop() {
		System.out.println("Galaxy Buds - 음악 멈춤");
	}
	
}
