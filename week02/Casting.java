package week02;

public class Casting {
	public static void main(String[] args) {
		int iData = 65;
		char cData = (char)iData;
		System.out.println(cData);
		
		long lData = 500;
		iData = (int)lData;
		System.out.println(iData);
		
		double dData = 3.14;
		iData = (int)dData;
		System.out.println(iData);
		
		int iValue = 128;
		byte bValue = (byte)iValue;
		System.out.println(bValue);
		
		if(iValue >= Byte.MIN_VALUE && iValue <= Byte.MAX_VALUE) {
			bValue = (byte)iValue;
		} else {
			System.out.println("casting 범위를 벗어납니다.");
		}
	}
}
