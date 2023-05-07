package eclipsestudy5_10;

import java.util.Arrays;

public class Ch05_24 {

	public static void main(String[] args) {
		// 5-24 Arrays로 배열 다루기
		
		// 배열의 비교와 출력 - equals(), toString()
		// 배열의 복사 - copyOf(), copyOfRange()
		// 배열의 정렬 - sort() / 오름차순
		// Math클래스 - round() : 반올림 / random() : 랜덤 
		// deepToString() : 다차원(2차원 이상)일 때 사용한다. / 배열에 깊이 들어가서 출력 
		
		System.out.println("배열이 같은지 비교할 때 '=='을 쓰지 않고 equals()를 써야한다. "); // true, false를 반환
		System.out.println("2차원 이상의 배열이면 deepEquals()를 써야한다. "); // deepToString()을 생각
		
		int[] arr = {0, 1, 2, 3, 4};
		
		int[] arr2 = Arrays.copyOf(arr, 2); // 2까지만 복사 >> [0, 1]
		int[] arr3 = Arrays.copyOfRange(arr, 2 ,4); // from ~ to / 3부터 4까지라는 뜻이고 to는 포함하지 않고 출력 >> [3]
		int[] arrall = Arrays.copyOf(arr, arr.length); // arr의 전체 복사 >> [0, 1, 2, 3, 4]
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arrall));
		System.out.println(Arrays.copyOf(arr, arr.length)); // 배열의 출력은 Arrays.toString()을 써야 한다. [I@2a139a55
		
		
		// 2차원 이상(다차원) 배열의 비교
		String[][] eq = {
				{"ang"},
				{"ANG"}
		};
		String[][] eq2 = {
				{"ang"},
				{"ANG"}
		};
		System.out.println(eq==eq2); // 참조변수 값 비교 / false
		System.out.println(Arrays.equals(eq, eq2)); //  1차원 배열일 때 사용 / false
		System.out.println(Arrays.deepEquals(eq, eq2)); // 2차원 이상(다차원) 배열의 알맞은 비교 방법 / true
		
		// 2차원 이상(다차원)의 배열일 때의 출력
		int[][] num = {
				{11, 22},
				{33, 44}
		};
		System.out.println(Arrays.deepToString(num));
		
		// 정렬하기
		int[] sor = {6, 3, 5, 2}; // [2, 3, 5, 6]
		Arrays.sort(sor);
		int[] sor2 = sor;
		System.out.println(Arrays.toString(sor2));
	} 

}
