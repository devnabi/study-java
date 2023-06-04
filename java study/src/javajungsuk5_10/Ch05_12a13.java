package javajungsuk5_10;

import java.util.Arrays;

public class Ch05_12a13 {

	public static void main(String[] args) {
		// 5-12 ~ 5-13 String배열
		
		// String은 기본형이 아닌 참조형이기 때문에 기본값이 0이 아니라 null로 저장이 된다.
		
		String[] name = new String[3];// 3개의 문자열을 저장할 수 있는 배열을 생성
		String[] ang = {"Ang!", "앙!"}; // 한번에 값을 저장
		
		// 문자열을 직접 저장
		name[0] = "Lee";
		name[1] = "Ju";
		name[2] = "hee";

		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(ang));
		
		String[] fruit = {"orange", "Pomegranate", "cherry"};
		
		for(int i = 0; i < 5; i++) {
			int tmp = (int)(Math.random() * 3); // 0 ~ 2
			System.out.println(fruit[tmp]); // 랜덤으로 출력
		} // for의 끝
	} // main의 끝

}
