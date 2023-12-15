import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player1 pl = new Player1();
        Player2 pl2 = new Player2();

        System.out.println("Битва начинается!");
        System.out.println();
        System.out.printf("Первый игрок сражается с оружием: %s\n", pl.get_weapon());
        System.out.printf("Второй игрок сражается с оружием: %s\n", pl2.get_weapon());
        System.out.println();
        System.out.println("======== FIGHT ========");
        System.out.println();
        int curr_hp_pl = pl.get_health();
        int curr_hp_pl2 = pl2.get_health();

        do {
            pl.make_sound();
            pl2.make_sound();
            System.out.println();
            curr_hp_pl2 -= pl.get_damage();
            System.out.printf("Первый игрок атаковал на %d\n", pl.get_damage());
            curr_hp_pl -= pl2.get_damage();
            System.out.printf("Второй игрок атаковал на %d\n", pl2.get_damage());

            if (pl2.critical_hit()) {
                curr_hp_pl -= pl2.get_damage() * 2;
                System.out.printf("Второй игрок нанес критический урон %d\n", pl2.get_damage() * 2);
            }

            if (pl.heal()) {
                System.out.println("Первый игрок восстановил себе 17 здоровья\n");
            }

            System.out.printf("Текущее здоровье первого игрока: %d\n", curr_hp_pl);
            System.out.printf("Текущее здоровье второго игрока: %d\n", curr_hp_pl2);
            System.out.println();
        } while (curr_hp_pl > 0 && curr_hp_pl2 > 0);
    }
}
