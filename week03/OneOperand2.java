package week03;

public class OneOperand2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("++x = " + (++x));  // x=11
		
		System.out.println("x++ = " + (x++));  // x=11
		System.out.println("x = " + x);  // x=12
		
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		z = ++x + y--;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		

	}

}
