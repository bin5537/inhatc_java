package week07;

public class KoreanEx {
	public static void main(String[] args) {
		Korean myInfo = new Korean("박수빈", "051115-1234567", "010-1234-5678");
		System.out.printf("국적: %s \n이름: %s \n주민등록번호: %s \n전화번호: %s", myInfo.nation, myInfo.name, myInfo.ssn, myInfo.phoneNum);
	}
}
