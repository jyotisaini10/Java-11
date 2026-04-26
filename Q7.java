import java.text.SimpleDateFormat;
import java.util.Date;

class DateParseException7 extends Exception {
    public DateParseException7(String msg) {
        super(msg);
    }
}

public class Q7 {
    public static void parseDate(String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = formatter.parse(dateStr);
            System.out.println("Parsed Date: " + date);
            System.out.println("[INFO] DateFormat object closed successfully.");
        } catch (Exception e) {
            System.out.println("Exception: DateParseException - Unparseable date: \"" + dateStr + "\"");
            System.out.println("[ERROR] DateParseException occurred.");
            System.out.println("[INFO] DateFormat object closed successfully.");
        } finally {
            System.out.println("Formatter closed");
        }
    }

    public static void main(String[] args) {
        parseDate("2024-12-25");
        parseDate("2024-13-01");
        parseDate("2024-01-01");
    }
}