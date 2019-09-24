package Project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            //Gets the input from user
            final Scanner input = new Scanner(System.in);
            //Converts the given input to roman numerals.
            final String romanNumeral = getNumeral(input.nextInt());
            //Prints the final string
            System.out.print(romanNumeral);
        } catch (Exception e) {
            System.out.print("Could not find an integer. Are you sure you used a number? \nPlease try again.");
        }
    }

    /**
     * Loops through the {@link RomanNumeral} enum to find the correct numeral.
     *
     * @param number        The {@link Integer} required for conversion.
     * @return              A {@link String} of roman numerals.
     */
    private static String getNumeral(int number) {
        //String builder is used to append multiple string instead of using a single string.
        StringBuilder stringBuilder = new StringBuilder();

        while (number > 0) {
            //Loops through all the enum values
            for (RomanNumeral value : RomanNumeral.values()) {
                //Checks if the current enum value is possible
                if (number - value.getNumber() >= 0) {
                    //Adds the Adds te roman numeral of the found possible number to the string builder.
                    stringBuilder.append(value.name());
                    number -= value.getNumber();
                    break;
                }
            }
        }
        //Returns the final string.
        return stringBuilder.toString();
    }

        public enum RomanNumeral {
            //Order of values is important!
            M(1000),
            CM(900),
            D(500),
            CD(400),
            C(100),
            XC(90),
            L(50),
            XL(40),
            X(10),
            IX(9),
            V(5),
            IV(4),
            I(1);

        private final int number;

        //The constructor of the enum.
        RomanNumeral(int number) {
            this.number = number;
        }

        //Will return the number of the current value.
        public int getNumber() {
            return number;
        }
    }

}

