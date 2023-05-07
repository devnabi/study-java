package eclipsestudy3;

public class Ch03_3a4 {

	public static void main(String[] args) {
		// 3-3, 3-4 연산자의 우선순위와 결합규칙
		
		// 연산자 우선순위 표는 강의에서 보기
		// 1항(단항): 피연산자 1개
		// 우선순위 :  연산자가 둘 이상있을 때 어떤 연산자를 먼저 수행할지 자동 결정하는 것
		// 결합규칙 : 같은 순위의 연산자가 있을 때 어떤 것을 먼저 수행할지 결정하는 것
		// 산술 > 비교 > 논리 > 대입
		
		System.out.println("수동으로 우선순위를 바꾸려면 괄호()를 사용한다."); // 3 + 5 * 6 = 33 >> ( 3 + 5 ) * 6 = 48
		System.out.println("1항(단항) > 2항"); // -x + 3 / 부호연산자 -x는 1항
		System.out.println("덧셈 < 곱셈"); // x + 3 * y
		System.out.println("산술 > 비교"); // 2 + 8 > 10 -1 / 10 > 9 / 비교
		System.out.println("비교 > 논리"); // x > 3 && x < 5 / x는 3보다 크고 5보다 작다.
		System.out.println("대입 연산자는 모든 연산과정이 끝나야 대입을 할 수 있기때문에 우선순위가 가장 낮다."); // y = 3 + 5 >> y에 대입
		
		System.out.println("결합규칙은 대입과 단항을 제외하면 모두 왼쪽에서 오른쪽으로 수행한다."); // 대입과 단항 >> 오른쪽에서 왼쪽
	}

}
