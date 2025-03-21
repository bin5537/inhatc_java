package week03;

public class ThreeOperand1 {
	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 47;
		String result;
		
		
		result = (num1 > num2) ? "num1 이 더 큼" : "num2가 더 큼";
		System.out.println(result);
		
		boolean bResult = (num1 > num2) ? true : false;
		System.out.println(bResult);
		
		int score = 85;
		result = (score >= 90) ? "우수" : (score >= 80) ? "보통" : "미달";
		System.out.println(result);
	}
}
