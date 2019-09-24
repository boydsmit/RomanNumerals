package Project;
import java.util.Scanner;

public class Main {
    private static double number;
    private static String romanString = "";
    enum RomaNumerals{
        M, D, C, L, X, V, I
    }


    public static void main(String[] args) {
        try {
            //Gets the input from user
            Scanner input = new Scanner(System.in);
            number = input.nextDouble();

            while(number != 0) {
                findCorrectNumeral();
            }
            System.out.println(romanString);

        } catch (Exception e) {
            System.out.println("Could not find an integer. Are you sure you used a number? \nPlease try again.");
        }
    }

    private static void findCorrectNumeral() {
        if (number - 1000  >= 0) {
            romanString = romanString + "M";
            number -= 1000;
        }
        else if(number - 900 >= 0) {
            romanString = romanString + "CM";
            number -= 900;
        }
        else if(number - 500  >= 0) {
            romanString = romanString + "D";
            number -= 500;
        }
        else if(number - 400 >= 0 ) {
            romanString = romanString + "CD";
            number -= 400;
        }
        else if(number - 100 >= 0) {
            romanString = romanString + "C";
            number -= 100;
        }
        else if(number - 90 >= 0) {
            romanString = romanString + "XC";
            number -= 90;
        }
        else if (number - 50 >= 0) {
            romanString = romanString + "L";
            number -= 50;
        }
        else if(number - 40 >= 0) {
            romanString = romanString + "XL";
            number -= 40;
        }
        else if(number - 10 >= 0) {
            romanString = romanString + "X";
            number -= 10;
        }
        else if(number - 9 >= 0) {
            romanString = romanString + "IX";
            number -= 9;
        }
        else if(number - 5 >= 0) {
            romanString = romanString + "V";
            number -= 5;
        }
        else if(number - 4 >= 0) {
            romanString = romanString + "IV";
            number -= 4;
        }
        else if(number - 1 >= 0) {
            romanString = romanString + "I";
            number -= 1;
        }
    }

    private static void findNumerals2() {
         RomaNumerals CurNumeral;
        CurNumeral = RomaNumerals.M;
        switch(CurNumeral){
            case M:

                break;
            case D:

                break;
            case C:

                break;
            case L:

                break;
            case X:

                break;
            case V:
                break;
            case I:
                break;
        }
    }
}

