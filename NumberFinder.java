import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "The price is -10.50, the weight is 20kg, and the discount is 5.99. Another number is 100.";

        // Regex to match optional negative sign, integer part, and optional decimal part
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные числа:");
        // Loop through all matches found in the text
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
