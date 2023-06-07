package javajungsuk7_10;

public class Ch07_24a25 {
    
    public static void main(String[] args) {
        // 7-24 ~ 7-25 참조변수의 형변환(1) / 참조변수의 형변환(2)

        // 참조변수의 형변환 : 사용할 수 있는 멤버의 개수를 조절하는 것이다.
        // 기본형의 형변환은 int로 형변환을 한다고 하면  3.6 >> 3으로 형변환

        // 참조변수 형변환 특징
        System.out.println("중요 포인트 : 객체를 가리키는 게 무슨 객체인지 중요하다.(참조변수들이 가리키는 실제 객체 중요) / 실제 객체의 멤버개수를 알고 그 개수를 넘지않게 해야 한다.");
        System.out.println("조상, 자손 관계의 참조변수는 서로 형변환이 가능하다.");
        System.out.println("자손타입 >> 조상타입으로 형변환을 할 때, ()을 생략가능 / 조상타입 >> 자손타입으로 형변환을 할 때는 생략불가하다.");
        System.out.println("생략가능과 불가능은 생각하지말고 그냥 붙이자.");

        FireEngine f = new FireEngine();

        // 감소는 안전, 증가는 안전하지 않다.
        Car c = (Car)f; // 형변환 : f타입에서 c타입으로 형변환 / 자손타입에서 조상타입으로 형변환한 것이다. / 멤버개수 5 >> 4
        FireEngine f2 = (FireEngine)c; // FireEngine타입을 하나 더 만들어서 조상타입에서 자손타입으로 형변환을 한 것이다. / 멤버개수 4 >> 5
        f2.color = "";
        
        // 에러
        // Ambulance a = (Ambulance)f; 자손끼리는 형변환이 불가능하여 에러가 난다.
        // Car c = new Car(); 멤버개수가 4인 Car 객체를 가리키도록하고 f를 c로 형변환하고 water()를 호출하면, water()가 없는 Car객체를 가리키기 때문에 에러가 난다.
        // c.water(); 참조변수 c타입에서는 멤버개수가 4개뿐이고 water()가 없기때문에 호출하면 에러가 난다.
    }
}

class Car { // 멤버 4개
    String color;
    int door;

    // 운전하는 기능
    void drive() {
        System.out.println("brrrr~");
    }

    // 멈추는 기능
    void stop() {
        System.out.println("Stop");
    }
} // class의 끝

class FireEngine extends Car{ // 멤버 5개
    void water() {
        System.out.println("water!!!");
    }
} // class의 끝

class Ambulance extends Car { // 멤버 5개
    void a() {
        System.out.println(" ");
    }
} // class의 끝
