package javajungsuk5_10;

public class Ch05_14a15 {

	public static void main(String[] args) {
		// 5-14 ~ 5-15 String클래스
		
		// String 클래스 = char[] + 메서드(기능) / 서로 관련이 있어서 결합한 것
		// 내용을 변경할 수 없다.
		
		String str = "ABCDE"; // "ABCDE" = char[]
		char ch = str.charAt(2);
		System.out.println(ch ); // 문자 'C'를 출력
		
		String str2 = str.substring(1, 4); // from ~ to 범위 반환하는 매서드 / to는 포함하지 않는다.
		String str3 = str.substring(1); // to를 쓰지 않으면 문자열의 길이 끝까지 출력한다. (1, str.length())와 같다.
		System.out.println(str2);
		System.out.println(str3);
	}

}
