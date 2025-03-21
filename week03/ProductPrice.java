package week03;

public class ProductPrice {

	public static void main(String[] args) {
		int milk = 4500;
		int milkCnt = 1;
		int carrot = 1000;
		int carrotCnt = 3;
		int snack = 1500;
		int snackCnt = 2;
		
		int result = (milk*milkCnt) + (carrot*carrotCnt) + (snack*snackCnt);
		
		System.out.println("할인 전 상품 가격 : " + result + "원");
		System.out.println("할인 금액 : " + result*0.1 + "원");
		System.out.println("최종 결제 금액 : " + result *(1-0.1) + "원");
	}

}
