package javajungsuk7_10;

public class Ch07_23 {
    
    public static void main(String[] args) {
        // 7-23 다형성

        // 다형성의 사전적인 의미로는 여러가지 형태를 가질수 있는 능력이다.
        // 다형성 : 조상 타입 참조 변수로 자손 타입 객체를 다루는 것이라고 하는 것이 정확하다.

        // 다형성의 특징
        System.out.println("다형성은 조상, 자손관계라면 타입이 불일치해도 된다. 보통은 일치하지만 일치하지 않아도 된다.");
        System.out.println("자손 타입의 참조변수로 조상 타입의 객체를 다루는 것은 불가능하다. / 에러"); // 자손타입의 멤버개수가 더 많기 때문에 맞지않는다.

        // 참조변수가 조상타입일 때와 자손타입일 때의 차이?
        System.out.println("사용가능한 멤버의 개수가 달라진다.");

        // 타입이 불일치
        Tv t = new SmartTv(); // Tv리모콘으로 SmartTv를 다루는 것이라고 보면 된다. == 조상타입 참조변수 t로 자손타입 SmartTv객체를 다루는 것이다.
        t.channel = 7;
        System.out.println(t.channel);

        // 에러 : 자손타입의 참조변수로 자손 타입의 객체를?
        // SmartTv st = new Tv(); // 없는 것을 호출했기 때문에 에러가 난다. / 리모콘 버튼이 7개인데 가지고 있는 기능은 5개뿐이다.
    }
}

// 부모 클래스
class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

// 자식 클래스
class SmartTv extends Tv {
    String text; // 캡션(자막)을 보여주기 위한 문자열
    void caption() {}
}
