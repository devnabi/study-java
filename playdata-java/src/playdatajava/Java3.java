package playdatajava;

public class Java3 {

	public static void main(String[] args) {
		// 반복문과 조건문
		// true, false
		
		// 1. 벌레가 죽었나요?
		boolean isDead = true; // false이면 거짓이기 때문에 죽인다가 나온다. / 조건에 NOT(!)을 붙여도 된다.
		if(isDead) {
			System.out.println("버린다.");
		}
		else {
			System.out.println("죽인다.");
		} // if의 끝
		
		
		
		// 2. =과 ==의 차이
		int i = 7;
		if(i > 7) {
			System.out.println("if");
		}
		else if(i == 7) {
			System.out.println("else if");
		} // i = 7이면 "i는 7이다."라고 선언한 것이기때문에 ==을 써야한다.
		else {
			System.out.println("else");
		} // if의 끝
		
		
		
		// 3. equals() 내용 비교
		String hi ="hi";
		String hi2 = hi + "1";
		if(hi2.equals("hi1")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		} // if의 끝
		
		
		
		// 4. 보이는 값은 같지만 다르다.
		if(hi + 1 == "hi1") {
			System.out.println("맞았다.");
		}
		else {
			System.out.println(hi + "1");
			System.out.println("같아 보이지만 틀렸다.");
		} // if의 끝
		
		
		
		// 5. 자유롭게 해보기
		int a = 0;
		if(a + 1 == 0 + 1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		} // if의 끝
		
		
		
		// 6. NOT(!)
		Integer x = 0;
		Integer y = 0;
		if(x + 1 != y + 1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		} // if의 끝
		
		
		
		
		// 3항 연산자
		int p = 6;
		if(p % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		System.out.println(p % 2 == 0 ? "짝수" : "홀수"); // 이렇게 해도 같지만 번거롭다.
		
		
		
		
		// switch문
		switch (p % 2) {
		case 1: // 1인 케이스면
			System.out.println("홀수"); // 이것을 실행
			break; // 이것을 없애면 홀수 짝수 default가 출력된다.
		case 0:
			System.out.println("짝수");
		default:
			System.out.println("default"); // default는 위로 올려봤자 실행되지 않고 아래에 작성하여 실행할 수 있다.
			break;
		}
	}

}
