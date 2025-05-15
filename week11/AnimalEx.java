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

		System.out.println("\n-- [매개 변수의 다양성] --\n");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
		
		// animal.dogLife(); = 자식 클래스에만 정의된 필드나 메소드는 강제타입 변환을 해야 접근이 가능함.

		if (animal instanceof Dog) {
			System.out.println("\n-- [Dog 객체로 변환 가능] --\n");
			Dog dog = (Dog)animal;
			dog.dogLife();
		} else if (animal instanceof Cat) {
			System.out.println("\n-- [Cat 객체로 변환 가능] --\n");
			Cat cat = (Cat)animal;
			cat.catLife();
		}
	}
}
