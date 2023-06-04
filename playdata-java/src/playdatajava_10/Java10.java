package playdatajava_10;

public class Java10 {

	public static void main(String[] args) {
		
		int[][] array = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		// 탐색할 때 만약 홀수면 1을 더하고
		// 홀수인 값의 합을 출력하고
		// 리스트를 보여주기
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] % 2 == 1) {
					sum = sum + array[i][j];
					array[i][j] = array[i][j]+1;
				}
			}
		} System.out.println(sum); // for의 끝
		
		
		
		int[] arr = {1, 2, 3};
		int[] arr2 = arr;
		int[] arr3 = {1, 2, 3};
		
		if(arr == arr2) {
			System.out.println("true");
		}
		if(arr == arr3) {
			System.out.println("true2");
		}
		arr2[0] = 10;
		System.out.println(arr2[0]);
		System.out.println(arr[0]);
		
	}

}
