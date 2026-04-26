import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
    public static void parseDate(String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = formatter.parse(dateStr);
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.out.println("Exception: DateParseException - " + e.getMessage());
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