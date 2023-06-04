package playdatajava;

public class Java5 {

	public static void main(String[] args) {
		// * 피라미드
		
//		for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
		
		String star = "";
		for(int k = 1; k < 6; k++) {
			star += "*";
			System.out.println(star);
		} // for의 끝
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		// 다차원 배열의 값을 하나씩 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		} // for의 끝
		
		// 대각선 출력
		int sum =0;
		for(int k = 0; k < arr.length; k++) {
			sum += arr[k][k];
			System.out.println(sum);
		}
	}

}
