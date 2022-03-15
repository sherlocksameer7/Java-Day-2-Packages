package com.project.harman;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Object Creation ***

        Addition add_obj = new Addition();
        Subtraction sub_obj = new Subtraction();
        Multiplication mul_obj = new Multiplication();
        Division div_obj = new Division();

        Integer x,y,z,Addition_result,Subtraction_result,Multiplication_result,Division_result;

        Scanner input = new Scanner(System.in);  // Input reading

        System.out.println("Enter 1st Num: ");
        x=input.nextInt();  // Get a 1st Input

        System.out.println("Enter 2nd Num: ");
        y=input.nextInt();  // Get a 2nd Input

        Addition_result = add_obj.Add_two_numbers(x, y);
        System.out.println("Addition of Two Numbers "+Addition_result);

        Subtraction_result = sub_obj.Sub_two_numbers(x, y);
        System.out.println("Subtraction of Two Numbers "+Subtraction_result);

        Multiplication_result = mul_obj.Mul_two_numbers(x, y);
        System.out.println("Multiplication of Two Numbers "+Multiplication_result);

        Division_result = div_obj.Div_two_numbers(x, y);
        System.out.println("Division of Two Numbers "+Division_result);


    }
}
