import java.lang.*;
import java.util.*;


class palindrome{
    public static void main(String args[]){
        int num=15;
        int original=num;
        int reverse=0;
        while (num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(reverse==original){
            System.out.print("it is palindrome");

        }
        else{
            System.out.print("Not an palindrome");
        }
    }}
    