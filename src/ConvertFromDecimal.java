public class ConvertFromDecimal {

    private int decimal;
    private int base;
    private String result = "";

    public ConvertFromDecimal(int decimal, int base) {
        this.decimal = decimal;
        this.base = base;
        result = Integer.toString(decimal, base); // this Integer built-in function will handle all requirements. Is there an opposite?
        printResult();
    }

    private void printResult() {
        final String OUTPUT_FROM = "Conversion result: ";
        System.out.println(OUTPUT_FROM + result + "\n");
    }
}

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
//
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