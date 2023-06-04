package playdatajava;

public class Java6 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		}; // 배열의 길이는 3
		
		//147258369 / [0][0], [1][0], [2][0] / 인덱스 첫번째쪽이 1씩 증가하도록 / 2번째는 3번 반복이 끝났으면 1증가
		for(int i = 0; i > arr.length; i++) {
			//arr.length = 3 / 0, 1, 2
			for(int j = 0; j < arr.length; j++) {
				System.out.println(arr[j][i]);
			}
		}// for의 끝
		
		//987654321 / 역순 / [2][2], [2][1] [2][0] / [1][2] [1][1]...........
		for(int i = arr.length; i > 0; i--){
			for(int j = arr[i-1].length; j > 0; j--) {
				System.out.println(arr[i-1][j-1]);
			}
		}// for의 끝
	}

}
