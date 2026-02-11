 public class Main
{
	public static void main(String[] args) {
	    int[] numbers={12,87,40,24,51};
	    System.out.println("Even Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
