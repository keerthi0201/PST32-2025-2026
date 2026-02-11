package pst;

import java.util.Scanner;

public class Character
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE ASCII VALUE:");
        int n = sc.nextInt();
        ascii1 obj = new ascii1();  
        obj.med1(n);              
    }
}

class ascii1
{
    public void med1(int n)   
    {
        char ch = (char) n;   
        System.out.println(ch);
    }
}
