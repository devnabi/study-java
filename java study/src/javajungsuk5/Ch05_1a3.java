package javajungsuk5;

public class Ch05_1a3 {

	public static void main(String[] args) {
		// 5-1 ~ 5-3 배열의 생성과 선언, 배열의 인덱스
		
		// 배열 선언 : 배열을 다루기 위한 참조변수의 선언
		// 타입[] 변수이름; >> 배열 선언(참조변수)
		// 변수이름 new 타입[길이]; >> 배열을 생성(실제 저장공간을 생성)
		
		int[] score; // 1. 배열의 선언 (참조변수)

		score = new int[5]; // 2. 배열의 생성 / int 저장공간 인덱스 0~4까지 5개 생성
		// int[] score = new int[5]; / 배열의 선언과 생성을 동시에 할 수 있다.

		score[3] = 100; // 4번째의 저장공간에 100을 저장한 것
		
		System.out.println("score[0] = "+ score[0]);
		System.out.println("score[1] = " + score[1]);
		System.out.println("score[2] = " + score[2]);
		System.out.println("score[3] = " + score[3]);
		System.out.println("score[4] = " + score[4]);
		
		int ang = score[3];
		System.out.println("ang = " + ang);
	}

}
