// Интерфейс ActorBehavior определяет поведение актора
public interface ActorBehavior {
    // Методы для установки и получения состояния заказа актора
    void setMakeOrder(boolean isMakeOrder);
    void setTakeOrder(boolean isTakeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}