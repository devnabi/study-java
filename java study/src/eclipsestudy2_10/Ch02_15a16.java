package eclipsestudy2_10;

public class Ch02_15a16 {

	public static void main(String[] args) {
		// 2-15, 2-16 정수형의 오버플로우
		
		// 오버플로우 : 표현할 수 있는 범위를 넘어섰다. (계수기 4자리 9999에서 다시 한번 1증가시키면 0000)
		
		System.out.println("최댓값에서 1을 증가시키면 최솟값이 된다."); // 10진수 - 9999 >> 0000 / 2진수 - 1111 >> 0000
		System.out.println("최솟값에서 1을 감소시키면 최댓값이 된다."); // 10진수 - 0000 >> 9999 / 2진수 - 0000 >> 1111
		System.out.println("부호 있는 정수와 없는 정수도 마찬가지다."); // 0~15 , -8~7
	}

}
