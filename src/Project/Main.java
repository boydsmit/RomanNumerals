package Project;
import java.util.Scanner;

public class Main {
    private static double number;
    private static String romanString = "";


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
        else if(number - 500  >= 0) {
            romanString = romanString + "D";
            number -= 500;
        }
        else if(number - 100 >= 0) {
            romanString = romanString + "C";
            number -= 100;
        }
        else if (number - 50 >= 0) {
            romanString = romanString + "L";
            number -= 50;
        }
        else if(number - 10 >= 0) {
            romanString = romanString + "X";
            number -= 10;
        }
        else if(number - 5 >= 0) {
            romanString = romanString + "V";
            number -= 5;
        }
        else if(number - 1 >= 0) {
            romanString = romanString + "I";
            number -= 1;
        }
    }
}

