import java.text.NumberFormat;

public class PricelessScript {
    /**
     * Proof that MasterCard marketing is in your DNA
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // String variables, some with format specifiers
        String scriptTemplateLine1 = "%d tickets: %s";
        String scriptTemplateLine2 = "%d hotdogs, %d popcorn, %d sodas: %s";
        String scriptTemplateLine3 = "2 autographed baseball %s";
        String scriptTemplateLine4 = "Watching the Giants win: %s";
        String priceless = "priceless";

        // integer variable
        int people = 3;
        // 32 bit floating point variable
        float ticketPrice = 14.0f;  // 32 Bit, but it does exist!
        // double precision floating point variable
        double itemPrice = 9.0;    // Double precision
        // boolean variable
        boolean trueOrFalse = false;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.printf((scriptTemplateLine1) + "%n", people,
                formatter.format(people * ticketPrice));

        // Example of using printf and platform specific line separator "%n" to
        // format instead of String.format
        System.out.printf((scriptTemplateLine2) + "%n", people, people, people,
                formatter.format(people * itemPrice));

        itemPrice = 90.0;
        System.out.printf((scriptTemplateLine3) + "%n", formatter.format(itemPrice));

        System.out.printf((scriptTemplateLine4) + "%n", priceless);

        System.out.println(trueOrFalse);
}}