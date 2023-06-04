package javajungsuk6;

public class Ch06_9a10 {

	public static void main(String[] args) {
		// 6-9 ~ 6-10 클래스의 정의
		
		// 클래스를 정의하는 것 3가지 : 설계도, 데이터 + 함수, 사용자 정의
		// 1. 변수는 하나의 데이터를 저장할 수 있는 공간이다.
		// 2. 배열은 같은 타입의 여러 데이터를 저장할 수 있는 공간이다.
		// 3. 구조체는 타입은 달라도 서로 관련된 데이터라면 저장할 수 있는 공간이다. int float char 등 관련이 되어있다면 가능하다.
		// 4. 클래스는 구조체 + 함수라고 보면 된다. (데이터와 함수의 결합) / 매서드는 명령문을 묶은 것
		
		// 시, 분, 초
		Time time = new Time();
		
		// 시, 분, 초를 각 몇개씩 만들기
		// Time time1 = new Time();
		// Time time2 = new Time();
		// Time time3 = new Time();
		
		// 객체배열로 시는 시끼리, 분은 분끼리, 초는 초끼리 묶기
		Time[] timeArr = new Time[3];
		timeArr[0] = new Time();
		timeArr[1] = new Time();
		timeArr[2] = new Time();
		
		// 비객체지향 코드
		// int hour = 12;
		// int minute = 30; 
		// int second = 10;

		// 객체지향 코드
		time.hour = 12;
		time.minute = 30;
		time.second = 10;
		
		System.out.println("현재는 " + time.hour + "시 " + time.minute + "분 " + time.second + "초 입니다.");
		
		// 복잡한 예시
		// 시, 분, 초
		// int hour, minute, second;
		
		// // 시, 분, 초를 각 몇개씩 만들기
		// int hour1, hour2, hour3;
		// int minute1, minute2, minute3;
		// int second1, second2, second3;
		
		// // 시는 시끼리, 분은 분끼리, 초는 초끼리 묶기
		// int[] hourArr = {hour1, hour2, hour3};
		// int[] minuteArr = {minute1, minute2, minute3};
		// int[] secondArr = {second1, second2, second3};
		
	}// main의 끝

}

class Time {
	// 위의 복잡함을 해결하기 위해 class를 사용한다.
	int hour, minute, second;
}
