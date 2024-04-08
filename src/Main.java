import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Создание списка людей
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("User1"));
        humans.add(new Human("User2"));
        humans.add(new Human("User3"));

        // Создание нового экземпляра класса Market
        Market market = new Market();

        // // Добавление первого человека в магазин и обновление состояния магазина
        // market.acceptToMarket(humans.get(0)); // Добавляем первого человека из списка
        // market.update();

        // // Печать пустой строки для разделения вывода
        // System.out.println();

        // Добавление всех людей в магазин
        for (Human human : humans) {
            market.acceptToMarket(human);
        }

        // Обновление состояния магазина
        market.update();

        // Вывод информации о состоянии магазина
        market.printMarketInfo();

    }
}
