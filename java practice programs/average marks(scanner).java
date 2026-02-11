import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("enter mark 1");
		int mark1 = scanner.nextInt();
		System.out.println("enter mark 2");
		int mark2 = scanner.nextInt();
		System.out.println("enter mark 3");
		int mark3 = scanner.nextInt();
		int totalmark= mark1 + mark2+mark3;
		double average = (double)totalmark/3;
		System.out.println("enter the totalmark"+totalmark);
		System.out.println("enter te average"+average);
		scanner.close();
		
	}
}
