package javajungsuk2_10;

public class Ch02_10 {

	public static void main(String[] args) {
		// 2-10 기본형과 참조형
		
		// 기본형 (Primitive type) - 자바에서 8개로 지정했다.
		// 1. byte, int, short, long
		// 2. char
		// 3. float, double
		// 4. boolean
		
		// 참조형 (Reference type) - 기본형을 제외한 나머지 String , System 등
		// 메모리 주소 저장 - 4byte or 8byte / 4byte가 표현할 수 있는 최댓값은 40억. 자세한 설명은 강의 다시보기.
		
		System.out.println("기본형은 실제 값을 저장한다.");
		System.out.println("정수형, 문자형, 실수형, 논리형");
		
		System.out.println("참조형은 메모리 주소를 저장한다.");
		System.out.println("참조형 변수는 객체의 주소를 저장하기 위한 것이라는 것을 알아두자."); // Date today; >> today = new Date();(객체생성)
		System.out.println("참조형은 얼마든지 우리가 추가할 수 있기 때문에 수가 정해져 있지 않다. 추가 방법은 6장에서.");
		System.out.println("기본형은 타입마다 크기가 있지만, 참조형은 타입의 관계없이 항상 4byte or 8byte다.");
	}

}
