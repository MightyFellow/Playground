import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      a=a/10;
      int digit = a % 10;
      System.out.println(digit);
	}
}