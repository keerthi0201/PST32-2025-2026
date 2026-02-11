package pst;

public class asciivalues2 {

	public static void main(String[] args) {
		Asciivalue obj = new Asciivalue();  
        obj.printAToZ();                    
    }

	}
class Asciivalue
{
    public void printAToZ()
    {
        for(char ch = 'A'; ch <= 'Z'; ch++)
        {
            System.out.println(ch + " = " + (int) ch);
        }
    }
}
