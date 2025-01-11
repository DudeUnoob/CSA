public class main {
    
    public static void main(String[] args) {
        
        
        int num = 1; 
        int count = 0; 
        while (num <= 10)
        { 
            if(num % 2 == 0 && num % 3 == 0)
            { 
            count++; 
            } 
        num++; 
        }

        System.out.println(count);
    }
       
}

//1, 2, 3