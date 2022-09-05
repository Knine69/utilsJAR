package demo;

import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    private static final StringUtils utils = new StringUtils();

    public static void main(String[] args) {
        String number;
        System.out.println("Insert the number you want to evaluate: ");
        while (true) {
            number = scan.nextLine();
            if (utils.checkIfNumber(number)) {
                if (utils.isPositiveNumber(number)) {
                    System.out.println("Positive number inserted: " + number);
                } else {
                    System.out.println("Negative number inserted: " + number);
                }
                break;
            } else {
                System.out.println("Input inserted is not a number, please insert one.");
            }
        }
    }
}
