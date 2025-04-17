package week07;

public class StudentEx {
	public static void main(String[] args) {
		// 실행 클래스
		// 라이브러리용 클래스를 이용해서 객체 생성
		Student st1 = new Student();
		System.out.println("st1 변수는 Student 객체를 참조한다 - " + st1);
		
		// 설계도에 해당하는 클래스를 이용하면
		Student st2 = new Student();
		System.out.println("st2 변수는 Student 객체를 참조한다 - " + st2);
	}
}
