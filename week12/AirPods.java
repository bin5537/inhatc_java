package week12;

public class AirPods implements EarPhone {
	public AirPods() {
		System.out.println("\n새로 구입한 Apple AirPods 연결");
	}
	
	@Override
	public void play() {
		System.out.println("Apple AirPods - 음악 재생중...");
	}

	@Override
	public void stop() {
		System.out.println("Apple AirPods - 음악 멈춤");
	}
	
}
