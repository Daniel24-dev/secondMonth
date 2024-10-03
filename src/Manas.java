public class Manas {
    private int health;
    private int damage;
    private Horse horse;
    private Weapon weapon;

    public Manas(int health, int damage, Horse horse, Weapon weapon) {
        this.health = health;
        this.damage = damage;
        this.horse = horse;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public Horse getHorse() {
        return horse;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void say(){
        System.out.println("Im a hero");

    }
    public void say(String words){
        System.out.println(words);

    }
}
