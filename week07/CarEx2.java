package week07;

public class CarEx2 {
	public static void main(String[] args) {
		// 실행 클래스
		// 오버로딩된 생성자 이용
		Car car1 = new Car();
		System.out.printf("Car1: %s %s %d\n", car1.model, car1.color, car1.maxSpeed);

		Car car2 = new Car("Santafe");
		System.out.printf("Car2: %s %s %d\n", car2.model, car2.color, car2.maxSpeed);

		Car car3 = new Car("Sonata", "White");
		System.out.printf("Car3: %s %s %d\n", car3.model, car3.color, car3.maxSpeed);
		
		Car car4 = new Car("Avante", "Blue");
		System.out.printf("Car4: %s %s %d\n", car4.model, car4.color, car4.maxSpeed);
	}
}
