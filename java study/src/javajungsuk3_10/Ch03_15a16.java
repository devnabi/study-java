package javajungsuk3_10;

public class Ch03_15a16 {

	public static void main(String[] args) {
		// 3-15, 3-16 논리 연산자, 논리 부정 연산자
		
		// 논리 연산자 : 조건식을 연결할 때 사용하는 연산자
		
		int x = 10, y = 3 * 3;
		System.out.println(x == 10 || x < y); // true / OR : 어느 한 쪽이 참이면 true로 결과가 나온다.
		System.out.println(x % 2 == 0 || x % 3 == 0); // true / 10은 2의 배수이므로 참이다.
		
		System.out.println(x > y && x == y); // false / AND : 양 쪽 모두 참이여야 true로 결과가 나온다.
		System.out.println(x > y && (x * y) > x); // true / 10 > 9, 30 > 10 : 양 쪽 모두 참이다.
		
		System.out.println((x + y)!=10); // true / 9 + 9 = 18이므로 10이 아닌 것이 참이다.
		
		System.out.println("x >= 10 && x < 20");// x는 10보다 크거나 같고 20보다 작다.
		System.out.println("보통은 변수를 왼쪽에 쓰지만 이런 경우 가독성 측면에서는 10 <= x && x < 20이 나을 수도 있다.");
		System.out.println("AND와 OR가 조건에 같이 있다면 AND가 우선순위가 더 높다."); // 순서를 바꾸려면 OR에 괄호를 한다.
		
		char ch = '5';
		System.out.println('0' <= ch && ch <= '9'); // 유니코드가 연속적으로 나열되어있기 때문에 가능한 식이다. / 48~57
		System.out.println("대문자인지 소문자인지 확인하는 조건문도 이와 비슷하다."); // 'a'~'z', 'A'~'Z'
		
		boolean b = true;
		System.out.println(!b); // true의 반대인 false
		System.out.println(!!b); // 단항 연산자와 대입 연산자는 오른쪽에서 왼쪽으로 계산된다. / !false >> true
	}

}
