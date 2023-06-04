package javajungsuk6_10;

public class Ch06_14a16 {
    public static void main(String[] args) {
        // 6-14 ~ 6-16 메서드란? 메서드의 선언부와 구현부

        // 메서드 : 문장들을 묶어놓은 것
        // 메서드 호출(사용) : 값을 받아서 처리하고 출력한다. / 입력과 반환
        // 코드중복을 보기좋게 바꾸고 사용하기 위해 {}로 묶어서 코드를 한 묶음으로 만든다.
        // 매개변수 : 작업에 필요한 값들 / 0~n개 입력 가능하다.
        // 출력 : 0~1개 까지만 가능하다. / 작업결과가 여러개라면 배열, 하나의 객체로 묶어서 사용하면 된다. 방법은 나중에
        // 반환할 값이 없다면 반환타입에 void(없다는 뜻)라고 적어야 한다.

        // 객체 생성
        Math m = new Math();

        // 호출
        int result1 = m.add(3, 5);
        System.out.println(result1); // 8

        int result2 = m.multiply(3, 5);
        System.out.println(result2); // 15
    } // main의 끝

}

    class Math {
        int add(int x, int y) { // 선언부
            // 구현부
            int result = x + y;
            return result;
        }

        int multiply(int x, int y) { // 선언부
            // 구현부
            return x * y;
        } // add메서드에 있는 지역변수 x, y와 이름이 같아도 사용 가능하다. / 지역변수 : 메서드 모두 사용하면 사라진다.


    } // class의 끝
