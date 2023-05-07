package eclipsestudy4_10;

public class Ch04_16a19 {

	public static void main(String[] args) {
		// 4-16 ~ 4-19 while문, do-while문
		
		// for - 반복횟수를 알 때 / while - 반복횟수를 모를 때
		// while문은 반복횟수를 모를 때 쓰지만, for처럼 정해진 때도 쓸 수 있다.
		// while : 조건식이 참일 때 수행하고 거짓일 경우 멈춘다. / 처음부터 false라면 1번도 수행하지 않는다.
		// do-while : 최소 한 번 이상 반복한다. 사용자 입력받을 때 유용하다.
		// do-while에 끝에 ;을 잊지않도록 주의해야 한다.
		
		int i = 5;
		
		while(i!=0) {
			i--;
			System.out.println(i + " - 난 할 수 있앙~"); // i가 감소하고 4에서 1까지 반복하다가 i의 값이 0이 되면 0!=0 false라서 끝
		}
		
		int num = 12345, sum = 0;
		
//		System.out.println(12345%10); // 10으로 나머지 연산을 하면 마지막 자리를 얻는다.
		
		while(num > 0) {
			System.out.println(num%10);
			sum += num%10; // 나머지 값을 sum에 저장하여 누적
			num = num / 10; // 12345를 10으로 나눈 몫을 반복 : 12345 1234 123 12 1
		}
		
		System.out.println("각 자리수의 합" + sum); 
	}

}
