package javajungsuk3;

public class Ch03_9a10 {

	public static void main(String[] args) {
		// 3-9, 3-10 사칙 연산자, 산술 변환
		
		// 같은 타입끼리만 계산이 가능하다.
		// 결과를 실수형으로 하려면 서로 같은 실수형 타입으로 바꿔서 계산한다.
		// 산술변환 : 연산 전에 피연산자의 타입을 일치시키는 것 (자동 변환)
		
		System.out.println(10/4); // 정수끼리 나눴을 때 값도 정수가 나온다. 출력은 2 / 소수점 이하는 버려진다.
		System.out.println(10/4.0f); // 10/4.0f >> 10.0f/4.0f >> 2.5(타입은 출력되지 않음)
		
		System.out.println("값손실이 적은 쪽으로 int가 float로 바뀐다."); // int < float
		
		// 산술변환의 규칙 2가지
		System.out.println("1. 보다 큰 타입으로 일치시킨다."); // 큰 쪽으로 일치시켜야 값손실이 일어나지 않도록 할 수 있다.
		System.out.println("2. int보다 작은 타입이면 int로 변환된다."); // byte short char >> 각 크기 - 1 / 2 / 2
		
		// byte : -128~127 / char : 0~6만 / short : +-3만
		// int로 바꾸는 이유 : 이 세 타입은 범위가 좁아서 300 * 300과 같은 작은 계산을 해도 범위를 넘어서기 때문에 오버플로우가 발생해 잘못된 결과가 나올 수 있다.
		System.out.println("byte + short >> int + int");
		System.out.println("char + short >> int + int");
		
		System.out.println('2' - '0'); // 유니코드인 50 - 48 = 2 / 숫자 2가 출력 된다.
		System.out.println("char - char >> int - int로 변환되어 계산된다.");
		
		int a = 1_000_000; // 1백만 = 10의 6제곱
		int b = 2_000_000; // 2백만 = 10의 6제곱
		
		// long c = a * b;
		long c = (long)a * b; // 1백만 * 2백만 = 10의 12제곱 / int의 범위는 10의 9제곱 / int +-20억 범위를 벗어났다.
		
		System.out.println(c); // 오버플로우 발생 : long에 저장했지만 a * b 는 결과가 int이기 때문에 타입을 변환해줘야 한다.
	}

}
