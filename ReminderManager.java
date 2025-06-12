import java.util.concurrent.*;

public class ReminderManager {

    public static void scheduleReminder(String message, int intervalSeconds) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("[Reminder] " + message + " (Scheduled at " + java.time.LocalTime.now() + ")");
            // Could trigger GUI or TTS here
        };

        scheduler.scheduleAtFixedRate(task, 0, intervalSeconds, TimeUnit.SECONDS);
    }
}
