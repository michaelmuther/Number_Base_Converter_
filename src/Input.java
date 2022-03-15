import java.util.Scanner;

public class Input {

    private final String INPUT_NUMBER_STR = "Enter number in decimal system: ";
    private final String INPUT_BASE_STR = "Enter target base: ";

    private static Scanner scanner = new Scanner(System.in);
    private int number;
    private int base;

    public Input() {
        System.out.print(INPUT_NUMBER_STR);
        number = scanner.nextInt();
        System.out.print(INPUT_BASE_STR);
        base = scanner.nextInt();
    }

    public int getNumber() {
        return number;
    }

    public int getBase() {
        return base;
    }
}
