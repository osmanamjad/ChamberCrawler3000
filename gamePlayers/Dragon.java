package gamePlayers;

public class Dragon extends Enemy {
	// denoted by D
	// dragons always guard a treasure horde and spawn in a one block radius of the horde
	public Dragon() {
		this.ATTACK = 20;
		this.DEFENSE = 20;
		this.STARTINGHEALTH = 150;
		this.goldDropped = 0;
	}
}
