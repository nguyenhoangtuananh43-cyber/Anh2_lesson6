public class FizzBuzzTranslate {

    public static String translate(int number) {
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");

        if ((divisibleBy3 || contains3) && (divisibleBy5 || contains5)) {
            return "FizzBuzz";
        } else if (divisibleBy3 || contains3) {
            return "Fizz";
        } else if (divisibleBy5 || contains5) {
            return "Buzz";
        }

        return readNumberInVietnamese(number);
    }

    private static String readNumberInVietnamese(int number) {
        String[] digits = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if (number < 10) {
            return digits[number];
        }
        int tens = number / 10;
        int ones = number % 10;
        return digits[tens] + " " + digits[ones];
    }
}
