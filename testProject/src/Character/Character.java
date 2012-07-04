/**
 * 
 */
package Character;
import Skills.Buff;

import java.util.LinkedList;
/**
 * @author Kevin
 *
 */
public class Character {
	
	public int team; // Integer indicating team
	
	// Attack
	public int p_attack;
	public int m_attack;
	
	// Defense
	public int p_defense;
	public int m_defense;
	
	// Linked List of buffs
	public LinkedList <Buff> buffs = new LinkedList <Buff> ();
	
	// Names of the character
	public String name;
	public String className;
	
	// Records the levels of each skill of the character
	public int [] skillsLevel = new int [5];
	
	// The amount of movement per turn
	public int movementPerTurn;
	
	// The position of the character
	public int x;
	public int y;
	
	public Character Character (int cteam, String cName){
		Character newCharacter = new Character();
		
		newCharacter.team = cteam;
		newCharacter.p_attack = 5;
		newCharacter.m_attack = 5;
		newCharacter.p_defense = 5;
		newCharacter.m_defense = 5;
		
		newCharacter.buffs = new LinkedList<Buff>(); // Empty linked list
		
		newCharacter.name = cName;
		newCharacter.className = "Knight";
		
		for (int i = 0; i<5; i++)
			newCharacter.skillsLevel[i] = 0;
		
		newCharacter.movementPerTurn = 3;
		newCharacter.x = 0;
		newCharacter.y = 0;
		
		return newCharacter;
	}
	

}
