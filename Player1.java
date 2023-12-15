public class Player1 implements Alive, Elf, Healer, Weapon {
    private int health = Alive.hp + Elf.hp + Elf.armor * 10; // 1 армор = 10 хп
    private String weapon = "";
    Player1() {
        Object[] values = Weapon.weapons.keySet().toArray();
        this.weapon = (String)values[(int)(Math.random() * values.length)];
    }

    int get_health() {
        return this.health;
    }

    int get_damage() {
        return Weapon.weapons.get(this.weapon) + Alive.dmg;
    }

    @Override
    public boolean heal() {
        final int max_hp = Alive.hp + Elf.hp + Elf.armor * 10;
        int prob = (int)(1 + Math.random() * 10);
        if(prob >= 6) {
            this.health += 17;
            return true;
        }
        return false;
    }

    public String get_weapon() {
        return this.weapon;
    }
}
