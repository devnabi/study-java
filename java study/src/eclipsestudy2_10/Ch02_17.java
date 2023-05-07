package eclipsestudy2_10;

public class Ch02_17 {

	public static void main(String[] args) {
		// 2-17 타입간의 변환방법 - 꼭 외울필요는 없지만 중요하기때문에 외우면 좋다.
		
		String str = "3";
		
		System.out.println(str.charAt(0) - '0'); // "3" >> '3'
		System.out.println('3' - '0' + 1); // 3 + 1 >> 4
		System.out.println(Integer.parseInt(str) + 1); // "3" >> 3 / 3 + 1 >> 4
		System.out.println("3" + 1); // 문자열과 숫자를 더하기 위해서 1이 "1"로 변환되고 "3" + "1" = 31
		System.out.println(3 + '0'); // '0'은 숫자로 48 >> 3 + 48 >> 51
		System.out.println((char)(3 + '0')); // 3이 문자로 변환되면서 '3' + '0' = '3'
	}

}
