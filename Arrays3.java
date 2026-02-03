public class Arrays3 {
    public static void main(String[] args) {
        
        int[] salaries = {25000, 30000, 18000, 40000, 32000};
        int max_salary=salaries[0];
        int min_salary=salaries[0];

        for (int nums : salaries){

            if(nums>max_salary){
                max_salary=nums;
            }
            if(nums<min_salary)
                min_salary=nums;
            }

            System.out.println("max and min salary in store is : " +max_salary + ' '+  min_salary );
        

        }

    }
    

