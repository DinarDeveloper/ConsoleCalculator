import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {
    public static Object getResult(String expression)  {
        Object result = "";
        try{
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");

            result = engine.eval(expression);
        } catch (ScriptException exception){
            System.out.println("Неверный ввод");
        }
        return result;
    }
}
