package Part2.TerryVsZombies_toStudent.src.logic.rocks;

import logic.zombies.Zombie;

public class NormalRock {
	protected int damage;
	

	public NormalRock(int damage) {
		
		this.setDamage(damage);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		if (damage < 0) {
			damage = 0;
		}
		this.damage = damage;
	}
	public int dealDaage(Zombie zombie) {
		
	}
	
	

}
