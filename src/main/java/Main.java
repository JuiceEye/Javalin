import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.get("/:firtvariable/:action':secondvariable", context -> {
            context.result("Answer is " + context.pathParam(calculate(Integer.parseInt("firstvariable"), Integer.parseInt("secondvariable"), "action")));
        });
        app.start(8080);
    }

    public static String calculate(int firstvariable, int secondvariable, String action) {
        String answer = "Error";
        if (action.equals("+")) {
            answer = new Integer(firstvariable + secondvariable).toString();
        }
        if (action.equals("-")) {
            answer = new Integer(firstvariable - secondvariable).toString();
        }
        if (action.equals("*")) {
            answer = new Integer(firstvariable * secondvariable).toString();
        }
        if (action.equals(":")){
            answer = new Integer (firstvariable / secondvariable).toString();
        }
        return answer;
    }
}
