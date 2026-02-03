package PST;
import java.util.Scanner;
public class countofdigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int Count =0;
		if(num==0) { 
			Count=1;
		}
		else {
			while(num !=0) {
				Count++;
				num=num/10;
			}
		}
		
		System.out.println("Count :"+Count);
		sc.close();
	}

}
