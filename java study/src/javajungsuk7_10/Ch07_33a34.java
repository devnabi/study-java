package javajungsuk7_10;

public class Ch07_33a34 {
    
    public static void main(String[] args) {
        // 7-33 ~ 7-34 추상클래스의 작성(1) / 추상클래스의 작성(2)

        // 여러 클래스의 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나 기존클래스의 공통부분을 뽑아서 추상클래스를 만든다.
        // 추상화 <-> 구체화

        System.out.println("추상화된 코드는 구체화된 코드보다 유연하다. / 변경에 유리");

        // 객체배열 : 참조변수 묶은 것
        Unit u[] = {new Marine(), new Tank(), new Dropship()};
        
        for(int i = 0; i < u.length; i++) {
            u[i].move(100, 200);
        }
        
        Object o[] = {new Marine(), new Tank(), new Dropship()};
        System.out.println(o);
        // 에러 : object는 최고 조상이기 때문에 객체배열을 생성할 수는 있지만 move()를 가지고 있지 않아서 에러가 난다.
        // for(int i = 0; i < u.length; i++) {
        //     o[i].move(100, 200);
        // }
    } // main의 끝
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y); // 지정된 위치로 이동
    void stop() {}; // 현재 위치에 정지
} // 추상클래스의 끝

// 보병
class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x = " + x + ", y = "+ y + " ]");
    };
    void stimPack() {};
}

// 탱크
class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank[x = " + x + ", y = "+ y + " ]");
    };
    void changeMode() {};
}

// 수송선
class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x = " + x + ", y = "+ y + " ]");
    };
    void load() {};
    void unload() {};
}
