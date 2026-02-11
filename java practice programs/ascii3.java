package pst;

public class ascii3 {

	public static void main(String[] args) {
		Asciivalue1 obj = new Asciivalue1();  
        obj.printsmallAToZ();                    
    }

	}
class Asciivalue1
{
    public void printsmallAToZ()
    {
        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            System.out.println(ch + " = " + (int) ch);
        }
    }
}

