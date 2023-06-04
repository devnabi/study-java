package javajungsuk5_10;

public class Ch05_21a23 {

	public static void main(String[] args) {
		// 5-21 ~ 5-23 2차원 배열(예제)
		
		// for문 많이 쓰이기 때문에 외워야 한다.
		// 개인별 총점과 평균 구하는 Ex5_9, Ex5_10예제 참고하기 
		
		int[][] num = {
				{100, 100, 100},
				{20, 20 , 20},
				{30, 30, 30},
				{40, 40, 40}
		};
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.printf("num[%d][%d]=%d%n", i, j, num[i][j]);
				
				sum += num[i][j];
			}
		} // for의 끝
		System.out.println("sum=" + sum);
	} // main의 끝

}
