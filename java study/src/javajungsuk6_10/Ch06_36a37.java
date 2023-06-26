package javajungsuk6_10;

public class Ch06_36a37 {
    
    public static void main(String[] args) {
        // 6-36 ~ 6-37 생성자 this(), 참조변수 this

        // this : 인스턴스 자신을 가리키는 참조변수, 인스턴스 주소가 저장되어 있다. / 같은 클래스 안에서는 this를 생략할 수 있다.
        // this(), this(매개변수) : 생성자에서 다른 생성자를 호출할 때 사용한다.
        // 생성자 this()는 코드의 중복을 제거하려고 서로 호출하는 일이 많다. / 클래스 이름대신 this를 붙여서 호출

        System.out.println("포인트 : this / this(), this(매개변수)는 완전히 다른 것이다. 참조변수 / 생성자이다.");
        System.out.println("포인트 : static(클래스) 메서드에서는 참조변수 this, 생성자 this() 사용불가다.");
        System.out.println("this는 지역변수(lv)와 인스턴스변수(iv)를 구별할 때 많이 사용한다.");
        System.out.println("생성자 this(), this(매개변수)는 다른 생성자를 호출할 때 사용하고 첫줄에서만 사용이 가능하다."); // 첫줄이 아니라면 에러
    } // main의 끝
}

class Car {
    String color; // 색깔
    String gearType; // 기어타입
    int door; // 문 개수

    // 코드중복 예시
    // Car() {
    //     color = "white";
    //     gearType = "auto";
    //     door =4;
    // }

    // 중복제거 예시 : this()
    Car() {
        this("white", "auto", 4); // 첫줄 호출
    }

    // this를 쓰지 않아도 되는 예시 : 진짜이름은 참조변수 this를 붙인 것
    // Car(String c, String g, int d) {
    //     color = c;
    //     gearType = g;
    //     door = d;
    // }

    // iv와 lv를 구별해야 될 때의 예시 : iv와 매개변수의 이름이 같을 때 사용
    Car(String color, String gearType, int door) {
        // 참조변수를 붙인 것은 iv 자신을 의미 / 매개변수는 지역변수(lv)
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
} // class의 끝
