import java.math.BigInteger;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public Input() {
        final String INPUT_TWO_BASES_STR = "Enter two numbers in format: {source base} {target base} (To quit type /exit) ";
        final String INPUT_ENTER_STR = "Enter number in base %d to convert to base %d (To go back type /back) ";
        final String EXIT = "/exit";
        final String BACK = "/back";
        final String CONVERSION = "Conversion result: ";
        BigInteger number;
//        String numberString;
//        BigInteger baseFrom;
        BigInteger baseTo;
        int baseFromInt;
        int baseToInt;
        String input;
        String input2;
        do {
            System.out.print(INPUT_TWO_BASES_STR);
            input = scanner.nextLine();
            if (input.equals(EXIT)) {
                break;
            } else {
                String[] basesString = input.trim().split("\\s+");
                baseFromInt = Integer.parseInt(basesString[0]);
                baseToInt = Integer.parseInt(basesString[1]);
                do {
                    System.out.printf(INPUT_ENTER_STR, baseFromInt, baseToInt);
                    input2 = scanner.nextLine();
                    if (input2.equals(BACK)) {
                        break;
                    } else {
                        ConvertToDecimal convertTo = new ConvertToDecimal(input2, baseFromInt);
                        number = convertTo.getResult();
                        baseTo = BigInteger.valueOf(baseToInt);
                        ConvertFromDecimal convertFrom = new ConvertFromDecimal(number, baseTo);
                        System.out.println(CONVERSION + convertFrom.getResult());
                    }
                } while (true);
            }
        } while (true);
    }
}
