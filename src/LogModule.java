public class LogModule implements EventListener {
    @Override
    public void update(String eventType, String message) {
        System.out.println("[LOG] Подія: " + eventType + " | Дані: " + message);
    }
}