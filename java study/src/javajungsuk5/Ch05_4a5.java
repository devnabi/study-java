package javajungsuk5;

import java.util.Arrays;

public class Ch05_4a5 {

	public static void main(String[] args) {
		// 5-4 ~ 5-5 배열의 길이, 배열의 초기화
		
		// 배열의 길이 : 배열이름.length
		// 배열은 한 번 생성하면 길이를 바꿀 수 없다. / 1. 왜? , 2. 부족할 땐 어떻게?
		// 1. 메모리를 저장했고 공간이 더 필요한데 그 다음 공간들이 비어있다는 보장이 없다.
		// 2. 더 큰 배열을 생성하여 기존에 저장했던 것을 복사하고 저장한다.
		
		int[] arr = new int[10]; // 길이가 5인 배열
		System.out.println(arr.length); // index 범위 : 0~9 / 10개
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+ i + "] = " +arr[i]); // 요소를 출력
		}
		
		// 배열의 초기화 : 각 요소에 값을 정하기 전은 자동 초기화 값인 0으로 되어있다.
		int[] num = new int[3];
//		System.out.println(num[0]);
//		System.out.println(num[1]);
		
		// 10씩 증가하는 값
		for(int j = 0; j < num.length; j++) {
			num[j] = j * 10 + 10;
		} // for의 끝
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		int[] score = {33, 44, 55}; // int[] score = new int[]{33, 44, 55};와 같다. new int[]는 생략이 가능하다.
		System.out.println(Arrays.toString(score));
		System.out.println("1%의 확률로 선언과 초기화를 나눠야할 때, 에러가 발생하지 않도록 나눠서 해야한다.");
	}

}
