package javajungsuk4_10;

public class Ch04_12 {

	public static void main(String[] args) {
		// 4-12 임의의 정수 만들기(실수도 가능)
		
		// Math.random() : 0.0과 0.1사이의 임의의 double값을 반환
		// 정수로 반환하고 싶다면 int형변환을 사용
		// 범위를 조정하려면 +1처럼 범위를 조정해줄 수 있다. - +
		// 곱하는 게 개별값 개수
		
		// int num = 0;
		
		for(int i = 1; i <= 20; i++) {
//			System.out.println(Math.random()); // 0.0(포함) ~ 1.0 사이
//			System.out.println(Math.random() * 10); // 0.0(포함) ~ 10.0 사이
//			System.out.println((int) (Math.random() * 10)); // 0(포함) ~ 10 사이의 정수 / 0 ~ 9까지 출력
			
		// 1. Quiz : 1~10까지의 난수를 20개 출력하시오.
			System.out.println((int) (Math.random() * 10) + 1); // 1 ~ 10까지 출력
			
		// 2. Quiz : -5 ~ 5 사이의 난수를 20개출력하시오.
			System.out.println((int) (Math.random() * 11) - 5); // -5 ~ 5까지 출력
		}
	} // main의 끝

}
