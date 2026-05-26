import java.util.Scanner;
import java.util.regex.*;

public class StartingLetterFinder {
    public static void main(String[] args) {
        String text = "Apple, banana, apricot, Avocado, cherry, Ant.";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву, с которой должны начинаться слова: ");
        String letter = scanner.next();

        // Dynamically build regex for a word boundary \b, matching the letter (case-insensitive), followed by any word characters
        String regex = String.format("\\b[%s%s]\\w*", letter.toLowerCase(), letter.toUpperCase());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные слова:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println(matcher.group());
            found = true;
        }

        if (!found) System.out.println("Слов не найдено.");
    }
}
