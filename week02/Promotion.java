package week02;

public class Promotion {
	private static final byte Byte = 0;

	public static void main(String[] args) {
		byte bValue = 25;
		int iValue = bValue;
		System.out.println(iValue);
		
		System.out.println(((Object)bValue).getClass().getSimpleName());
		
		char cValue = '가';
		iValue = cValue;
		System.out.println(iValue);
		
		long lValue = iValue;
		System.out.println(iValue);
		
		double dValue = iValue;
		System.out.println(dValue);
	
	}
	
}
