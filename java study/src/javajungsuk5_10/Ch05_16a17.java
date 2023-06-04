package javajungsuk5_10;

public class Ch05_16a17 {

	public static void main(String[] args) {
		// 5-16 ~ 5-17 커맨드 라인 입력받기
		
		// 커맨드 라인으로 입력한 값이 문자열 배열에 담겨서 전달된다.
		// 커맨드 라인에서 값을 주면 프로그램 내에서 쓸수있다.
		// 아 어려웡... 이게 뭐지
		
		System.out.println("매개변수의 개수 : " + args.length);
		for(int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		} // for의 끝
	} // main의 끝

}
