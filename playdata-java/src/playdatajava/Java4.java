package playdatajava;

public class Java4 {

	public static void main(String[] args) {
		// 반복문과 조건문2
		
		int[] arr = {1, 2, 3, 4 ,5};
		int[][] arr2 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		}; // 다차원 배열 : 2차원 이상인 배열을 말한다.
		
		// 증감연산자
		int a = 0;
		// a= a + 1 / a += 1
		System.out.println(a++); // 0 / 0을 하고 ++을 하겠다는 것
		System.out.println(++a); // 2 / ++을 하고 a
		
		
		// for문
		for(int i = 0; i < 5; i++) {
			System.out.println(i); // 0, 1, 2, 3, 4 / i는 0부터 시작하여 총5개를 반복한다.
		} // for의 끝
		
		
		// for문 배열 출력
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		} // for의 끝
		
		
		// 짝수만 출력
		for(int t = 0; t < arr.length; t++) {
			if(t % 2 == 0) {
				System.out.println(t);
			}
		}// for의 끝
	}

}
