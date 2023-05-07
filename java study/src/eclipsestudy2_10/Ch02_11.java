package eclipsestudy2_10;

public class Ch02_11 {

	public static void main(String[] args) {
		// 2-11 기본형의 종류와 범위 [이 강의에서의 표 외우기]
		
		// 8bit에서 가장 왼쪽 1비트에서 부호를 나타낼 때 사용하는 것을 부호비트(사인비트)라고 한다.
		// 부호비트의 값이 0이면 양수, 음수면 1이다.
		// 정수형과 실수형에는 모두 부호가 있다. char는 음수를 표현할 필요가 없다.
		// 정수형과 달리 실수형은 저장하려는 값과 달리 실제 저장된 값에 오차가 발생할 수 있다.
		
		System.out.println("1bit = 2진수 1자리(0, 1)");
		System.out.println("1byte = 8bit"); // 4byte = 32bit / 8byte = 64bit
		System.out.println("1byte >> boolean, byte");
		System.out.println("2byte >> char(유니코드), short");
		System.out.println("4byte >> int, float"); // 정수형에서의 디폴트 타입은 int
		System.out.println("8byte >> long, double"); // 실수형에서의 디폴트 타입은 double
		
		System.out.println("n비트로 표현할 수 있는 값의 개수 = 2의 n제곱"); // 1byte = 2의 8제곱 = 256개
		System.out.println("n비트로 표현할 수 있는 부호없는 정수의 범위 = 0~2n제곱한 값에서 -1"); // 0~255
		System.out.println("n비트로 표현할 수 있는 부호있는(음수 값 포함) 정수의 범위 = -2n제곱-1~2n제곱-1한 값에서 -1");
		
		System.out.println("float 정밀도 - 7자리 / double 정밀도 - 15자리\""); // float의 2배라고 해서 double이다.
		System.out.println("실수형 저장형식 - 부호, 지수, 가수로 세 구분으로 나눠서 저장"); // 같은 크기인 int보다 큰 범위의 수로 표현 가능
	}

}
