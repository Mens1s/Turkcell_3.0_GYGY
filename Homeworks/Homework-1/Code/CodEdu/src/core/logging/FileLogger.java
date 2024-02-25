package core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logged to file: " + message);
    }

    @Override
    public void error(String error){
        System.out.println("Error logged to file: " + error);
    }
}
