package pst;

public class stringtointeger {

	public static void main(String[] args) {
		String s = "1234";
		int num = Integer.parseInt(s);
		System.out.println("interger:"+s);
		stringtointeger2 obj = new stringtointeger2();
		obj.med1();
	}

}
class stringtointeger2 {
	public static void med1(){
	String s = "1234";
	int num = 0;
	for(int i = 0; i < s.length();i++) {
		char ch = s.charAt(i);
		int digit = ch - '0';
		num = num * 10+ digit;
		System.out.println("integer:"+ num);
		}
	}
}
