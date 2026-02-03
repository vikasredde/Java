import java.lang.*;
import java.util.*;


class Simple_calculator{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("enter operator");
        char c=s.next().charAt(0);

        int result;

        switch (c) {
            case '+':
                result=a+b;
                System.out.println(result);
                break;
            
            case '-':
                result=a-b;
                System.out.println(result);
                break;
            
            case '*':
                result=a*b;
                System.out.println(result);
                break;
            
            case '/':
                if (b==0){
                    System.out.println("Error: Division by zero");
                }
                else{
                result=a/b;
                System.out.println(result);
                break;}

        }

        
    }

}
