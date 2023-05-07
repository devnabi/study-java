package eclipsestudy4_10;

public class Ch04_15 {

	public static void main(String[] args) {
		// 4-15 중첩 for문
		
		// j값이 1번째 줄에 *이 하나, 2번째 줄에 *이 2개로 되는 것처럼 만들려면 i값이 증가함에 따라 j도 하나씩 증가해야하기 때문에 i <= j;로 바꾸면 된다.
		// 여러가지 *모양을 그려보는 연습을 해보는 것이 도움된다.
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j)); // 괄호를 붙이는 것이 좋다.
			}
			System.out.println(); // 한 번의 수행이 끝날 때 마다 간격
		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			} // System.out.println("**********");
			System.out.println(); // 줄바꿈
		}
	} // main의 끝

}
