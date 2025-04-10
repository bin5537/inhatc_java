package week06;

public class Reference1 {

	public static void main(String[] args) {
		int iVal1 = 100;
		int iVal2 = 100;
		System.out.println("iVal1 == iVal2: " + (iVal1 == iVal2 ? true : false));
		
		// 참조타입 변수는 스택에 저장
		// 해당 객체 값은 힙 영역에 저장
		// 객체 주소가 스택에 있는 변수에 저장
		
		String sVal1 = "Java";
		String sVal2 = "Java";
		System.out.println("sVal1 == sVal2: " + (sVal1 == sVal2 ? true : false));
		
		String sVal3 = new String("Java");
		String sVal4 = new String("Java");
		System.out.println("sVal3 == sVal4: " + (sVal3 == sVal4 ? true : false));
		
		// 참조변수가 null 값을 가지면 해당 객체는 힙영역에 생성 X
		// 변수는 스택에
		String sVal5 = null;
		sVal5 = "Java";
		System.out.println("sVal5.length: " + sVal5.length());
		System.out.println("iVal1 == iVal5: " + (iVal1 == iVal2 ? true : false));
		
		// String 객체가 동일한 문자열을 가지고 있는지 비교 할 경우에는
		// 반드시 equals() 메소드를 사용
		
		boolean sVal6;
		if (sVal3.equals(sVal4)) {
			sVal6 = true;
		} else {
			sVal6 = false;
		}
		
		System.out.println("sVal3 == sVal5: " + sVal6);
	}

}
