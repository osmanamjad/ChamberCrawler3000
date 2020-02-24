package gamePlayers;

public class Enemy extends Character {
	// move randomly 1 floor tile at a time (except dragons, who are stationary)
	// if playerCharacter is within 1 block radius, they will be attacked
	protected int goldDropped = 1;
	public Enemy() {
		
	}
}
