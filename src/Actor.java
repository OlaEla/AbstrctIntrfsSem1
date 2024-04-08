// Абстрактный класс Actor, который представляет актора в системе
public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    // Конструктор класса, принимающий имя актора и инициализирующий его состояние
    public Actor(String name) {
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
    }

    // Абстрактный метод для получения имени актора
    abstract String getName();
}