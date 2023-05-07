package eclipsestudy;

public class Ch02_6 {

	public static void main(String[] args) {
		// 2-6 리터럴의 차이와 접미사
		
		// char는 하나의 문자일 경우 홑 따옴표로 'A', String은 "가나다"와 같이 여러개의 문자일 경우 큰 따옴표로 저장이 가능하다.
		// byte의 범위는 -128~127이다. int의 범위는 +-20억까지다.
		// 리터럴의 타입 불일치는 [변수 > 리터럴] 이면 가능하다.
		// 실수형은 정수형보다 저장 범위가 넓기 때문에 이런 경우 에러가 발생한다.>> long L = 3.14f;
		
		boolean power = true;
		
		byte b = 127;
		
		int oct = 010; // 8진수, 10진수로는 8
		int hex = 0x10; // 16진수, 10진수로는 16
		
		long L = 10_000_000_000L; // int범위를 넘어가는 리터럴을 저장하려면 뒤에 L을 붙여준다. 대소문자 구별은 안한다.
		
		float f = 3.14f;
		double d = 3.14; // d는 생략가능
		
		System.out.println(power);
		
		System.out.println(b);
		
		System.out.println(oct);
		System.out.println(hex);
		// 16진수로 출력하려면 printf를 사용하면 된다.
		
		System.out.println(L);
		
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f); // 접미사는 출력되지 않는다.
		System.out.println(1e3); // 기호e는 10의 n제곱을 의미한다. 10의 3제곱을 하니 1000.
	}

}
