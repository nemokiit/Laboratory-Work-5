import java.util.regex.*;

public class CaseHighlighter {
    public static void main(String[] args) {
        String text = "javaIsCool, pythonIsAlsoNice, longVariableName";

        // Regex with two capturing groups: one for lowercase, one for uppercase
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        // Replace matches by referencing capturing groups $1 and $2 wrapped in exclamation marks
        String result = matcher.replaceAll("!$1$2!");

        System.out.println("Результат: " + result);
    }
}
