package assignments.ex1;
import java.util.Scanner;

public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "";
        String quit = "quit";

        while (true) {

            System.out.println("\nEx1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if (num1.equalsIgnoreCase(quit)) break;
            boolean validNum1 = Ex1.isNumber(num1);
            int value1 = Ex1.number2Int(num1);
            System.out.println("num1= " + num1 + " is number: " + validNum1 + " , value: " + value1);
            if (!Ex1.isNumber(num1)) {
                System.out.println("ERR: num1 is in the wrong format!");
                continue;
            }


            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();
            if (num2.equalsIgnoreCase(quit)) break;
            boolean validNum2 = Ex1.isNumber(num2);
            int value2 = Ex1.number2Int(num2);
            System.out.println("num2= " + num2 + " is number: " + validNum2 + " , value: " + value2);
            if (!Ex1.isNumber(num2)) {
                System.out.println("ERR: num2 is in the wrong format!");
                continue;
            }

            if (!validNum1 || !validNum2) {
                System.out.println("Invalid input detected. Please try again.");
                System.exit(0);
            }

            System.out.println("Enter a base for output: (a number [2,16]): ");
            int base = sc.nextInt();
            if (base < 2 || base > 16) {
                System.out.println("Invalid base. Please enter a value between 2 and 16.");
            }

            int sum = value1 + value2;
            int product = value1 * value2;

            String sumInBase = Ex1.int2Number(sum, base);
            String productInBase = Ex1.int2Number(product, base);

            System.out.println(num1 + " + " + num2 + " = " + sumInBase);
            System.out.println(num1 + " * " + num2 + " = " + productInBase);

            String[] numbers = {num1, num2, Ex1.int2Number(sum, base), Ex1.int2Number(product, base)};
            int maxIndex = Ex1.maxIndex(numbers);
            System.out.println("Max number over [" + String.join(",", numbers) + "] is: " + numbers[maxIndex]);

        }
        System.out.println("Quitting now...");
        sc.close();
    }
}