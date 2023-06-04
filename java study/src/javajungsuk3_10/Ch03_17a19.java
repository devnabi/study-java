package javajungsuk3_10;

public class Ch03_17a19 {

	public static void main(String[] args) {
		// 3-17 ~ 3-19 조건 연산자, 대입 연산자
		
		// 조건 연산자 : 조건식의 결과에 따라 연산결과를 달리한다,
		// 조건식 ? 식1 : 식2 >> 결과가 참이면 1식의 결과가 되고, 거짓이면 2식의 결과가 된다.
		// lvalue : 대입 연산자의 왼쪽(left) 피연산자 / rvalue : 대입 연산자의 오른쪽(right) 피연산자
		
		System.out.println("result = (x > y) ? x : y; 이런 조건 연산자는 if문의 형태를 간단하게 만든 것이다.");
		System.out.println("lvalue는 변수와 배열같은 저장공간이여야 한다."); // 오른쪽 값을 대입하기 위한 저장공간
		
		final int max = 3;
		System.out.println(max);
		System.out.println("max = 10; >> 에러발생"); // 키워드 final을 붙이면 상수가 된다. (상수 : 값을 한번 저장하면 변경 불가)
	}

}
