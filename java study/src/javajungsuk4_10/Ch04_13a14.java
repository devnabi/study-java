package javajungsuk4_10;

public class Ch04_13a14 {

	public static void main(String[] args) {
		// 4-13, 4-14 for문
		
		// 조건식을 생략하면 true로 간주되어 무한반복문이 된다.
		// scope(범위) - 선언위치부터 선언된 블럭의 끝까지
		
		for(int i = 1; i <= 30; i++) {
			System.out.println("하이! for, while!"); // 블럭{}안의 문장을 30번 반복
			System.out.println(i);
		}
		
		for(int i = 1, j = 10; i <= 10; i++, j--) {
			System.out.println("i=" + i + "j=" + j); // 같은 타입일 경우에 변수 2개도 가능하다.
		}
		
//		int i;
//		for(i = 1; i <= 5; i++) {
//			System.out.println("Ang!");
//		}
//		
//		System.out.println("범위를 벗어나면 i라는 변수를 찾을 수 없어서 에러가 발생한다."); // scope : 범위
//		System.out.println("for의 블럭 밖에서 i를 사용해야한다면 변수를 밖에서 따로 선언해서 사용할 수 있다." + " i = " + i);
		
		int sum = 0; // 합계를 저장하기 위한 변수
		for(int i =1; i <= 5; i++) {
			sum += i; // sum = sum + i;
			System.out.printf("%2d%n", sum);
		}
	} // main의 끝

}
