package week12;

import java.util.*;

public class SmartPhoneEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		// 필요한 객체 생성
		SmartPhone sp = new SmartPhone();
		EarPhone ep = null;
		
		System.out.println("** 스마트 폰 으로 음악 재생 하기 **");
		
		while(true) {
			System.out.println("\n이어폰 선택 (1. Buds, 2. AirPods, 3. TonFree, 4.Exit) >> ");
			menu = sc.nextInt();
			
			if (menu == 4) {
				System.out.println("이어폰 선택이 종료되었습니다.");
				break;
			} else if (menu == 1) {
				ep = new Buds();
			} else if (menu == 2) {
				ep = new AirPods();
			} else if (menu == 3) {
				ep = new TonFree();
			} else {
				System.out.println("올바른 이어폰을 선택 해 주세요.");
				break;
			}
			
			sp.musicOn(ep);
			sp.musicOff(ep);
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
