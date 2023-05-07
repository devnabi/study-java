package eclipsestudy5_10;

import java.util.Arrays;

public class Ch05_10a11 {

	public static void main(String[] args) {
		// 5-10 ~ 5-11 배열의 활용(3): 섞기, (4): 로또번호 만들기
		
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(num));
		
		// 배열의 길이만큼 반복
		for(int i = 0; i < num.length; i++) {
			int n = (int)(Math.random() *10); // num처럼 0 ~ 9
			int tmp = num[0]; // 0을 i로 바꾸면 반복하며 인덱스의 자리 순서대로 임의의 값과 서로 값을 바꾼다. / 처음에는 0과 임의의 숫자
			num[0] = num[n];
			num[n] = tmp;
		}// for의 끝
		System.out.println(Arrays.toString(num));
	}

}
