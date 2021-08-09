package logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private Date date = new Date();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
    private static Logger instance;
    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void log(String msg) {
        System.out.println("[" + dateFormat.format(date) + " " + num++ + "] " + msg);
    }
}