package ninja.javafx.smartcsv.validation;

/**
 * @author abi
 */
public class DateFormatHelper {


    public static String dateFormat(String format, String defaultFormat) {

        if (format != null && !format.trim().isEmpty()) {
            format = format.trim();
            if (format.startsWith("fmt:")) {
                format = format.substring(4);
                format = format.replace("%Y", "yyyy");
                format = format.replace("%y", "yy");
                format = format.replace("%m", "MM");
                format = format.replace("%d", "dd");
                format = format.replace("%a", "E");
                format = format.replace("%A", "EEEE");
                format = format.replace("%w", "F");
                format = format.replace("%b", "MMM");
                format = format.replace("%B", "MMMMM");
                format = format.replace("%H", "HH");
                format = format.replace("%I", "hh");
                format = format.replace("%p", "a");
                format = format.replace("%M", "mm");
                format = format.replace("%S", "ss");
                format = format.replace("%z", "Z");
                format = format.replace("%Z", "z");
                format = format.replace("%j", "DDD");
                format = format.replace("%U", "ww");
                return format;
            }
        }
        return defaultFormat;
    }
}