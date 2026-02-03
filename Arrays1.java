import java.util.*;
import java.lang.*;

public class Arrays1 {
    public static void main(String[] args) {
        // System.out.println("Enter the Marks of a student");
        int[] marks= new int[6];
        Scanner s=new Scanner(System.in);
        for (int i=0;i<marks.length;i++){
            marks[i]=s.nextInt();

        }
        

        int sum=0;
        int avg=0;
        int len=marks.length;
        for(int nums:marks){
            sum=sum+nums;
        }
        avg=sum/len;
        System.out.println("total marks of an student  is : " + sum + "average of an student is : " + avg );
    }
}
