package eclipsestudy4;

public class Ch04_1a4 {

	public static void main(String[] args) {
		// 4-1 ~ 4-4 조건문, if문, if-else문
		
		// 조건문 : 조건이 참이면 수행(0~1번 실행)
		// 반복문 : 조건을 만족하는 동안 수행(0~n번)
		// 조건문과 반복문은 실행흐름을 바꿀 수 있기때문에 '제어문'이라고도 한다. / flow control statement
		
		// if
		int a = 30;
		if (a < 100) {
			System.out.println("앙녕 if!"); // 조건이 거짓이라면 조건문을 실행하지 않고 다음 코드를 실행한다.
			System.out.println("a = " + a);
		}
		
		// 반복문
		// while (a++ > 0) {
		//	System.out.println("앙녕 while!"); // 조건이 거짓이라면 실행하지 않지만, 참이면 여러번 수행될 수 있다.
		// }

		// if-else
		if (a == 30) {
			System.out.println("if문은 참일 때 실행되고 거짓이라면 if는 뛰어넘고 else가 실행된다.");
		} else {
			System.out.println("else는 조건이 거짓일 때 실행된다.");
		}
	}

}
