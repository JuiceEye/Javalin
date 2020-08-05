import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.get("/helloworldpage", context -> {
            context.result("Hello, world!");
        });
        app.get("/:", context -> {
            context.result("Hello, world!");
        });
        app.start(8080);
    }
}
