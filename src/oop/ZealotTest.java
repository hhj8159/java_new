package oop;

public class ZealotTest {
	
	// 클래스 모든 질럿이 공유하는 정보 static
	static int attack = 16;
	static int defence;
	static int maxHp = 100;
	static int maxshield = 60;
	
	static int mineral = 100;
	static int gas;
	
	int kill;
	int hp = maxHp;
	int shield = maxshield;
	int x;
	int y;
	@Override
	public String toString() {
		return String.format("Zealot [attack=%d, defence=%d, kill=%d, hp=%d, shield=%d, x=%d, y=%d"
				, attack, defence, kill, hp, shield, x, y );
	}
	
	
	
}
