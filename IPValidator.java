import java.util.Scanner;
import java.util.regex.*;

public class IPValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите IP-адрес: ");
        String ip = scanner.nextLine();

        // Sub-regex to validate a single IPv4 byte (0-255)
        String byteRegex = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        // Constructing full IPv4 regex by joining 4 byte expressions with dots
        String ipRegex = "^" + byteRegex + "\\." + byteRegex + "\\." + byteRegex + "\\." + byteRegex + "$";

        if (Pattern.matches(ipRegex, ip)) {
            System.out.println("IP-адрес корректен!");
        } else {
            System.out.println("Некорректный IP-адрес.");
        }
    }
}
