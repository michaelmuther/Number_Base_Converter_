public class Main {

    public static void main (String[] args) {
        final String RESULT_STR = "Conversion result: ";
        Input input = new Input();
        Converter converter = new Converter(input.getNumber(), input.getBase());
        System.out.println(RESULT_STR + converter.getResult());
    }
}
