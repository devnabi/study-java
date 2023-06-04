package javajungsuk5;

public class Ch05_8a9 {

	public static void main(String[] args) {
		// 5-8 ~ 5-9 배열의 활용(1): 총합과 평균, (2): 최댓값과 최솟값
		
		int[] score = {100, 90, 88, 100, 100};
		
		int sum = 0; // 총점을 저장하기 위한 변수
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		} // for의 끝
		
		// 1. 평균값 구하기
		System.out.println(sum); // 총점을 출력
		System.out.println(sum / score.length); // int / int = 정수가 나오기 때문에 틀린 출력
		System.out.println(sum / (float) score.length); // 형변환을 해주어 평균값을 제대로 출력
		
		// 2. 예제 참고
	}

}
