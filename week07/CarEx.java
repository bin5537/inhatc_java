package week07;

public class CarEx {
	public static void main(String[] args) {
		// 실행 클래스
		// 객체 생성
		Car myCar = new Car();
		
		// 필드값 출력
		// 객체의 속성(필드) 값을 접근할 때는 반드시 객체 변수명으로 접근
		System.out.println("==== My Car ====");
		System.out.println("Company: " + myCar.company);
		System.out.println("Model: " + myCar.model);
		System.out.println("Color: " + myCar.color);
		System.out.println("Max Speed: " + myCar.maxSpeed);
		System.out.println("Speed: " + myCar.speed);
		
		System.out.println();
		
		// 너 차
		Car yourCar = new Car();
		yourCar.company = "Hyundai";
		yourCar.model = "Santafe";
		yourCar.color = "Black";
		
		System.out.println("==== Your Car ====");
		System.out.println("Company: " + yourCar.company);
		System.out.println("Model: " + yourCar.model);
		System.out.println("Color: " + yourCar.color);
		System.out.println("Max Speed: " + yourCar.maxSpeed);
		System.out.println("Speed: " + yourCar.speed);
		
		System.out.println();
		
		// 매개변수를 이용하여 초기화 하는 생성자를 이용
		Car myCar2 = new Car("Kia", "Sorento", "White", 350);
		
		System.out.println("==== My Car 2 ====");
		System.out.println("Company: " + myCar2.company);
		System.out.println("Model: " + myCar2.model);
		System.out.println("Color: " + myCar2.color);
		System.out.println("Max Speed: " + myCar2.maxSpeed);
		System.out.println("Speed: " + myCar2.speed);
		
		System.out.println();

		// 너 차 2
		Car yourCar2 = new Car("Hyundai", "Sonata", "Silver", 290);
		
		System.out.println("==== Your Car 2 ====");
		System.out.println("Company: " + yourCar2.company);
		System.out.println("Model: " + yourCar2.model);
		System.out.println("Color: " + yourCar2.color);
		System.out.println("Max Speed: " + yourCar2.maxSpeed);
		System.out.println("Speed: " + yourCar2.speed);
	}
}
