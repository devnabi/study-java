package javajungsuk;

public class Ch02_7a8 {

	public static void main(String[] args) {
		// 2-7, 2-8 문자, 문자열 리터럴, 문자열 결합
		
		// 문자열이란 문자의 연속이다.
		// 문자열 결합을 할 때는 왼쪽에서 오른쪽으로 된다. "" + 7 >> "" + "7" >> "7"
		
		char ch = 'A'; // 홑 따옴표안에는 문자가 하나이상이면 에러가 난다.
		int i = 'A'; // 변수 i에는 문자코드가 담긴 A가 저장이 된다. 문자A의 코드 : 65
		
		String s = ""; // 큰 따옴표는 빈 문자열(empty string)이 가능하다.
		String s2 = "앙녕❣";
		String s3 = 7+7 + ""; // 덧셈 기호를 이용하여 문자나 숫자를 결합할 수 있다. 숫자를 문자열로 만들어주고 결합이 되는 것이다.
		String s4 = s2 + "❤" + s3;
		
		System.out.println(ch);
		System.out.println(i);
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
