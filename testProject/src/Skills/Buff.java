package Skills;
import Character.Character;

public class Buff extends Effect {
	
	//public String name;
	//public Character target;
	//public int duration;
	//public int buffID;
	
	private int duration;

	public Buff Buff (String bName, Character bTarget, int bDuration){
		Buff newBuff = new Buff();
		
		newBuff.name = bName;
		newBuff.target = bTarget;
		newBuff.duration = bDuration;
		newBuff.ID = 0;
		
		return newBuff;
	}

}
