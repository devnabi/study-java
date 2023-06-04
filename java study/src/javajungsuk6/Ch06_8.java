package javajungsuk6;

import java.util.Arrays;

public class Ch06_8 {

	public static void main(String[] args) {
		// 6-8 객체 배열
		
		// 객체 배열 == 참조변수 배열
		
		// Tv2 t1, t2, t3; >> 더 나은 방법
		// Tv2[] tvArr = new Tv2[3]; / 참조변수의 기본값은 null이다.
		
		// 배열의 각 요소에 객체를 생성해서 저장해주면 된다.
		// tvArr[0] = new Tv2();
		// tvArr[1] = new Tv2();
		// tvArr[2] = new Tv2();
		
		// 위의 것과 같지만 더 간단하게 작성을 할 수 있다.
		Tv2[] tvArr = {new Tv2(), new Tv2(), new Tv2()};
		System.out.println(Arrays.toString(tvArr)); // 클래스이름@객체주소 배열로 출력
	} // main의 끝

}

class Tv2{
	// Tv의 속성(맴버변수)
	String color; // 색깔
	boolean power; // 전원상태 on, off
	int channel; // 채널
	
	// Tv의 기능(메서드)
	void power() { power = !power; } // Tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; } // Tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; } // Tv의 채널을 낮추는 기능을 하는 메서드
	
}
