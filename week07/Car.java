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
	
	Car() {
		// 기본 생성자
	}
	
	Car(String rCompany, String rModel, String rColor, int rMaxSpeed) {
		this.company = rCompany;
		this.model = rModel;
		this.color = rColor;
		this.maxSpeed = rMaxSpeed;
	}
}
