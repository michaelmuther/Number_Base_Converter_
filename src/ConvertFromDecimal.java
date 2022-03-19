import java.math.BigInteger;

public class ConvertFromDecimal {

    private BigInteger decimal;
    private BigInteger base;
    private String result = "";

    public ConvertFromDecimal(BigInteger decimal, BigInteger base) {
        this.decimal = decimal;
        this.base = base;
        decimalToBase();
    }

    private void decimalToBase() {
        BigInteger quotient = decimal;
        StringBuilder tempResult = new StringBuilder();
        do {
            BigInteger remainder = bigIntRemainder(quotient,base);
            if (remainder.compareTo(BigInteger.TEN) >= 0) {
                char temp = (char) (87 + remainder.intValue());
                tempResult.append(temp);
            } else {
                tempResult.append(remainder);
            }
            quotient = quotient.divide(base);
        } while (quotient.compareTo(BigInteger.ZERO) > 0);
        result = tempResult.reverse().toString();
    }

    private BigInteger bigIntRemainder(BigInteger input, BigInteger base) {
        BigInteger temp = input.divide(base);
        temp = input.subtract(temp.multiply(base));
        return temp;
    }

    public String getResult() {
        return result;
    }
}

//    private void printResult() {
//        final String OUTPUT_FROM = "Conversion result: ";
//        System.out.println(OUTPUT_FROM + result + "\n");
//    }

//    private void converter() {
//        switch (base) {
//            case 2: decimalToBaseTwo();
//                break;
//            case 8: decimalToBaseEight();
//                break;
//            case 16: decimalToBaseSixteen();
//                break;
//        }
//    }

//    private void decimalToBaseEight() {
//        BigInteger quotient = decimal;
//        StringBuilder tempResult = new StringBuilder();
//        do {
//            tempResult.append(quotient % 8);
//            quotient = quotient / 8;
//        } while (quotient > 0);
//        result = tempResult.reverse().toString();
//    }
//
//    private void decimalToBaseSixteen() {
//        BigInteger quotient = decimal;
//        StringBuilder tempResult = new StringBuilder();
//        do {
//            int remainder = quotient % 16;
//            if (remainder > 9) {
//                tempResult.append(remainder == 10 ? "A" : remainder == 11 ? "B" : remainder == 12 ? "C" :
//                        remainder == 13 ? "D" : remainder == 14 ? "E" : "F");
//            } else {
//                tempResult.append(remainder);
//            }
//            quotient = quotient / 16;
//        } while (quotient > 0);
//        result = tempResult.reverse().toString();
//    }
