package javajungsuk6_10;

public class Ch06_22 {

    public static void main(String[] args) {
        // 6-22 호출스택

        // stak : 밑이 막힌 상자라고 생각하면 된다. 차곡차곡 쌓인다. / 메서드 수행에 필요한 메모리가 제공되는 공간이다. / 호출되면 메모리에 할당
        // 박스에 책을 쌓는 과정과 다시 꺼내는 과정을 생각하면 쉽다. / 중간에 끼워넣거나 맨 아래에 있는 것을 꺼내는 것은 불가능하다.

        // 1번 main / 2번 println
        System.out.println("호출스택 과정");
        System.out.println("처음에는 비어있다.");
        System.out.println("프로그램의 시작인 main이 스택에 올라가고 실행이 된다.");
        System.out.println("println 호출, main위에 쌓이고 실행이 된다. main은 대기 상태가 된다.");
        System.out.println("println의 작업을 마치면 println이 제거되면서 main만 남게 된다.");
        System.out.println("더이상 실행될 것이 없으니 main도 스택에서 제거되고 스택에는 아무것도 남지 않고 끝난다."); // 프로그램 종료

    }
}
