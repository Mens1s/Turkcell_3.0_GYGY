package core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logged to mail: " + message);
    }

    @Override
    public void error(String error){
        System.out.println("Error logged to mail: " + error);
    }
}
