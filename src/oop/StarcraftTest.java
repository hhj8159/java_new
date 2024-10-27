package oop;

public class StarcraftTest {
	static ZealotTest zeal1 = new ZealotTest();
	
	static MarineTest mar1 = new MarineTest();			
	static MarineTest mar2 = new MarineTest();			
	static MarineTest mar3 = new MarineTest();			
	
	static MarineTest[] marineTests = {mar1, mar2, mar3};
	
	public static void main(String[] args) {
		showlog1();
		
		
		
		
		
		
	}
	
	static void showlog1() {
		System.out.println(zeal1);
		System.out.println(mar1);
		System.out.println(mar2);
		System.out.println(mar3);
	}
	
	static void marineHit1(int damage) {
		MarineTest mar = null;
		for(int i = 0; i < marineTests.length; i++) {
			if(marineTests[i] != null) {
				mar = marineTests[i];
				break;
			}
		}
		
		if(mar == null) {
            System.out.println("모든 마린 사망");
            System.exit(0);
        }

        int remainHp = mar.hp - damage;
        if(remainHp < 0) {
            mar.hp = 0;
        }
        else {
             mar.hp = remainHp;
        }
	}
	
	static void zealotHit1(int damage) {
		int remainShield1 = zeal1.shield - damage;
		if(remainShield1 < 0) {
			zeal1.shield = 0;
			zeal1.hp += remainShield1;
		}
		else {
			zeal1.shield = remainShield1;
		}
	}
	
}
