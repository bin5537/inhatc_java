package week11;

public class AnimalEx {
	public static void main(String[] args) {
		// 추상 클래스는 객체 생성이 불가능
		// 대신, 상속은 가능
		// Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();

		System.out.println("\n-- [자동 타입 변환] --\n");
		
		Animal animal = dog;
		animal.sound();
		animal = cat;
		animal.sound();
	}
}
