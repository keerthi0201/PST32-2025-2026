package pst;

public class integertostring {

	public static void main(String[] args) {
		int num = 1234;
		String s ="";
		if(num == 0) {
			s ="0";
		}
		while(num>0){
			int digit = num % 10 ; 
			s = (char)(digit + '0')+s;
			num = num /10;
		}
		System.out.println(s);

	}

}
