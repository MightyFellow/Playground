import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      while(a>10)
      {
       a = a/10;
      }
      System.out.print(a);
	}
}