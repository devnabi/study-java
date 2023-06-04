package playdatajava;

public class Java1 {

	public static void main(String[] args) {
		// 2023년 5월 22일
		
		// java jdk jre
		// 주석 '//' : code에 연관되지 않고 코멘트를 작성
		// byte >> short >> int >> long
		// 범위 : 2^8 >> 2^16 >> 2^32 >> 2^64
		// 컴퓨터는 0과 1로 이루어져 있다. 2진수 / 1바이트 안에 0과1로만 되어있는데 0이면 없다, 1이면 있다.
		// 한계치를 예상하여 변수타입을 쓰는 것이 메모리에 좋다. / long에 작은 숫자를 넣는 것은 낭비다.
		
		System.out.println("Hello, word!");
		System.out.println(1 + "1");
		
		// 변수
		int integer = 1;
		int a = 127;
		a = a + 1;
		System.out.println(integer); // 변수 선언
		
		// 데이터 타입 - 기본형과 참조형 / 차이는 기본은 null이 될 수 없고 참조는 될 수 있다. (더 알아보기 / 중요한 개념)
		// null : 비어있다. 없다.
		// int error = null;
		Integer c = null; // 앞에 대문자로 풀네임 써주면 참조를 쓸 수 있다.
		System.out.println(c);
		
		
		// 사칙연산 + - * /
		int b = 22; // 정수
		float f = 22; // 실수 /float (소수점 7자리까지)>> double(소수점 15자리까지)
		System.out.println(a + b); // 150
		System.out.println(a / b); // 정수타입끼리 나누면 정수만 출력하기 떄문에 5가 나온다. 자동 형변환?
		System.out.println(a % b); // 나머지가 나온다.
		System.out.println(a / f); // 
	}

}
