package Panchal_Sir_Code;

/*2. Perfect Number:
• Input: 28
• Output: Yes (1 + 2 + 4 + 7 + 14 = 28)*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no To Check Given no is Perfect Or Not");
        int number=sc.nextInt(); // Taking input nummber

        if (perfectNumber(number)==number){
            System.out.println("Yes,Given No is Perfect Number");
        }
        else{
            System.out.println("No,Given No is not Perfect Number");
        }
    }

    public static int perfectNumber(int n){ // returning total of divisible

         int totalOfDivisible=0;
        for (int i =1;i <n-1; i++) {
            if(n%i==0){
                totalOfDivisible +=i;
            }
        }
        return totalOfDivisible;
    }
}
