package eclipsestudy3_10;

public class Ch03_11a12 {

	public static void main(String[] args) {
		// 3-11, 3-12 반올림 Math.round(), 나머지 연산자
		
		// Math.round() : 소수 첫 째자리에서 반올림한 정수를 반환
		// 나머지 연산자 % : 오늘쪽 피연산자로 나누고 남은 나머지를 반환
		
		long l = Math.round(4.52);
		System.out.println(l); // 4.52 >> 5
		
		// 첫 째자리가 아닌 다른 자리를 반올림하고 싶은 경우
		double pi = 3.141592; // 소수 점에서 넷 째자리인 5에서 반올림을 한 결과인 3.142로 나오게 하고 싶은 경우
		double shortpi = Math.round(pi * 1000) / 1000.0; // 3141.592 >> 3142/1000.0 >> 3142.0/1000.0
		System.out.println(Math.round(pi * 1000)/1000); // int/int = int / 1000.0(실수)을 나눠야 한다.
		System.out.println(shortpi); // 3.142(double)
		
		// pi에서 반올림을 하지 않은 3.141을 얻으려면?
		System.out.println((int)(pi * 1000)/1000.0); // 3141.592 >> 3141 >> 3.141
		// 값손실을 이용하여 정수로 변환하고 소수점을 옮겨준다. 실수형의 값을 나타내기 위해 1000.0으로 나눈다.
		
		int x = 10;
		int y = 8;
		System.out.println(x/y); // 몫 = 1
		System.out.println(10/8); // 몫 = 1
		System.out.println(10%8); // 나머지 = 2
		System.out.println(10%-8); // 나머지 = 2와 같은 결과를 얻는다.
		System.out.println("정수만 허용, 부호는 무시");
	}

}
