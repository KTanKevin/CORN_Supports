package Skills;
import Character.Character;

public class Effect {

	public int ID;
	public Character target;
	public Character caster;
	public String name;

	public Effect Effect(String eName) {
		Effect newEffect = new Effect();

		newEffect.name = eName;
		newEffect.ID = 0;
		newEffect.target = null;
		newEffect.caster = null;

		return newEffect;
	}

	public void execute() {
		// Execute the effect according to each individual effect ID's
		// identification
	}

}
