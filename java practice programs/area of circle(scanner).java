import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle(integer);");
        int radius = scanner.nextInt();
        scanner.close();
        double area = Math.PI * radius* radius ;
        

        System.out.print("area "+ area);
    }
}
