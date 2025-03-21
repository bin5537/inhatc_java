package inhatcWork;

public class work02 {

	public static void main(String[] args) {
		int milkCount = 1;
		int milkPrice = 4500;
		int carrotCount = 3;
		int carrotPrice = 1000;
		int snackCount = 2;
		int snackPrice = 1500;

        int total = 0;
        double rate = 25;

        total += milkCount * milkPrice;
        total += carrotCount * carrotPrice;
        total += snackCount * snackPrice;

        System.out.printf("할인 전 상품 가격: %d원 \n", total);
        
        int discountPrice = (milkCount * milkPrice) + (snackCount * snackPrice);
        double discount = discountPrice * (rate * 0.01);
        
        System.out.printf("할인 금액: %d원 \n", (int)discount);
        System.out.printf("최종 결제 금액: %d원", (int)(total - discount));
	}

}
