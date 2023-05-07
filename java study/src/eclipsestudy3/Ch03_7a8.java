package eclipsestudy3;

public class Ch03_7a8 {

	public static void main(String[] args) {
		// 3-7, 3-8 형변환 연산자, 자동 형변환
		
		// 형변환 : 변수 or 상수의 타입을 다른 타입으로 변환 / (타입)피연산자
		// 기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환
		// byte < short <  int <  long < flaot < double
		// 값손실이 있는 경우에만 직접 형변환을 해줘야 한다.
		
		System.out.println("float f = 1234;"); // int < float, 타입이 불일치하지만 컴파일러가 자동으로 변환해준다.
		
		System.out.println("int i = 3.14f"); // 에러
		
		System.out.println("3.14f >> 3 : 값손실 발생");
		System.out.println("float는 int보다 범위가 크고 값손실이 발생하기 때문에 수동으로 변환해줘야 한다.");
		System.out.println("int i = (int)3.14f;"); // 3으로 저장이 된다.
		
		System.out.println("short와 char는 서로 범위가 다르기 때문에 직접 형변환을 해줘야 한다.");// short - +-3만 / char - 0~6만
		System.out.println("byte로 봤을 때 long > float이지만 실수형의 표현할 수 있는 범위가 더 넓다. "); // 10의 19제곱 < 10의 38제곱
		
		System.out.println("byte b = 100;"); // 예외다. byte의 범위 -128~127 / 자동 형변환
		
		int i = 100; // byte b = i;
		byte b = (byte)i;
		System.out.println(b);// 에러 : 100은 범위안에 있지만 i는 변수다. 변수는 컴파일러가 값을 확신할 수 없기때문에 자동으로 변환해주지 않는다.
		
		// byte b2 = 1000; / 에러 : 범위를 넘어섰기 때문이다.
		byte b2 = (byte)1000;
		System.out.println(b2); // 값손실로 -24 출력
	}

}
