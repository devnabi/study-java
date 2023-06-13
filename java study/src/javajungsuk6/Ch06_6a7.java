package javajungsuk6;

public class Ch06_6a7 {

	public static void main(String[] args) {
		// 6-6 ~ 6-7 객체의 생성과 사용
		
		// 가비지 컬렉터(Garbage Collector, GC)가 주기적으로 검사하여 메모리를 청소해준다.
		// java에서는 우리가 더이상 사용불가한 객체를 지우지 않아도 자동으로 메모리를 청소해준다.
		// 하나의 인스턴스를 여러개의 참조변수가 가리키는 것은 가능
		// 여러개의 인스턴스를 하나의 참조변수가 가리키는 것은 불가능
		
		// Tv t; // class(설계도)의 리모콘 / 객체를 사용하고 다루려면 참조변수 선언
		// t = new Tv(); // 객체 생성 : Tv의 인스턴스를 생성 후, t에 인스턴스 주소를 저장
		Tv t = new Tv(); // 한 번에 선언과 생성 : 리모콘(t)과 Tv객체를 연결(=)하다.
		Tv t2 = new Tv();
		
		// 변수 사용
		t.color = "rainbow";
		t.power = true;
		t.channel = 7;
		
		// 메서드 호출 : 채널을 낮추는 기능을 사용
		t.channelDown(); // 메서드 사용
		
		System.out.println("Tv의 색깔은 " + t.color + "입니다.");
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		
		System.out.println("Tv의 색깔은 " + t2.color + "입니다."); // String의 기본값 null 출력 
		System.out.println("현재 Tv의 전원상태 : " + t2.power); // boolean의 기본값 false 출력
		t2 = t; // t의 주소값을 t2에 대입
		System.out.println("현재 채널은 " + t2.channel + "입니다."); // t2의 기본값이 0이였지만 t의 메모리를 가리켜서 6이 된다.
	}

}

class Tv{
	// Tv의 속성(맴버변수)
	String color; // 색깔
	boolean power; // 전원상태 on, off
	int channel; // 채널
	
	// Tv의 기능(메서드)
	void power() { power = !power; } // Tv를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; } // Tv의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; } // Tv의 채널을 낮추는 기능을 하는 메서드
	
}
