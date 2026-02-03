package PST;
import java.util.Scanner;
public class perfectnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       System.out.print("Enter a number: ");
			  int num = sc.nextInt();
              int sum = 0;
              for(int i = 1;i<=num/2;i++) {
            	  if(num%i==0) {
            		  sum= sum+i;
            		  }
              }
            	  if(sum==num) {
            		  System.out.println(  " is an perfect number.");
      	        } else {
      	            System.out.println( " is not an perfect number.");
      	        } 
            	  sc.close();
              }
        

	}