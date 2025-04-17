package week07;

import java.util.Random;

public class Car {
	// 자동차 객체를 만들기 위한 라이브러리용 클래스
	// 자동차 객체의 속성
	
	Random random = new Random();
	
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed = random.nextInt(100) + 130;
	
	// 생성자를 선언하지 않으면 기본생성자가 자동으로 생김
	// 하지만 하나라도 생성자를 선언하면 안생김
	
	// 생성자 오버로딩(overLoading) => 객체 초기화를 다양하게
	Car() {
		// 기본 생성자
		this.company = "Mola";
		this.model = "Casper";
		this.color = "Green";
		this.maxSpeed = 180;
	}
	
	Car(String model) {
		// this.model = model;
		// this.color = "Black";
		// this.maxSpeed = 300;
		this("Mola", model, "Black", 300);
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
		this.maxSpeed = 300;
	}
	
	Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
