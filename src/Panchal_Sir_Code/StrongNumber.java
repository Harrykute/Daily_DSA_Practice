package Panchal_Sir_Code;

import java.util.Iterator;
import java.util.Scanner;

/* 1. Strong Number:
• Input: 145
• Output: Yes (1! + 4! + 5! = 145)*/
public class StrongNumber {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the No to check Given no is Strong Or Not ");
		 int number= sc.nextInt();
		 if(strongNumber(number)==number){ // this condition weill true if the given no is eqal to strongNumber
			 System.out.println("Yes , Given No is strong ");
		 }
		 else {
			 System.out.println("No , Given No is not strong ");
		 }
	}
	 
	 public static int strongNumber(int n) { // this function return the totalof factorial
		 int totalOfFactorial=0;
		 while(n>0) {
			int digit= n%10;
			totalOfFactorial +=factorial(digit);
			n=n/10;
		 }
		 return totalOfFactorial;
	 }
	 
	 public static int factorial(int a) { // this function is returning the factorial of number
		 int fact=1;
		 for(int i=1;i<=a;i++) { // it will run till no
			 fact = fact*i;
		 }
		 return fact;
	 }
}
