package javajungsuk7_10;

class Ch07_10a11 {
    
    public static void main(String[] args) {
        // 7-10 ~ 7-11 참조변수 super, 생성자 super()

        // 참조변수 super : 객체 자신을 가리키는 참조변수, 인스턴스 메서드 내에서만 존재한다.
        // 조상의 멤버를 자신의 멤버와 구별할 때 사용한다. / iv와 lv를 구별할 때 사용하는 참조변수 this를 생각하면 쉽다.
        // 생성자 super() : 조상의 생성자를 호출할 때 사용한다.
        // 생성자와 초기화 블럭에는 상속이 안된다.
        Child c = new Child(1, 2, 3);

        System.out.println(c.x); // 메서드 호출 전 10 / 호출한 후로 코드 순서를 변경 후 20
        c.Cmethod();

        // 생성자 첫줄에 생성자 호출이 없으면 컴파일러가 자동으로 super();를 삽입하지만 기본 생성자를 호출할 때는 에러가 날 수 있다.
        System.out.println("중요! 별⭐️⭐️⭐️ :생성자의 첫 줄에는 반드시 생성자를 호출해야 한다.");
    }
}

class Parent {
    int x;

    Parent(int x, int y) {
        this.x = 10;
    }
} // class의 끝

class Child extends Parent {
    int y = 10;
    int z = 5;

    Child (int x, int y, int z) {
        // this.x = 20; 자손 생성자는 조상의 생성자를 초기화 하면 안된다.
        super(x, y); // 올바른 방법 : super() 호출
        this.z = 3; // 자기 자신의 것은 초기화 가능
    }

    void Cmethod() {
        super.x = 20;
        System.out.println(super.x);
    }
}
