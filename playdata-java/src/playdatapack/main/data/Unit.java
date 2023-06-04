package playdatapack.main.data;

public class Unit extends Player {
	
		static int count = 0;
		private int id;
		private String name;
		private int hp;
		private int attackPoint;
		private Ustatus status; // "건물", "살았다.", "죽었다." / 같은 패키지에 Ustatus.java가 있기 때문에 import를 하지않아도 된다.
		
		public Unit(String name, int hp, int attackPoint) {
			this.name = name;
			this.attackPoint = attackPoint;
			this.hp = hp;
			count++;
			id = count;
		}
		
		
		
		public String attack() {
			return attackPoint + " 딜을 줬습니다.";
		}
		
		public void getDamage(Unit unit) {
			hp = hp - unit.getAttackPoint();
			System.out.println(name + "가 " + unit.getName() + "한테 " + unit.getAttackPoint() + "딜을 받았다.");
		}
		
		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}
		
		public String setName() {
			return this.name = name;
		}
		
		public int getHp() {
			return hp;
		}
		
		public int setHp() {
			return this.hp = hp;
		}
		
	    public int getAttackPoint() {
	        return attackPoint;
	    }
	    
	    public void setAttackPoint(int attackPoint) {
	        this.attackPoint = attackPoint;
	    }
		
	}
