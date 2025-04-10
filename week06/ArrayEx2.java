package week06;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 길이가 10인 정수타입의 배열을 선언
		int[] score = new int[10];
		
		// 누적되는 변수는 반드시 초기화
		int sum = 0;
		
		System.out.println("-------------- 랜덤 생성된 점수 배열");
		
		// 각 배열 값에 랜덤하게 생성된 점수 (0~99)를 저장
		// 배열 처리 => for 문 => 반복회수는 배열.length
		for (int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random() * 100);
			System.out.printf("score[%d]: %d\n", i, score[i]);
			
			sum += score[i];
		}
		
		double avg = ((double)sum / score.length);
        System.out.printf("총점: %d, 평균: %.2f\n", sum, avg);
	}
}
