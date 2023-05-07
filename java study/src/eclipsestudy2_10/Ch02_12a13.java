package eclipsestudy2_10;

public class Ch02_12a13 {

	public static void main(String[] args) {
		// 2-12, 2-13 printf()를 이용한 출력
		
		// println() - 출력형식 지정불가 / 모든 정수를 10진수로만 출력 / 줄바꿈 O
		// printf()  - 출력형식 지정가능 / 지시자를 사용하여 다양하게 출력가능 / 줄바꿈 X
		// 지시자 표는 영상을 다시보거나 Java api문서를 찾아보기 / Java api >>formatter
		// 개행문자 - 줄바꿈 %n
		
		/* System.out.println(10/3); // 정수/정수 = 정수이다. 정수인 3이 출력이 된다.
		System.out.println(10.0/3); // 실수(소수점)으로 출력이 되려면 한 쪽을 실수로 바꿔주면 실수로 출력이 된다.
		System.out.println(0x1A); // 8진수, 16진수로 값을 넣으면 10진수로 출력이 된다. 26
		
		System.out.printf("%.2f%n", 10.0/3); // 3.33 - 소수점 둘째자리까지 출력하라.
		System.out.printf("%d%n", 15); // 15 - 10진수
		System.out.printf("%o%n", 15); // 017 - 8진수
		System.out.printf("%x%n", 15); // 0xf - 16진수
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 1111 - 2진수
		// 지시자가 여러개라면 지시자의 개수만큼 값의 개수도 같아야한다.
		
		float f = 123.456789f;
		System.out.printf("%f%n", f); // 123.4567 7자리까지만 정확하게 출력이 된다.
		System.out.printf("%e%n", f); // 지수형태로 출력이 된다.
		System.out.printf("%g%n", f); // 더 간단하게 나오는 것을 골라 출력이 된다. 소수점 포함해서 7자리로 나왔다. */
		
		System.out.printf("[%5d]%n", 1234567); // 지정한 자리수와 상관없이 모두 출력한다.
		System.out.printf("[%5d]%n", 10); // 지정한 자리수가 더 크다면 공백으로 채운다.
		System.out.printf("[%-5d]%n", 10); //  왼쪽 정렬
		System.out.printf("[%05d]%n", 10); // 공백을 0으로 채운다.
		
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d); // 정수 앞에는 공백, 소수점에는 0으로 채워졌다.
		
		System.out.printf("[%s]%n", "가나다라마바사"); // 문자출력
		System.out.printf("[%10s]%n", "가나다라마바사");
		System.out.printf("[%.4s]%n", "가나다라마바사");
	}

}
