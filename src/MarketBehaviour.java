import java.util.List;

// Интерфейс MarketBehaviour определяет поведение магазина
public interface MarketBehaviour {
    // Методы для принятия актера в магазин, освобождения актеров из магазина и обновления состояния магазина
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}