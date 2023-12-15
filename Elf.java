public interface Elf extends Alive {
    int hp = 150;
    int armor = 3;

    String[] phrases = {
            "О... я вся дрожу...", "Об этом я и мечтать не смела!", "Вы меня смущаете!",
            "Я не та дриада, которую ты ищешь", "У женщин свои секреты",
            "Рожденный летать - ползать не может!", "Лучше бы я впал в спячку"
    };

    default void make_sound() {
        System.out.println(phrases[(int)(Math.random() * phrases.length)]);
    }

}
