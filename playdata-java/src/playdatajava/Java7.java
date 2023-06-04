package playdatajava;

public class Java7 {
	
    public static void main(String[] args){
    	
    	int a = 6;
    	
    	// 약수 1, 2, 3, 6
    	for(int i = a; i > 0; i--) {
    		// i = 6, 5, 4, 3, 2, 1 / 0
    		if(a % i == 0) {
    			System.out.println(i);
    		}
    	}// for의 끝
    	
    	
    	// 순서 익히기 / AND(&&) , OR(||), NOT(!)
    	// && - 그리고 : 둘 다 만족 / || - 또는: 하나만 만족하면 참 / ! - 반대
    	if(a % 3 == 0 && a % 1 == 0) {
    		System.out.println("2");
    	}
    	else if(a % 3 == 0 || a > 6) {
    		System.out.println("3");
    	}
    	else if(a % 6 != 1) {
    		System.out.println("6");
    	}
    	else {
    		System.out.println("5555");
    	} // if의 끝
    	
    	
    	
    	
    	int money = 50000;
    	int money2 = 50300;
    	int coffee = 2000;
    	int coffee2 = 2200;
    	
    	// 커피를 몇 잔 살 수 있을까?
    	System.out.println(money / coffee); // 20
    	
    	
    	
    	// 남는 돈
    	System.out.println(money2 % coffee2); // 1900
    	
    	
    	
    	// 점원인데 거스름돈을 천 원 몇 장, 500원과 100원 각각 몇 개?
    	int 거스름돈 = money2 % coffee2;
    	
    	int[] 화폐 = {1000, 500, 100};
    	
//    	for(int i = 0; i < 화폐.length; i++) {
//        	if(i == 0) {
//        		System.out.println(거스름돈 / 화폐[i]);
//        	}
//        	else {
//        		System.out.println(거스름돈 - ((거스름돈 / 화폐[i-1]) * 화폐[i-1]) / 화폐[i]);
//        	}
//    	}
    	
    	
    	// continue : 
    	for(int i = 0; i < 화폐.length; i++) {
    		if(화폐[i] == 1000) {
    			System.out.println(거스름돈 / 화폐[i]);
    		}
    		// 0, 1, 2
    		//400 / 100 = 4
    		거스름돈 = 거스름돈 % 화폐[i]; // 400 % 100 = 0
    	}
    	
    	
    	
    	
    	// System.out.println(거스름돈 / 화폐[0]);
    	System.out.println(거스름돈 / 1000);
    	System.out.println(거스름돈 - ((거스름돈 / 1000) * 1000) / 500);
    	System.out.println(거스름돈 - ((거스름돈 / 500) * 500) / 100);
    	
    }
}
