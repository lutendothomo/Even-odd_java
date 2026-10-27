package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int number,remainder;
        System.out.println("Please enter any integer :");
        Scanner Scan = new Scanner(System.in);
        number=Scan.nextInt();
        remainder = number % 2;

        if(remainder == 0){
            System.out.println(number + " is an even Number");
        }else{
            System.out.println(number + " is an odd Number");
        }



    }
}