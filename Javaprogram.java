package Javaclass;

import java.util.Scanner;

public class Javaprogram {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
       float sum;
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        float number3 = sc.nextFloat();

        sum = number1 + number2 + number3;
        System.out.println(" sum of the numbers " +sum);

    }

}
