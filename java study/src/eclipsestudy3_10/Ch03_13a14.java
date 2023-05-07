package eclipsestudy3_10;

public class Ch03_13a14 {

	public static void main(String[] args) {
		// 3-13, 3-14 비교 연산자, 문자열의 비교
		
		// 비교 연산자 : 두 피연산자를 비교하여 true or flase를 반환
		// =>, =< (x) / <=, >= (o) / 반드시 앞에 부등호를 먼저
		
		// 문자 비교
		System.out.println('A' > 'B'); // 65 > 66 = false
		
		// 문자열 비교 : == 대신 equals()를 사용해야 한다.
		// 1번 방법
		String str = "abc";
		String str2 = "abc";
		System.out.println(str == str2); // true
		System.out.println(str.equals(str2)); // true
		
		// 2번 방법
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3 == str4); // false
		System.out.println(str3.equals(str4)); // true
		
		System.out.println("보통은 1번 방식을 쓴다. 왜 false가 나오는지는 6장, 9장에서 설명"); // 2번 방식을 써야할 때가 있다.
	}

}
