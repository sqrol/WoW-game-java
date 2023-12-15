public interface Ork extends Alive{
    int hp = 250;
    int armor = 1;

    String[] phrases = {
            "Ака'Магош", "Бин мог г'тазаг ча", "Де'мон", "Лок-тар огар",
            "Мок-гора", "Лок'ваднод", "Лок-Нараш", "Лак'тук", "Тром-Ка"
    };

    default void make_sound() {
        System.out.println(phrases[(int)(Math.random() * phrases.length)]);
    }
}
