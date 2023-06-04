package playdatapack.main.unit;

import playdatapack.main.data.Unit;

public class Zealout extends Unit {
	
	private int shield = 10;
	
	public Zealout() {
		super("Zealout", 100, 12);
	}
	
	
	
	@Override // : 덮어쓴다.
	public void getDamage(Unit unit) {
		if(shield < 0) {
			super.getDamage(unit);
		}else {
			shield -= unit.getAttackPoint();
			System.out.println(super.getName() + "가 " + unit.getName() + "한테 "
                    + unit.getAttackPoint() + "딜을 받았다");
		}
		
	}
}
