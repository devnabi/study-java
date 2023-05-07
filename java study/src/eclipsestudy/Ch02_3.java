package eclipsestudy;

public class Ch02_3 {

	public static void main(String[] args) {
		// 2-3 변수의 선언과 저장
		
		// 변수 : 하나의 값을 저장할 수 있는 메모리 공간을 제공하는 것이다.
		// 변수의 타입은 여러가지가 있고 int는 정수를 저장할 때 사용한다. (integer: 정수)
		// = 등호는 '같다'가 아닌 '대입'이다. 대입연산자(=)
		// 주의 할 것: 지역변수는 읽기 전에 초기화를 해줘야 한다.
		
		int x = 4, y = 2; // 변수를 선언해주면 x, y의 값만 바꿔줘도 빠르게 결과를 얻을 수 있다.
		System.out.println(x+y); // 덧셈
		System.out.println(x-y); // 뺄셈
		System.out.println(x*y); // 곱셈
		System.out.println(x/y); // 나눗셈
	}

}
