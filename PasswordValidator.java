import java.util.Scanner;
import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        // Regex with lookaheads for at least one uppercase letter and one digit, length 8-16
        String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,16}$";

        if (Pattern.matches(regex, password)) {
            System.out.println("Пароль корректен!");
        } else {
            System.out.println("Пароль не соответствует требованиям.");
        }
    }
}
