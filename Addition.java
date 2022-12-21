package Javaclass;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        System.out.println("Addition of two numbers");
        Scanner sc = new Scanner(System.in);
        int sum;
        System.out.println("Enter the numbers");
        int number1 = sc.nextInt();
        System.out.println("Enter the first number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the second number: ");

        sum = number1 + number2;
        System.out.println(" sum of the numbers " +sum);

    }
}
