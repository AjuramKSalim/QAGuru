package javatraining;


import java.util.Scanner;

public class MultiplyNumbersScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First no: ");

        int num1 = scan.nextInt();

        System.out.println("Second no: ");

        int num2 = scan.nextInt();
        int multiply= num1*num2;

        System.out.println("Result :" + multiply);



    }

}
