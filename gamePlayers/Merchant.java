package gamePlayers;

public class Merchant extends Enemy {
	boolean isHostile = false;
	public Merchant() {
		this.ATTACK = 70;
		this.DEFENSE = 5;
		this.STARTINGHEALTH = 30;
		this.goldDropped = 0;
	}
}
