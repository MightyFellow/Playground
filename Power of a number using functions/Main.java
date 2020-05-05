import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
   Scanner s = new Scanner(System.in);
   int base = s.nextInt();
   int expo = s.nextInt();
   power(base,expo);
 }
  public static void power(int a,int b)
  {
    int output=1;
    while(b>0)
    {
     output *= a;
      --b;
    }
    System.out.print(output);
  }
}