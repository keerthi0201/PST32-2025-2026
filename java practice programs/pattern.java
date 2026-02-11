package pst;

public class pattern {

	public static void main(String[] args) {
		int length = 10;
		horizontalstar hs = new horizontalstar();
        hs.printpattern(length);
        VerticalStar vs = new VerticalStar();
        vs.printPattern(length);
		
	} 
}
 class horizontalstar{
	public void printpattern(int n) {
		for(int i = 0; i < n;i++) {
			System.out.print("* ");
	}
		System.out.println();
        
    }
}

class VerticalStar {
    public void printPattern(int n) {
       
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}



