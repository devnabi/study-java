package study;

import java.util.Arrays;

public class study1 {

	public static void main(String[] args) {
		 
		// 복제할 2차원 배열
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		// 복제할 배열의 길이만큼 배열박스를 만들어서 대입 : arr을 복제하고 담을 배열 b를 만드는 것
		int b[][]= new int[arr.length][];
		
		// clone() - 깊은 복사하기
		for(int i = 0; i < arr.length; i++) {
			 b[i] = arr[i].clone(); // 설명은...
		}
		
		// 배열 출력하기
		System.out.println(Arrays.deepToString(b));
		
		b[0][0]= 10; // clone()한 것에 숫자를 정해도 바뀌지 않음
		System.out.println(arr[0][0]);
	}

}
