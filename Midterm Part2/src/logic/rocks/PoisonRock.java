package logic.rocks;

import logic.zombies.Zombie;

public class PoisonRock extends NormalRock {
	private int damageOverTime;
	
	
	public PoisonRock(int damage,int damageOverTime) {
		super(damage);
		// TODO Auto-generated constructor stub
		this.setDamageOverTime(damageOverTime);
	}
	
	public int dealDamage(Zombie zombie) {
		zombie.setDecay(damageOverTime+zombie.getDecay());
		if (zombie.getDefense() > this.getDamage()-1){
			return 0;
		}
		zombie.setHealth(zombie.getHealth()-this.getDamage()+zombie.getDefense());
		return this.getDamage()-zombie.getDefense();	
		
	}
	public String toString() {
		return "Poison Rock (" + this.getDamage() +", DoT = " +this.getDamageOverTime() +")";
	}
	public int getDamageOverTime() {
		return damageOverTime;
	}

	public void setDamageOverTime(int damageOverTime) {
		if (damageOverTime < 0) {
			damageOverTime = 0;
		}
		this.damageOverTime = damageOverTime;
	}
	

}
