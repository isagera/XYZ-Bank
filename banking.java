/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerald;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class banking {
    public static void main(String[] args) {
              System.out.println("WELCOME TO XYZ BANK");
              System.out.println("choose your account type");
              System.out.println("1. Regular account"); 
              System.out.println("2. Interest account");
              System.out.println("3. Checking account");
              System.out.println("4. CD account");
              Scanner in =new Scanner(System.in);
              System.out.println("ENTER PIN HERE");
              int pin= in.nextInt();
              switch(pin){
                  case 1:
                      System.out.println("FOR THE TRANSACTIONS THAT OCCUR IN THIS ACCOUNT;");
                      System.out.println("charges of 10% of the balance at the end of the month");
                      System.out.println("penalty of 10.00 when the balance goes below of 50,000.00");
                      System.out.println("no interest");
                      break;
                  case 2:
             System.out.println("FOR THE TRANSACTIONS THAT OCCUR IN THIS ACCOUNT;");
                      System.out.println("charges of 10% of the balance at the end of month");
                      System.out.println("interest of 7% paid monthly");
                      System.out.println("interest of 7% paid monthly");
             break;
                  case 3:
             System.out.println("FOR THE TRANSACTIONS THAT OCCUR IN THIS ACCOUNT;");
                      System.out.println("charges of 10% of the balance at the end of month");
                      System.out.println("annual interest of 7%");
                      System.out.println("penalty of 10.00 when balance goes below 10,000.00");
                      System.out.println("charges of 0.10 on every transaction");
             break;
                  case 4:
              System.out.println("FOR THE TRANSACTIONS THAT OCCUR IN THIS ACCOUNT;");
                      System.out.println("charges of 10% of the balance at the end of month");
                      System.out.println("annual interest of 15%");
                      System.out.println("no minimum balance required");
                      System.out.println("penalty of 20% of current balance if you withdraw before 12 month");
              break;
                  default:
                      System.out.println("the pin is wrong");
                      main(null);
                      break;
              }
    }
}
