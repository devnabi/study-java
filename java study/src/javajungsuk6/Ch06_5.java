package javajungsuk6;

public class Ch06_5 {

	public static void main(String[] args) {
		// 6-5 한파일 여러 클래스 작성하기
		
		// 소스파일의 이름이 Hello2.java라고 한다면 / public class Hello2 {}
		// class가 더 만들어져도 에러가 나지 않지만 하나의 소스파일에는 하나만 있는 것이 좋다.
		//  class Hello1 {} 중요 - 소스파일과 main class의 이름이 불일치해도 에러는 나지 않지만 실행을 시키면 다른 것이 실행된다.
		//  class Hello2 {}
		 
		 // 중요한 것 정리
		 System.out.println("하나의 소스파일에는 하나의 class만 작성하는 것이 바람직하다.");
		 System.out.println("소스파일의 이름은 public class의 이름과 일치해야 한다.");
		 System.out.println("하나의 소스파일에는 하나의 public class만 허용한다. / class는 더 만들 수 있다.");
		 System.out.println("main 클래스의 이름이 소스파일의 이름과 일치해야 한다. 직접 실행하려는 class를 지정하는 방법이 있다.");
		
	}

}
