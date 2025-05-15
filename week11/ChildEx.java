package week11;

public class ChildEx {
	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		
		// child.method2(); = 부모한테 상송받은 메소드라도, 자식 클래스에서 재정의 되면 재정의 된 메소드가 호출됨.
		child.method2();
		child.method3();
		
		child.field1 = "aaa";
		child.field2 = "bbb";
		
		System.out.println("\n-- [자동 타입 변환] --\n");
		
		// 클래스의 자동 타입 변환 (부모 클래스 변수 <- 자식 객체를 대입)
		Parent parent = child;
		parent.method1();
		
		// parent.method2(); = 부모 클래스 변수라도 자식 클래스에서 재정의 된 메소드가 호출됨.
		parent.method2();
		// parent.method3(); = 자식 객체가 부모 클래스 변수에 자동 타입 변환이 되어도 
		// 부모 클래스 변수는 자식 클래스에만 정의 된 메소드는 호출 불가
		// 부모 클래스 변수는 부모 클래스에 정의 된 것만 접근 가능
		
		parent.field1 = "aaa";
		// parent.field2 = "bbb";
		
		// 강제 타입 변환 (casting)
		Child child2 = (Child)parent;
		child2.field2 = "bbb";
		child2.method3();
		
		// 순수 부모 객체를 casting 해 보자.
		// Parent parent2 = new Parent();
		// Child child3 = (Child)parent2;
		// child3.method3();
	}
}
