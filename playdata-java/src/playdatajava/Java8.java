package playdatajava;

public class Java8 {
	
    public static void main (String[] args){
    	
    	int[][] arr = {
    			{4, 7, 9, 10},
    			{2, 7, 3, 4},
    			{9, 2, 8, 5},
    			{8, 4, 2, 1}
    	};
    	
    	// arr 탐색을 하는데 하나씩 더하고
    	// 만약 짝수면 그 수를 출력을 하고
    	// 홀수이면서 더한 값이 20이 넘으면 끝내고
    	// 아니면 더하고 더한 값을 출력
    	int sum = 0;
    	for(int i = 0; i < arr[i].length; i++) {
    		boolean isBreak = sum > 20;
    		for(int j = 0; j < arr[i].length; j++) {
    			int now = arr[i][j];
    			if(now % 2 == 0) {
    				System.out.println(now);
    			}
    			else {
    				sum += now;
    				isBreak = sum > 20;
    				if(isBreak) break;
    			}
    		} if(isBreak) break;
    	} System.out.println(sum); // 2 23
    	
    	
    	
    	
    	// 카멜 케이스  / 스네이크 케이스 / 파스칼 케이스
    	String camelCase = "중간 글자들은 대문자로 시작하지만 첫 글자가 소문자인 경우에는 낙타와 모양이 비슷하다 하여 카멜 케이스라고 한다.";
    	String snake_case = "언더바(_) 가 들어 있는 표현 방식을 뱀처럼 생겼다고 하여 스네이크 케이스라고 한다.";
    	String PascalCase = " 글자와 중간 글자들이 대문자인 경우 파스칼 언어의 표기법과 유사하다고 하여 파스칼 케이스라고 한다.";

    }
}
