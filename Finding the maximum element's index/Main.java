import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    int i;
    for(i=0;i<n;i++)
      arr[i] = s.nextInt();
    int max = arr[0],idx =0;
    for(i=1;i<n;i++)
    {
      if(max < arr[i])
      {
        max = arr[i];
        idx = i;
      }
    }
    System.out.print(idx);
  }
}