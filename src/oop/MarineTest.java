package oop;

public class MarineTest {
	static int attack = 6;
	static int defence;
	static int maxHp = 40;
	
	static int mineral = 50;
	static int gas;
	
	int kill;
	int hp = maxHp;
	int x;
	int y;
	@Override
	public String toString() {
		return String.format("Marine [attack=%d, defence=%d, kill=%d, hp=%d, x=%d, y=%d"
				, attack, defence, kill, hp, x, y );
	}

	
	
	
}
