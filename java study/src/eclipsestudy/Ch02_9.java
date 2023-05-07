package eclipsestudy;

public class Ch02_9 {

	public static void main(String[] args) {
		// 2-9 두 변수 바꾸기
		
		int x = 10;
		int y = 20;
		
		int tmp; // 1. 빈 변수 만들기
		
		tmp = x; // 2. tmp에 x의 값을 저장
		x = y;   // 3. y에 x의 값을 저장
		y = tmp; // 4. y에 tmp의 값을 저장
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		// 값만 출력되면 헷갈릴 수 있으니 앞에 문자를 붙여줬다.

	}

}
