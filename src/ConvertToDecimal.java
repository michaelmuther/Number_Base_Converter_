import java.math.BigInteger;

public class ConvertToDecimal {

    private String input;
    private int base;
    private BigInteger result = new BigInteger("0");

    public ConvertToDecimal(String input, int base) {
        this.input = input;
        this.base = base;

        int length = input.length();
        int index = 0;

        for (int i = length - 1; i >= 0; i--) {
            int temp;
            try {
                temp = Integer.parseInt(Character.toString(input.charAt(i)));
            } catch (Exception e){
                temp = input.charAt(i) - 87;
            }
            long temp2 = temp * (long) Math.pow(base, index);
            result = result.add(BigInteger.valueOf(temp2));
            index++;
        }
    }

    public BigInteger getResult() {
        return result;
    }
}

//    public ConvertToDecimal(String input, int base) {
//        this.input = input;
//        this.base = base;
//        try {
//            result = BigInteger.valueOf(Integer.parseInt(input, base));
//        } catch (NumberFormatException e) {
//            if (base == 10) {
//                result = new BigInteger(input);
//            } else if (base == 2) {
//                result = bigBinaryStringToInteger();
//            } else {
//                System.out.println("woops, needs more work!");
//            }
//        }
//    }
//
//
//    private BigInteger bigBinaryStringToInteger() {
//        int length = input.length();
//        // need to convert a long binary string into an integer.
//        for(int i = length; i > 0; i++) {
//
//        }
//
//        return new BigInteger("11");
//    }

//    private void printResult() {
//        final String OUTPUT_TO = "Conversion to decimal result: ";
//        System.out.println(OUTPUT_TO + result + "\n");
//    }

//    private void converter() {
//        switch (base) {
//            case 2: binaryToDecimal();
//                break;
//            case 8: octalToDecimal();
//                break;
//            case 16: hexToDecimal();
//                break;
//        }
//    }
//
//    private void binaryToDecimal() {
//
//    }
//
//    private void octalToDecimal() {
//
//    }
//
//    private void hexToDecimal() {
//
//    }


//    private void decimalToBaseTwo() {
//        int quotient = decimal;
//        StringBuilder tempResult = new StringBuilder();
//        do {
//            tempResult.append(quotient % 2);
//            quotient = quotient / 2;
//        } while (quotient > 0);
//        result = tempResult.reverse().toString();
//    }
//
//    private void decimalToBaseEight() {
//        int quotient = decimal;
//        StringBuilder tempResult = new StringBuilder();
//        do {
//            tempResult.append(quotient % 8);
//            quotient = quotient / 8;
//        } while (quotient > 0);
//        result = tempResult.reverse().toString();
//    }
//
//    private void decimalToBaseSixteen() {
//        int quotient = decimal;
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


