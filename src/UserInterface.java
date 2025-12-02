public class UserInterface implements EventListener {
    @Override
    public void update(String eventType, String message) {
        if ("AUTH".equals(eventType)) {
            System.out.println("UserInterface. Ласкаво просимо, " + message + "!");
        } else {
            System.out.println("UserInterface. Отримано сповіщення: " + message);
        }
    }
}