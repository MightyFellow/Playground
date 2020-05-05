import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      int i,max;
      for(i=0;i<n;i++)
        arr[i] = s.nextInt();
      max = arr[0];
      for(i=1;i<n;i++)
      {
        if(max < arr[i])
          max = arr[i];
      }
      System.out.print(max);
    }
}