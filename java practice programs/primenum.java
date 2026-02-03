package PST;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int num= Sc.nextInt();
		if(num<=1){
			System.out.println("not prime");
             return;
		}
				 for(int i=2;i*i<=num;i++) {
					if(num % i==0) {
						System.out.println("not prime");
						return;
					}
					 
				 }
				 System.out.println("prime");
				 Sc.close();
			}
			


	}
