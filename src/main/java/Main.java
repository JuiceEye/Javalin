import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.get("/:firtvariable/:action/:secondvariable", context -> {
            context.result("Answer is " + calculate(Integer.parseInt(context.pathParam("firstvariable")), Integer.parseInt(context.pathParam("secondvariable")), context.pathParam("action")));
        });
        app.get("/JuiceEye", context -> {
            context.result("Hello, JuiceEye");
        });
        app.start(8080);
    }

    public static String calculate(int firstvariable, int secondVariable, String action) {
        String answer = "isn't defined. Invalid action";
        if (action.equals("+")) {
            answer = Integer.toString(firstvariable + secondVariable);
        }
        if (action.equals("-")) {
            answer = Integer.toString(firstvariable - secondVariable);
        }
        if (action.equals("*")) {
            answer = Integer.toString(firstvariable * secondVariable);
        }
        if (action.equals(":")){
            answer = Integer.toString(firstvariable / secondVariable);
        }
        return answer;
    }
}
