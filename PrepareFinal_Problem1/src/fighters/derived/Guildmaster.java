package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Guardable;
import fighters.base.Unit;
import logic.BattleUtils;

public class Guildmaster extends Unit implements Attackable,Guardable {

	public Guildmaster(int maxHealth, int speed,int power,int defense,int location) {
		super("Guildmaster", "G", maxHealth, speed, location, false);
		this.setDefense(defense);
		this.setPower(power);
		this.setRange(1);
		
	}
	public boolean move(int spaces) {
		return (super.move(-1));
	}
	@Override
	public void guard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int attack(Unit e) {
		// TODO Auto-generated method stub
		if(this.sameTeam(e)) {
			return -1;
		}
		if(e.getLocation() <0 || e.getLocation() > 9) {
			return -1;
		}
		if(e.getLocation()<this.getLocation()-this.getRange() || e.getLocation()>this.getLocation()+this.getRange()){
			return -1;
		}
		return BattleUtils.calculateDamage(this.getPower(), e);
	}

}
