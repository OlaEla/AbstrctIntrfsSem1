// Интерфейс QueueBehaviour определяет поведение очереди
public interface QueueBehaviour {
    // Методы для добавления актера в очередь, принятия заказов, отдачи заказов и освобождения очереди
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
