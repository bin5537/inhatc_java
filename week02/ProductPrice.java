package week02;

import java.util.Scanner;

public class ProductPrice {
	public static void main(String[] args) {
		System.out.printf("%-10s %-10s %-10s\n", "품목", "수량", "총 구매 금액");
		System.out.printf("%-10s %-10s %-10s\n", "과자", "7", "5700");
		
		System.out.println("---------------------------------------");
		
		int totalPrice = 5700;
		int cnt = 7;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매 수량을 입력하시오");
		int a = sc.nextInt();
		System.out.println("총 구매 금액을 입력하시오");
		int b = sc.nextInt();
		
		System.out.printf("구매 수량 : %d개 \n", cnt);
		System.out.printf("총 구매금액 : %d원 \n", totalPrice);
		System.out.printf("단가 : %.2f원", (double)totalPrice/cnt);
	}
}
