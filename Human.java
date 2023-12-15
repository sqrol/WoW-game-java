public interface Human extends Alive{
    int hp = 100;
    int armor = 5;

    String[] phrases = {
           "Кто с мечом к нам придёт... тех проще застрелить!", "Мой молот укрепит вашу веру",
           "Лучше меня не злить", "Кто тут хочет подраться?!", "Нужно было стать крестьянином, как хотел мой отец.",
           "Склонись перед своим повелителем", "Во имя правосудия!", "За честь и отвагу!"
    };

    default void make_sound() {
        System.out.println(phrases[(int)(Math.random() * phrases.length)]);
    }
}
