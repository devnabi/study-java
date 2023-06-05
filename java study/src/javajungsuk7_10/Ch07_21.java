package javajungsuk7_10;

public class Ch07_21 {
    
    public static void main(String[] args) {
        // 7-21 접근 제어자

        // 접근 제어자(access modifier) 4가지 : public, protected, default,  private

        // 접근 제어 가능 위치
        System.out.println("public : 접근 제한 X");
        System.out.println("protected : 같은 패키지 + (다른 패키지)자손");
        System.out.println("default : 같은 패키지");
        System.out.println("private : 같은 클래스");

        Test t = new Test();

        // 접근 제어자 확인
        System.out.println(t.pub); // 접근 제한이 없다.
        System.out.println(t.prt); // 같은 패키지 + 다른패키지의 자손까지 허용하고 다른 패키지에서 자손이 아닌 상속범위를 벗어난 클래스에서는 사용이 불가하다.
        System.out.println(t.dft); // 다른 패키지에서는 사용이 불가하다.
        // System.out.println(t.prv); // 같은 클래스 내에서만 사용가능한 접근 제어자라서 에러가 난다.
    }
}

class Test {
    public String pub = "public";
    protected String prt = "protected";
    String dft = "default";
    private String prv = "private";

    public void test1() {
        System.out.println(pub);
        System.out.println(prt);
        System.out.println(dft);
        System.out.println(prv);
    }
}