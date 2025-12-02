import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private static EventManager instance;
    private final List<EventListener> listeners = new ArrayList<>();

    private EventManager() {}

    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void notify(String eventType, String message) {
        for (EventListener listener : listeners) {
            listener.update(eventType, message);
        }
    }
}