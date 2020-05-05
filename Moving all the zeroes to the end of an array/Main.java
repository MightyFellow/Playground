import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      int i,zeros=0;
      for(i=0;i<n;i++)
        arr[i] = s.nextInt();
      for(i=0;i<n;i++)
      {
       if(arr[i]!=0)
         System.out.print(arr[i]+" ");
        else
          zeros++;
    }
      for(i=0;i<zeros;i++)
        System.out.print(0+" ");
}
}