import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public Input() {
        final String INPUT_TO_FROM = "Do you want to convert /from decimal or /to decimal? (To quit type /exit) ";
        final String INPUT_FROM_STR = "Enter number in decimal system: ";
        final String INPUT_TO_STR = "Enter source number: ";
        final String INPUT_TARGET_BASE_STR = "Enter the target base: ";
        final String INPUT_SOURCE_BASE_STR = "Enter source base: ";
        final String EXIT = "/exit";
        final String FROM = "/from";
        final String TO = "/to";
        int number;
        String numberString;
        int base;
        String fromToExit;
        do {
            System.out.print(INPUT_TO_FROM);
            fromToExit = scanner.nextLine();
            if(fromToExit.equals(EXIT)) {
                break;
            } else if (fromToExit.equals(TO)) {
                System.out.print(INPUT_TO_STR);
                numberString = scanner.nextLine();
                System.out.print(INPUT_SOURCE_BASE_STR);
                base = scanner.nextInt();
                new ConvertToDecimal(numberString, base);
            } else if (fromToExit.equals(FROM)) {
                System.out.print(INPUT_FROM_STR);
                number = scanner.nextInt();
                System.out.print(INPUT_TARGET_BASE_STR);
                base = scanner.nextInt();
                new ConvertFromDecimal(number, base);
            }
        } while (true);
    }
}
