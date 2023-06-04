package javajungsuk6_10;

public class Ch06_20a21 {

    public static void main(String[] args) {
        // 6-20 ~ 6-21 return문, 반환값

        // return문 : 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
        // 반환 타입이 void(입력값을 받지 않는)가 아닌 경우는 return이 반드시 필요하다. / 생략불가

        Void v = new Void();

        v.Gugudan(3);
    } // main의 끝
}

class Void {
    void Gugudan(int dan){
        if(!(2 <= dan && dan <= 9)){
            return; // 입력받은 dan(단)이 2~9가 아니라면 메서드를 종료하고 호출한 곳으로 되돌아가기
        } // if의 끝

        for(int i = 0; i <= 9; i++){
            System.out.printf("%d * %d = %d%n", dan , i , dan * i);
        }

    } // Gugudan의 끝

    int multiply(int a, int b){
        return a * b;
    }

    int max (int a, int b){
        if(a > b){
            return a;
        }
        else {
            return b;
        } // else를 써주지 않으면 return이 없다고 에러가 난다. 왜냐하면 참일 때에는 return문이 있지만 거짓일 때에는 없기때문에 써줘야한다.

    }
} // class의 끝
