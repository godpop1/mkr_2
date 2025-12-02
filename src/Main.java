public class Main {
    public static void main(String[] args) {
        EventManager manager = EventManager.getInstance();

        AuthModule auth = new AuthModule();
        LogModule log = new LogModule();
        UserInterface ui = new UserInterface();

        manager.subscribe(auth);
        manager.subscribe(log);
        manager.subscribe(ui);

        auth.loginUser("Гапон Артем");

        manager.notify("ERROR", "Connection lost");

        auth.logoutUser("Гапон Артем");
    }
}