package week06;
import java.util.*;

public class ArrayEx4 {

	public static void main(String[] args) {
		String[] students = {"김준호", "박소이", "박수빈", "김시현", "김지윤"};

		Scanner scn = new Scanner(System.in);
		System.out.println("찾고자 하는 학생의 이름을 입력하세요: ");
		String inputName = scn.next();
		boolean checkName = false;
		
		for (String student: students) {
			if (student.equals(inputName)) {
				checkName = true;
				break;
			}
		}
		
		if (checkName) {
			System.out.println(inputName + "은(는) 명단에 존재합니다.");
		} else {
			System.out.println(inputName + "은(는) 명단에 존재하지 않습니다.");
		}
		
		scn.close();
	}

}
