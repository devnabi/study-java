package javajungsuk4;

import java.util.Scanner;

public class Ch04_5a8 {

	public static void main(String[] args) {
		// 4-5 ~ 4-8 if-else if문, 중첩if문
		
		// 여러 개의 조건식 중 하나만 실행한다.
		
		int score = 0; // 점수를 저장하기 위한 변수
		char grade = 'D'; // 학접을 저장하기 위한 변, 공백으로 초기화
		
		System.out.println("점수를 입력하세요.>");
		
		Scanner scn =  new Scanner(System.in); // 화면으로부터 입력을 받겠다.
		score = scn.nextInt(); // 화면을 통해 입력받은 정수를 score에 저장하는 것
		
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		// else {
		//	grade = 'D'; // 코드를 줄이기 위해 else를 쓰지 않고, grade 기본값을 설정해줬다.
		// }
		System.out.println("당신의 학점은 " + grade + "입니다.");

		scn.close();
	}

}
