package playdatajava;

public class Java2 {

	public static void main(String[] args) {
		// String 문자열, char 문자
		// boolean : 참, 거짓
		// Array : 배열
		
		// String - 문자열
		String str = ""; // String은 참조형이기 때문에 null이 가능하다.
		String Hello = "Hello";
		String world = "world";
		
		System.out.println(str);
		System.out.println(str + 1 + 1); // 11
		System.out.println(1 + 1 + str); // 2 / 순서에 영향을 받는다.
		System.out.println(Hello + ", " + world + "!");
		
		// Char - 문자
		char a = 'a';
		Character b = 'b';
		System.out.println(a + b); // 97 + 98 / 아스키 코드
		
		// 논리연산자 - boolean
		boolean p = true;
		boolean x = false;
		Boolean z = true;
		
		// Array - 배열
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = new int[2];
		Integer[] arr3 = new Integer[2];		
		String[] names = {"이주희", "현수정", "이태열"};
		String[] names2;
		names2 = new String[2];
		
		System.out.println(arr2[1]); // 배열이 비어있기 때문에 기본값이 0으로 되어있다.
		System.out.println(arr3[1]); // 배열이 비어있기 때문에 기본값이 null으로 되어있다.
		System.out.println(arr3[1] + " " + arr2[1] + names2[1]); // 참조형 + 기본형 + 참조형
		System.out.println(names[0]); // 컴퓨터는 0부터 (index검색)
		System.out.println(arr.length); // 배열의 길이 출력
	}

}
