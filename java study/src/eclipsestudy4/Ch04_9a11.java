package eclipsestudy4;

import java.util.Scanner;

public class Ch04_9a11 {

	public static void main(String[] args) {
		// 4-9 ~ 4-11 switch문
		
		// 여러가지의 조건이 있을 때, if-else if문을 쓸 수 있지만 많을 때면 switch를 사용한다.
		// 조건식을 계산하고 조건식이 일치하는 case문으로 이동하여 수행한다.
		// break나 switch문을 만나면 전체를 빠져나간다.
		// 어느 곳도 일치하는 case문이 없다면 default로 이동한다. >> default문은 switch문의 마지막부분에 쓴다.
		// switch문에는 제약조건이 있다.
		
		// 제약조건 2가지
		// System.out.println("조건식의 결과는 정수나 문자열이어야 한다.");
		// System.out.println("case문의 값은 정수 상수(문자 포함), 문자열만 가능하다."); // 변수와 실수 X, 문자는 유니코드
		
		System.out.println("현재 월을 입력하세요. >");
		
		Scanner scn = new Scanner(System.in); // 화면으로부터 입력받기
		int month = scn.nextInt();
		
		switch(month){
		case 3 :
		case 4 :
		case 5 :
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default : // case 12 : case 1 : case 2 :
			System.out.println("현재의 계절은 겨울입니다.");
		}
	} // main의 끝

}
