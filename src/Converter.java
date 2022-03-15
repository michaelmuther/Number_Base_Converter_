public class Converter {

    private int number;
    private int base;
    private int result;

    public Converter(int number, int base) {
        this.number = number;
        this.base = base;
        converter();
    }

    private void converter() {
        switch (base) {
            case 2: decimalToBaseTwo();
                    break;
            case 8: decimalToBaseEight();
                    break;
            case 16: decimalToBaseSixteen();
                    break;
        }
    }

    private void decimalToBaseTwo() {
        int quotient = number;
        String tempResult = "";
        do {
            tempResult += String.valueOf(quotient % 2);
            quotient = quotient / 2;
            String temp = new StringBuilder(tempResult).reverse().toString();
            result = Integer.parseInt(temp);
        } while (quotient > 0);
    }

    private void decimalToBaseEight() {
        int quotient = number;
        String tempResult = "";
        do {
            tempResult += String.valueOf(quotient % 8);
            quotient = quotient / 8;
            String temp = new StringBuilder(tempResult).reverse().toString();
            result = Integer.parseInt(temp);
        } while (quotient > 0);
    }

    private void decimalToBaseSixteen() {
        int quotient = number;
        String tempResult = "";
        do {
            tempResult += String.valueOf(quotient % 16);
            quotient = quotient / 16;
            String temp = new StringBuilder(tempResult).reverse().toString();
            result = Integer.parseInt(temp);
        } while (quotient > 0);
    }

    public int getResult() {
        return result;
    }
}
