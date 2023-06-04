package playdatajava;

public class Java9 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		// 987654321 while
		int i = 0;
		while(i < arr.length) {
			int j = 0;
			j +=1;
			while(j < arr[i-1].length) {
				j +=1;
				System.out.println(arr[j-1][i-1]);
			}
		} // while의 끝
		
		
		
		// 987654321 for
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.println(arr[arr.length-i-1][arr.length-j-1]);
//			}
//		} // for의 끝
//		
		// 987654321 for2
		for(int a = arr.length-1; a >= 0; a--) {
			for(int b = arr[a].length-1; b >= 0; b--) {
				System.out.println(arr[a][b]);
			}
		} // for의 끝
		
		
		
		// 대각선 출력 / 1 5 9 2 6 3
		// arr[0][0] arr[1][1] arr[2][2]
		// arr[0][2] arr[1][2]
		// arr[0][2]
		// k 0 1 2
		for(int k = 0; k < arr.length; k++) {
			for(int c = 0; c < arr[k].length - k; c++) {
				System.out.println(arr[c][c+k]);
			}
		}
		
		
		
//		// for
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		} // for의 끝
//		
//		
//		
//		// while(조건){실행}
//		int i = 0;
//		while(i < 10) {
//			System.out.println(i);
//			i++;
//			
//		} // while의 끝
//		
//		
//		
//		// 무한 루프
//		boolean isBreak = true;
//		int i = 0;
//		while(isBreak) {
//			System.out.println("while");
//			i++;
//			if(i < 5) {
//				isBreak = false;
//			}
//		} // while의 끝
//		
//		
//		
//		// do while
//		i = 0;
//		do {
//			System.out.println(i);
//			i++;
//		} while (i < 10);
	}

}
