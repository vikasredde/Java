public class Arrays4 {
    public static void main(String[] args) {
        
        int[] sales = {200, 450, 300, 500, 150, 400, 350};

        int sum=0;
        int max_sal=sales[0];
        int max_day=0;

        // for (int nums: sales){
        //     sum=sum+nums;
        //     if (nums>max_sal){
        //         max_sal=nums;
        //     }
        // }

        for (int i=0; i<sales.length;i++){
            sum=sum+sales[i];
            if(sales[i]>max_sal){
                max_sal=sales[i];
                max_day=i;
            }
        }


        System.out.println("total week sales are " + sum);
         System.out.println("highest sales in day of a week is " + max_day);

        
    }
    
}
