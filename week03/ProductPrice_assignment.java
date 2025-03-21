package week03;

public class ProductPrice_assignment {
	public static void main(String[] args) {
		int milk = 4500;
		int milkCnt = 1;
		int carrot = 1000;
		int carrotCnt = 3;
		int snack = 1500;
		int snackCnt = 2;
		
		double rate = 25;
		
		int resultBefore = (milk*milkCnt) + (carrot*carrotCnt) + (snack*snackCnt);
		double resultAfter = (milk*milkCnt)*(100-rate)/100 + (carrot*carrotCnt) + (snack*snackCnt)*(100-rate)/100;
		double resultDifference = resultBefore - resultAfter;
		
		System.out.println("할인 전 상품 가격 : " + resultBefore + "원");
		System.out.println("할인 금액 : " + resultDifference + "원");
		System.out.println("최종 결제 금액 : " + resultAfter + "원");
	}
}
