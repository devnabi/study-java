package javajungsuk6_10;

public class Ch06_17a19 {

    public static void main(String[] args) {
        // 6-17 ~ 6-19 메서드 호출

        // 입력값을 받는 '메서드 이름(매개변수(parameter): 작업에 필요한 값)'으로 호출한다.
        // 입력값이 필요하지 않는 메서드는 'void 메서드이름();'으로 호출한다.

        MyMath mm = new MyMath(); // 객체 생성
        long result = mm.add(6, 10); // 참조변수를 써주는 것은 중요하다. 작업결과를 저장할 변수를 만들어 줘야 메서드 사용이 가능하다.
        
        System.out.println(result);
        System.out.println("포인트1 : 매개변수도 long이어야 맞지만, int값을 넣어도 에러가 나지 않는다. long이 더 크기 때문에 자동형변환을 해준다.");
        System.out.println("포인트2 : 작업을 마치면 호출한 곳으로 돌아온다. mm.add(6, 10)가 계산이 되고 변수result에 저장이 된다.");
        System.out.println("포인트3 : 메서드는 클래스 영역에서만 정의가 가능하다.");


    } // main의 끝
}

class MyMath{
    long add(long a, long b){

        return a + b; // 입력값을 받는 함수
    }
}
