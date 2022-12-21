package Javaclass;

import java.util.Scanner;

public class Substraction {
    public static void main(String[] args) {
        System.out.println("Substraction of two numbers");

        Scanner sc = new Scanner(System.in);
        int sub;
        int number1 = sc.nextInt();
        System.out.println("Enter the first number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the second number: ");
        sub = number1 - number2;
        System.out.println(" sum of the numbers " +sub);

    }
}
