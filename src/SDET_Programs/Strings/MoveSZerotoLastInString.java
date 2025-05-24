package SDET_Programs.Strings;

public class MoveSZerotoLastInString {

    public static void main(String[] args) {
        String input = "32400121200";
        String formattedOutput = String.format("%011d",
                Long.parseLong(input));
        System.out.println("Formatted output: " + formattedOutput);

    }

    public static String rearrangeDigits(String input) {
        // Split the input into parts: digits and non-digits
        StringBuilder digits = new StringBuilder();
        StringBuilder nonDigits = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else {
                nonDigits.append(c);
            }
        }

        // Concatenate non-digits followed by digits
        return digits.toString() + nonDigits.toString();
    }
}
