import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    // Список акторов в очереди магазина
    private List<Actor> actorList = new ArrayList<>();
    private List<Human> customers = new ArrayList<>(); // Список покупателей в магазине

    @Override
    public void acceptToMarket(Actor actor) {
        // Когда актор приходит в магазин, добавляем его в очередь
        System.out.println(actor.getName() + " пришёл в магазин");
        takeInQueue(actor);
        if (actor instanceof Human) {
            customers.add((Human) actor); // Добавляем только экземпляры Human в список покупателей
        } 
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        // Когда акторы выходят из магазина, удаляем их из списка акторов
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            actorList.remove(actor);
        }
    }

    @Override
    public void update() {
        // Обновление состояния магазина: принимаем заказы, отдаем заказы, освобождаем очередь
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        // Добавляем актора в очередь магазина
        System.out.println(actor.getName() + " встал в очередь");
        actorList.add(actor);
    }

    @Override
    public void takeOrders() {
        // Принимаем заказы от акторов в очереди, если они еще не сделали заказ
        for (Actor actor : actorList) {
            if (!actor.isMakeOrder()) {
                System.out.println(actor.getName() + " сделал заказ");
                actor.setMakeOrder(true);
            }
        }
    }

    @Override
    public void giveOrders() {
        // Отдаем заказы акторам в очереди, если они уже сделали заказ
        for (Actor actor : actorList) {
            if (actor.isMakeOrder()) {
                System.out.println(actor.getName() + " получил свой заказ");
                actor.setTakeOrder(true);
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        // Освобождаем очередь от акторов, которые уже получили свой заказ
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : actorList) {
            if (actor.isTakeOrder()) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }

    // Метод для печати информации о состоянии магазина
    public void printMarketInfo() {
        System.out.println("Количество посетителей в магазине: " + customers.size());
        System.out.println("Имена посетителей в магазине:");
        for (Human customer : customers) {
            System.out.println(customer.getName());
        }
    }
}
