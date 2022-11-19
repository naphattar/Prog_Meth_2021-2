package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Unit;
import logic.BattleUtils;

public class Wizard extends Unit implements Attackable{

	public Wizard(int maxHealth,int speed,int power,int location) {
		super("Wizard","w",maxHealth,speed,location,true);
		this.setPower(power);
		this.setRange(2);
	}

	@Override
	public int attack(Unit e) {
		// TODO Auto-generated method stub
		if(e.getLocation()<this.getLocation()-this.getRange() || e.getLocation()>this.getLocation()+this.getRange()){
			return -1;
		}
		if(this.sameTeam(e)) {
			return -1;
		}
		return this.getPower();
	}
}
