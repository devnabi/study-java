package eclipsestudy5_10;

public class Ch05_18a20 {

	public static void main(String[] args) {
		// 5-18 ~ 5-20 2차원 배열
		
		// 2차원 배열 : 테이블 형태의 데이터를 저장하기 위한 배열
		// 1차원 배열이 여러개면 2차원 배열 / 2차원 배열이 여러개면 3차원 배열
		
		int[][] num = new int[4][3]; // 4행 3열의 2차원 배열을 생성한다. / int * 4 * 3 >> int * 12의 공간이 생긴다.
		
		int[][] baba = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		}; // 2차원 배열의 생성과 초기화
		
		System.out.println(num[0][0]);
		System.out.println(baba[0][1]);
	}

}
