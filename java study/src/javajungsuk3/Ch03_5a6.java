package javajungsuk3;

public class Ch03_5a6 {

	public static void main(String[] args) {
		// 3-5, 3-6 증감 연산자, 부호 연산자
		
		// 증가 ++ / 감소-- : 1을 증가, 1을 감소
		// 전위형(앞) - 값이 참조되기 전 수행 / x = ++i / 값이 먼저 증가
		// 후위형(뒤) - 값이 참조된 후 수행 / x = i++ / 나중에 증가
		// 증감 연산자가 독립적으로 사용된 경우 전위, 후위의 차이가 없다. / ++i; , i++;
		
		
		int i = 5, j = 0;
		
		j = ++i; // 전위형
		
		System.out.println("j = ++i; 실행 후, i =" + i + ", j=" + j);
		
		i = 5;
		j = 0;
		// 결과를 비교하기 위해, i와 j를 다시 변경하고 후위형 결과보기
		
		j = i++; // 후위형		
		
		System.out.println("j = i++; 실행 후, i =" + i + ", j=" + j);
	}

}
