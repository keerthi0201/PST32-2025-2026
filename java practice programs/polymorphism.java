package PST;

public class polymorphism {

	public static void main(String[] args) {
		int a = 30; 
		int b = 20;
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		
	}
	public static int  add(int c , int d )
	{
		return c+d;
	}
	public static int   sub(int e , int d) 
	{
		return e-d ; 
    }
	
	public static int mul(int f , int i )
	{
		return f*i ;      	
    }
	public static int div(int j , int k )
	{
		return j/k ;      	
    }
	
}