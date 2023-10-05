package Com.pluralsight;

import java.util.Scanner;
public class BasicCalculator{
    public static void main(String []args){
        //declare variables
        Scanner input = new Scanner(System.in);
        double nun1;
        double nun2;
        double answer;
        String operator;
        System.out.print("Enter your first number: ");
        nun1 = input.nextDouble();
        System.out.println("Enter the second number: ") ;
        nun2 = input.nextDouble();
        System.out.println();
        System.out.print("These are your possible calculations");
        System.out.println(" (A)dd");
        System.out.println(" (S)ubtract");
        System.out.println(" (M)ultily");
        System.out.println(" (D)ivide");
        input.nextLine();
        System.out.print("Please select an option: ");
        operator = input.nextLine();

        if(operator.equalsIgnoreCase("A"));



    }}