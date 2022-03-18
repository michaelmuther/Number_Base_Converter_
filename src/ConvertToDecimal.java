public class ConvertToDecimal {

    private String input;
    private int base;
    private int result;

    public ConvertToDecimal(String input, int base) {
        this.input = input;
        this.base = base;
        result = Integer.parseInt(input, base);
        printResult();
    }

    private void printResult() {
        final String OUTPUT_TO = "Conversion to decimal result: ";
        System.out.println(OUTPUT_TO + result + "\n");
    }
}

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


