package com.mycompany.incometax;

import java.util.Scanner;

/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */
public class IncomeTax {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        15% on the first $50,197 of taxable income, plus
        20.5% on the next $50,195 of taxable income (on the portion of taxable income over 50,197 up to $100,392), plus
        26% on the next $55,233 of taxable income (on the portion of taxable income over $100,392 up to $155,625), plus
        29% on the next $66,083 of taxable income (on the portion of taxable income over 155,625 up to $221,708), plus
        33% of taxable income over $221,708
        */
        
        //imported
        Scanner doubleInput = new Scanner(System.in);
        
        //variables
        double salaryInput;

        //main
        System.out.println("Enter your yearly salary:");
        salaryInput = doubleInput.nextInt();
        
        System.out.println("Therefore the total tax owes is $" + bracketChecker(salaryInput));
       
    }
    
    private static double bracketChecker(double inputValue) {
        final double BRACKET_ONE_SALARY = 50197;
        final double BRACKET_TWO_SALARY = 100392;
        final double BRACKET_THREE_SALARY = 155625;
        final double BRACKET_FOUR_SALARY = 221708;
        final double BRACKET_FIVE_SALARY = 221709;
                
        final double BRACKET_ONE_TAX = 0.15;
        final double BRACKET_TWO_TAX = 0.205;
        final double BRACKET_THREE_TAX = 0.26;
        final double BRACKET_FOUR_TAX = 0.29;
        final double BRACKET_FIVE_TAX = 0.33;
        
        
        if(inputValue <= BRACKET_ONE_SALARY){
            return BRACKET_ONE_TAX * inputValue;
        } else if(inputValue <= BRACKET_TWO_SALARY){
            return BRACKET_TWO_TAX * inputValue;
        } else if(inputValue <= BRACKET_THREE_SALARY){
            return BRACKET_THREE_TAX * inputValue;
        } else if(inputValue <= BRACKET_FOUR_SALARY){
            return BRACKET_FOUR_TAX * inputValue;
        } else if(inputValue >= BRACKET_FIVE_SALARY){
            return BRACKET_FIVE_TAX * inputValue;
        } else{
            System.out.println("Error: invald input");
        }
        return 0;
        
    }
}
