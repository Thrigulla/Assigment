package Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=r.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact= fact*i;
        }
        System.out.println("Factorial of given number is "+fact);
    }
}

