package starcraft;

public class Starcraft {
    static Zealot zealot = new Zealot();

    static Marine m1 = new Marine();
    static Marine m2 = new Marine();
    static Marine m3 = new Marine();

    static Marine[] marines = {m1, m2, m3};

    public static void main(String[] args) {
        showLog();

        zealotHit(Marine.attack);
        zealotHit(Marine.attack);
        zealotHit(Marine.attack);

        marineHit(Zealot.attack);

        showLog();

        zealotHit(Marine.attack);
        zealotHit(Marine.attack);
        zealotHit(Marine.attack);

        marineHit(Zealot.attack);

        showLog();

        zealotHit(Marine.attack);
        zealotHit(Marine.attack);
        zealotHit(Marine.attack);

        marineHit(Zealot.attack);

        showLog();
    }

    static void marineHit(int damage) {
        Marine m = null;
        for(int i = 0; i < marines.length; i++) {
            if(marines[i] != null) {
                m = marines[i];
                break;
            }
        }

        if(m == null) {
            System.out.println("모든 마린 사망");
            System.exit(0);
        }

        int remainHp = m.hp - damage;
        if(remainHp < 0) {
            m.hp = 0;
        }
        else {
             m.hp = remainHp;
        }

    }

    static void showLog() { // 전투로그
        System.out.println(zealot);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
    }

    static void zealotHit(int damage) {
        int remainShield = zealot.shield - damage;
        if(remainShield < 0) {
            // 실드 0 고정
            zealot.shield = 0;
            // hp에 데미지 더하기
            zealot.hp += remainShield;
        }
        else {
            zealot.shield = remainShield;
        }

    }

}
