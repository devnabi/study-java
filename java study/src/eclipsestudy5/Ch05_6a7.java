package eclipsestudy5;

import java.util.Arrays; // 엥? 자동으로 추가가 됐었네... Arrays를 사용하려면 import가 필요하다.

public class Ch05_6a7 {

	public static void main(String[] args) {
		// 5-6 ~ 5-7 배열의 출력
		
		int[] num = {10, 20, 30, 40, 50}; // 길이가 5인 int배열
		char[] charr = {'A', 'B', 'C', 'D'}; // 길이가 4인 char배열
		
		System.out.println(num); // [I@2a139a55 >> [ 은 배열을 의미, I는 int, @는 위치(주소)를 의미한다.
		System.out.println(charr); // ABCD가 출력된다.
		System.out.println("배열의 이름을 출력하는 것으로는 num의 값들을 출력할 수 없다."); // 예외 : char >> 저장된 문자를 출력가능
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]); // num의 값을 순서대로 하나씩 출력
		} // for의 끝
		
		// 더 편한 방법 : Arrays.toString()
		System.out.println(Arrays.toString(num)); // 배열의 모든 요소를 한번에 출력
	}

}
