import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      int sum=0,rem;
      rem = num % 10;
      while(num>10)
      {
         num = num/10;
      }
      sum = rem+num;
      System.out.println(sum);
	}
}