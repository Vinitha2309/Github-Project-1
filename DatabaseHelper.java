import java.sql.*;

public class DatabaseHelper {

    private static final String DB_URL = "jdbc:sqlite:elderly_bot.db";

    public static void initDB() {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS reminders (id INTEGER PRIMARY KEY, message TEXT, time TEXT)");
            System.out.println("Database initialized.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void saveReminder(String message, String time) {
        try (Connection conn = DriverManager.getConnection(DB_URL)) {
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO reminders (message, time) VALUES (?, ?)");
            pstmt.setString(1, message);
            pstmt.setString(2, time);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
