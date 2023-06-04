package javajungsuk3;

public class Ch03_1a2 {

	public static void main(String[] args) {
		// 3-1, 3-2 연산자와 피연산자, 연산자의 종류
		
		// 연산자: 연산을 수행하는 기호 + - * /
		// 피연산자: 연산자의 연산 수행 대상
		// 식 : Expression
		// 연산자의 종류는 5가지
		
		int x = 5;
		int y = 4 * x + 3;
		
		System.out.println("모든 연산자는 연산결과를 반환한다.");
		System.out.println(4 * x + 3); // x = 5 / 연산결과인 23이 출련된다.
		System.out.println(y); // 대부분의 경우 연산결과를 대입 연산자(=)로 변수에 저장하여 사용한다.
		
		System.out.println("1. 산술 연산자 - + - * / "); // 사칙연산
		System.out.println("2. 비교 연산자 - > < >= <= == !="); // 크고 작음과 같고 다름을 비교
		System.out.println("3. 논리 연산자 - && || ! "); // AND, OR, NOT
		System.out.println("4. 대입 연산자 - ="); // 같다는 의미가 아닌 대입
		System.out.println("5. 기타 - (type)? : intanceof"); // 형변환 연산자, 삼항(조건) 연산자, instanceof 연산자
	}

}
