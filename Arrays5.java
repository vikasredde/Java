import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        
        int[] phones = {123, 456, 123, 789, 456};
        

        for (int i=0;i<phones.length;i++){
            for (int j=i+1;j<phones.length;j++){
                if(phones[i]==phones[j]){
                    System.out.println(phones[i]);
                    break;
                }
            }
        }
        
    
    
    
    
    
    
    }
    
}
