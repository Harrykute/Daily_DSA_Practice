package Panchal_Sir_Code;

import java.sql.SQLOutput;
import java.util.Scanner;

/*3. Perfect Square:
        • Input: 25
        • Output: Yes (5 is the square root of 25)*/
public class PerfectSquare {
    public static void main(String[] args) {

        System.out.println("Enter the Number to get Perfect Squre Of Number");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int square=perfectSquare(number);
        System.out.println("Perfect Squre Of "+number+" is "+square);
    }
    public static int perfectSquare(int n){ //this fuction returning perfect Square

        for (int i=1;i<n;i++) {
            if((i*i)==n){
                return i;
            }
        }
        return -1;
    }
}
