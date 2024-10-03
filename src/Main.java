public class Main {
    public static void main(String[] args) {

        Manas manas = new Manas(100,65,new Horse("Ak-kula"),Weapon.SWORD);
        Semetey semetey = new Semetey(89,34,new Horse("Kulachin"),Weapon.AXE);
        Seytek seytek = new Seytek(79,24,new Horse("Kashkulak"),Weapon.SPEAR);

        manas.say();
        semetey.say("my father is Manas");
        seytek.say("my father is Semetey");


    }
}