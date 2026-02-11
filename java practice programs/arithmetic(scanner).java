import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        System.out.println("scanner of 2 integers:");
        Scanner scanner = new Scanner(System.in);
         System.out.println("enter num 1");
         int num1 = scanner.nextInt();
         System.out.println("enter num2");
         int num2 = scanner.nextInt();
         
         int sum= num1 + num2 ;
         int difference = num1-num2;
         int product = num1 * num2 ;
         int quotient = num1%num2 ;
         
         System.out.println("sum"+ sum);
         System.out.println("difference"+ difference);
         System.out.println("product"+ product);
         System.out.println("quotient "+ quotient);
         
        

    }
}