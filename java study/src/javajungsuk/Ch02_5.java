package javajungsuk;

public class Ch02_5 {

	public static void main(String[] args) {
		// 2-5 상수와 리터럴
		
		// 지역변수는 선언을 하고 값을 초기화하지 않으면 읽을 때 에러가 발생한다. 선언과 초기화를 같이하는 게 편한듯...
		
		final int score;
		// int score = 500;
		score = 100;
		System.out.print(score + 50);
	}

}
