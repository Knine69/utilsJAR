package demo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(new App().greeting());
        Scanner scan  = new Scanner(System.in);

        System.out.println("Insert the number you want to evaluate: ");
        String number = scan.nextLine();
        System.out.println(number + " is a positive number: " + new StringUtils().isPositiveNumber(number));
    }

    public String greeting(){
        return "Hello... Starting application";
    }
}
