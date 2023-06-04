package playdatajava_10;

public class Java13 {

	public static void main(String[] args) {
		
		String[] skill = {"Ice", "Magma", "Gravity"};
		String[] rank = {"B", "A", "S"};
		Hero[] heroes = new Hero[3];
		for(int i = 0; i < heroes.length; i++) {
			Hero hero = new Hero(skill[i], rank[i]);
			heroes[i] = hero;
		}
		
		for(Hero hero : heroes) {
			System.out.println(hero.skill + " " + hero.rank);
			System.out.println(hero.toString());
		}
	}
}



class Hero{
	String skill;
	String rank;
	
	public Hero (String ability, String rank) {
		this.skill = ability;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return "Hero [skill=" + skill + ", rank=" + rank + "]";
	}
}