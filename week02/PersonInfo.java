package week02;

public class PersonInfo {
	public static void main(String[] args) {
		String name = "박수빈";
		int age = 21;
		double height = 170;
		char gender = 'M';
		boolean isStudent = true;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		String height_formatted = String.format("%.1f", height);
		System.out.println("키 : " + height_formatted + "cm");
		System.out.println("성별 : " + gender);
		System.out.println("학생 여부 : " + isStudent);
	}
}
