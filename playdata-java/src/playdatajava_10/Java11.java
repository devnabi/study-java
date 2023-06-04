package playdatajava_10;

public class Java11 {
	
    public static void main(String[] args){
    	
    	String[] names = {"아메리카노", "라떼"};
    	int[] prices = {1400, 2500, 3000};
    	
//    	for(int i = 0; i < names.length; i++) {
//    		System.out.println(names[i] + " " + prices[i]);
//    	}
    	
    	Coffee 아메리카노 = new Coffee(); // 타입은 커피이고 새로운 커피를 생성
    	아메리카노.name = "아메리카노";
    	아메리카노.price = 1400;
    	
    	Coffee 아메리카노1 = new Coffee();
    	아메리카노1.name = "라떼";
    	아메리카노.price = 3000;
    	
    	Coffee[] coffees = {아메리카노, 아메리카노1};
    	for(int i = 0; i < names.length; i++) {
    		System.out.println(coffees[i].name + " " + coffees[i].price);
    	}
    	
    	

    } // main의 끝
}

// 객체
class Coffee {
	String name;
	int price;
} // class의 끝