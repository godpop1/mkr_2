public class AuthModule implements EventListener {

    public void loginUser(String username) {
        notifyAuth("AUTH", "login", username);
    }

    public void logoutUser(String username) {
        notifyAuth("LOGOUT", "logout", username);
    }

    private void notifyAuth(String eventType, String action, String username) {
        System.out.println("Auth: " + action + " " + username);
        EventManager.getInstance().notify(eventType, username);
    }

    @Override
    public void update(String eventType, String message) {
    }
}