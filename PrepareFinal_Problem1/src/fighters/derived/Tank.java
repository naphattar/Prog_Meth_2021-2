package fighters.derived;

import fighters.base.Guardable;
import fighters.base.Unit;

public class Tank extends Unit implements Guardable{

	// Constructor
	public Tank (int maxHealth,int speed ,int defense,int location) {
		super("Tank","t",maxHealth,speed,location,true);
		this.setDefense(defense);
	}
	@Override
	public void guard() {
		// TODO Auto-generated method stub
		this.setOnGuard(true);
		
	}
	
	public boolean move(int spaces) {
		this.setOnGuard(false);
		return (super.move(spaces));
	}
	

}
