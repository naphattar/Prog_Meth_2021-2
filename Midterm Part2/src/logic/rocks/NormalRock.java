package logic.rocks;

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
	public int dealDamage(Zombie zombie) {
		if (zombie.getDefense() > this.getDamage()-1){
			return 0;
		}
		zombie.setHealth(zombie.getHealth()-this.getDamage()+zombie.getDefense());
		return this.getDamage()-zombie.getDefense();		
	}
	public String toString() {
		return "Normal Rock (" + this.getDamage() + ")";
	}
	

}
