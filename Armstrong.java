package Practice;

import java.util.Scanner;
import java.util.SortedMap;

public class Armstrong {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=r.nextInt();
        int sum=0;
        int number=num;
        int temp=num;
        int count=0;
        while(number>0){
            number/=10;
            count++;
        }
        while (num>0){
            int j=num%10;
            sum=(int)(sum+(Math.pow(j,count)));
            num=num/10;

        }
        if(sum==temp){
            System.out.println("Its an armstrong number");
        }
        else {
            System.out.println("It is not an armstrong number");
        }
    }
}