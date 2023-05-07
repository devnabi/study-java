package eclipsestudy2_10;

import java.util.*; // Scanner / 1. import문 추가

public class Ch02_14 {

	public static void main(String[] args) {
		// 2-14 화면으로부터 입력받기
		
		// 문자열을 숫자로 >> Integer.parseInt() / 숫자를 문자열로 >> "" + 숫자
		// 파일도 입력받을 수 있지만 화면으로 입력받기 위해 System.in을 사용하는 것이다.
		// scanner.nextInt를 써서 쉽게 하나로 쓸 수도 있고 잍에 2줄처럼도 가능하다.
		
		Scanner scanner = new Scanner(System.in); // 2. Scanner 클래스의 객체 생성
		
		// 3. Scanner 객체를 사용
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		System.out.println(num);
		System.out.println(num2);
		
//		String input = scanner.nextLine();
//		int num = Integer.parseInt(input);
		
		
		System.out.println("Scanner : 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스"); // 클래스 : 기능을 제공해주는 것
	//	System.out.println(num);
		
	}

}
