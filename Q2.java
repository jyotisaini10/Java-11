import java.text.SimpleDateFormat;
import java.util.Date;

class DateParseException extends Exception {
    public DateParseException(String message) {
        super(message);
    }
}

public class Q2 {
    public static void parseDate(String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = formatter.parse(dateStr);
            System.out.println("Parsed Date: " + date);
        } catch (Exception e) {
            System.out.println("Exception: DateParseException - Unparseable date: \"" + dateStr + "\"");
        } finally {
            System.out.println("Formatter closed");
        }
    }

    public static void main(String[] args) {
        parseDate("2024-12-25");
        parseDate("2024-14-01");
        parseDate("2024-11-01");
    }
}