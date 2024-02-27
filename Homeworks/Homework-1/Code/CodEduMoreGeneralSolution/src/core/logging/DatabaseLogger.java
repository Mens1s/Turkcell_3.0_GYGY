package core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logged to database: " + message);
    }

    @Override
    public void error(String error){
        System.out.println("Error logged to database: " + error);
    }
}
