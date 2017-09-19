package com.example.problem3set0;

/**
 * Created by T00194823 on 13/09/2017.
 */
//This program will ask the user to input their name and taxable income to display the gross income
//and income after tax.

import java.util.Scanner;

public class Problem3Set0 {
    public static void main(String[] args) {

        String name;
        float taxIncome,taxDue = 0,netIncome = 0;

     Scanner input = new Scanner(System.in);

     System.out.print("Please enter your name: ");
     name = input.nextLine();

     System.out.print("Please enter your taxable income: ");
     taxIncome = input.nextFloat();

     if(taxIncome >= 0 && taxIncome <= 20000.00) {
         taxDue = 0;
         netIncome = taxIncome;
     }
        else if(taxIncome >= 20000.01 && taxIncome <= 36000.00)
     {
        taxDue = (36000 - taxIncome) * 0.2f;
        netIncome = taxIncome - taxDue;
     }
     else if(taxIncome >= 36000.01)
     {
         taxDue = (36000 - 20000.01f) * 0.2f + (taxIncome - 36000.01f) * 0.41f;
         netIncome = taxIncome - taxDue;
     }

     System.out.println("\nYour name is: " + name + "\nThe gross income(tax due) is " + taxDue +
     "\nThe income after tax is " + netIncome);

    }
}
