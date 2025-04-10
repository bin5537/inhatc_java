package week06;

public class ReferenceString {

	public static void main(String[] args) {
		String ssn = "0511151234567";
		
		// 문자열은 0번부터 인덱스를 갖는다.
		// 한개 문자 추출
		char gender = ssn.charAt(6);
		switch (gender) {
			case '1', '3' -> System.out.println("성별: 남자");
			case '2', '4' -> System.out.println("성별: 여자");
		}
		
		int length = ssn.length();
		if (length == 13) {
			System.out.println("올바른 주민등록번호 입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호 입니다.");
		}
		
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "Java");
		System.out.printf("Old: %s , New: %s\n", oldStr, newStr);
		
		// 문자열 잘라내기/추출하기
		String firstNum = ssn.substring(0, 6);
		System.out.println("생년월일: " + firstNum);
		String LastNum = ssn.substring(6);
		System.out.println("주민등록번호: " + LastNum);
		
		// 문자열 찾기
		// String oldStr = "자바 프로그래밍";
		// indexOf: 특정 단어가 문자열에서 시작되는 인덱스 값을 반환
		int index = oldStr.indexOf("프로그래밍");
		
		// 찾고자 하는 단어가 문자열 안에 없는경우
		if (index == -1) {
			System.out.println("프로그래밍 단어가 존재하지 않습니다.");
		} else {
			System.out.println(index + "번 인덱스에 프로그래밍 단어가 존재합니다.");
		}
		
		boolean result = oldStr.contains("자바");
		if (result) {
			System.out.println("자바와 관련된 문자열 입니다.");
		} else {
			System.out.println("자바와 관련되지 않은 문자열 입니다.");
		}
		
		// split 을 이용해 문자열 나누기
		String board = "1, 자바학습, 참조타입 String 클래스, 홍길동";
		String[] tokens = board.split(",");
		for (int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i].trim());
		}
		
		// 향상된 for문 사용
		for (String str: tokens) {
			System.out.println(str.trim());
		}
	}

}
