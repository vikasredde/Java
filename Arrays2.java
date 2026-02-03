public class Arrays2 {
    public static void main(String[] args) {
        
        int[] prices = {1200, 500, 3000, 450,9000,4000};
        int count=0;

        for(int nums: prices){
            if (nums>1000){
                count=count+1;
            }
        }
        System.out.println("number of items that cost more than 1000 rs price are" + count );
    }
    
}
