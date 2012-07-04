package Unit;

public class Unit {
	public String name;
	public int maxHP;
	public int mys;
	public int attack;
	public int defense;
	public int mobility;
	public int curHP;
	
	public Unit Unit (String name){
		Unit newUnit = null;
		newUnit.name = name;
		newUnit.maxHP = 5;
		newUnit.mys = 5;
		newUnit.attack = 5;
		newUnit.defense = 5;
		newUnit.mobility = 3;
		newUnit.curHP = 5;
		
		return newUnit;
	}
	
	public boolean checkDeath (Unit unit){
		if (unit.curHP <= 0)
			return true;
		return false;
	}
}
