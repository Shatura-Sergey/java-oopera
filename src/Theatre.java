import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Стас", "Костюшкин", Gender.MALE, 192);
        Actor actor2 = new Actor("Ольга", "Бузова", Gender.FEMALE, 176);
        Actor actor3 = new Actor("Прохор", "Шаляпин", Gender.MALE, 197);

        Director director1 = new Director("Сергей", "Бурунов", Gender.MALE, 174);
        Director director2 = new Director("Лариса", "Гузеева", Gender.FEMALE, 166);

        Person musicAuthor = new Person("Олег", "Нечипоренко", Gender.MALE);
        Person choreographer = new Person("Яна", "Кутузова", Gender.FEMALE);

        MusicalShow musicalShow = new MusicalShow("Щелкунчик", 1, director1, new ArrayList<>(), musicAuthor, "Зимний вечер. В небольшом немецком городке на улице оживленно и празднично. В доме господина Штальбаума готовятся к встрече Рождества.");
        Ballet ballet = new Ballet("Кармен", 1, director1, new ArrayList<>(), musicAuthor, "Площадь в Севилье. Все торжественно приветствуют прибывшего в город тореадора Эскамильо. Ликующая толпа ускоряется за своим кумиром.", choreographer);
        Opera opera = new Opera("Богема", 120, director1, new ArrayList<>(), musicAuthor, "В нетопленной мансарде художник Марсель корпит над своим полотном «Переход через Красное море».", 16);

        musicalShow.addActor(actor1);
        musicalShow.addActor(actor3);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        musicalShow.printActorsList();
        opera.printActorsList();
        ballet.printActorsList();

        opera.replaceActor(actor2,"Костюшкин");
        opera.printActorsList();

        ballet.replaceActor(actor1, "Бодров");

        opera.printLibretto();
        ballet.printLibretto();
    }
}
