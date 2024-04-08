// Класс Human представляет человека и наследует от класса Actor
public class Human extends Actor {

    // Конструктор класса, вызывает конструктор суперкласса и передает имя актора
    public Human(String name) {
        super(name);
    }

    // Переопределенный метод для получения имени актора
    @Override
    String getName() {
        return name;
    }

    // Переопределенные методы интерфейса ActorBehavior для установки и получения состояния заказа актора
    @Override
    public void setMakeOrder(boolean isMakeOrder) {
        this.isMakeOrder = isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        this.isTakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}