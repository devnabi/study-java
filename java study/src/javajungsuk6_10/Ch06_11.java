package javajungsuk6_10;

public class Ch06_11 {

	public static void main(String[] args) {
		// 6-11 선언위치 변수 종류
		
		// 선언의 위치는 클래스와 매서드 영역
		// 클래스 영역 : 인스턴스 변수와 클래스 변수
		// 메서드 영역 : 지역변수 / 메서드 내에 선언된 변수

		// 생성시기
		System.out.println("중요 - iv : 인스턴스가 생성되었을 때 생성 - 객체 생성"); // 객체는 iv변수 묶음이다.
		System.out.println("cv : 클래스가 메모리에 올라갈 때 생성 - 필요할 때 클래스(설계도)가 메모리에 올라가고(로딩) CPU가 읽을 수 있고 객체를 생성한다."); // static + iv = cv
		System.out.println("lv : 변수 선언문이 수행되었을 때 생성");

		// 특징
		System.out.println("iv는 참조변수가 없어지면 가비지 컬렉터(GC)로 인해 객체가 제거된다.");
		System.out.println("cv는 static이기 때문에 객체생성을 하지 않아도 된다.");

	} // main의 끝

} 

class Variables {
	int iv; // 인스턴스 변수
	static int cv; // 클래스 변수 (static 변수, 공유변수)

	void method() {
		int lv = 0; // 지역변수(로컬)
		System.out.println(lv);
	}
}
