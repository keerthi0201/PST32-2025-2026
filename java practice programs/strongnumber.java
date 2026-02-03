package PST;
import java.util.Scanner;
public class strongnumber {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
		  int num = sc.nextInt();
	        int originalNum = num;
	        int sum = 0;
	        while(num>0){
	        	int digit = num % 10;
	        	int fact = 1;
	        	
	        for(int i = 1;i<= digit;i++){
	        	fact=fact* 1;
	        	sum= sum+fact;
	        	num=num/10;
	        }
	        if (sum == originalNum) {
	            System.out.println(originalNum + " is an strong number.");
	        } else {
	            System.out.println(originalNum + " is not an strong number.");
	        }
	        
	        sc.close(); 
	        }   

	}

}
