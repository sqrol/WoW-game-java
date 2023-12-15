public class Player2 implements Alive, Ork, Warrior, Weapon {
    private int health = Alive.hp + Ork.hp + Ork.armor;
    private String weapon = "";
    Player2() {
        Object[] values = Weapon.weapons.keySet().toArray();
        this.weapon = (String)values[(int)(Math.random() * values.length)];
    }

    public int get_health() {
        return this.health;
    }

    public int get_damage() {
        return Weapon.weapons.get(this.weapon) + Alive.dmg;
    }

    @Override
    public boolean critical_hit() {
        int prob = (int)(1 + Math.random() * 10);
        return prob <= 4;
    }

    public String get_weapon() {
        return this.weapon;
    }
}
