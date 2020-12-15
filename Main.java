import java.util.*;
class Main 
{ 
  
    public static void main (String[] args)  
    { 
    Scanner zoho = new Scanner(System.in);
    int num=1,num1=1;
        int n = zoho.nextInt(); 
         for (int i = 0; i < n+1; i++)  
        { 

            for (int j = (n+1) - 1; j > i; j--)  
            { 
                System.out.print(" "); 
            } 
      

            for (int k = 1; k <= num; k++)  
            { 
                System.out.print(Math.abs(k - num1)); 
            } 
      
            num += 2; 
            num1++; 
            System.out.println(); 
        } 
       
    } 
} 
