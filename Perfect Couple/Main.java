import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner s = new Scanner(System.in);
      int n= s.nextInt();
      int arr[] = new int[n];
      int i,j;
      for(i=0;i<n;i++)
        arr[i] = s.nextInt();
      int val = s.nextInt();
      for(i=0;i<n-1;i++)
      {
        int sum=0;
       for(j=i+1;j<n;j++)
        {
         sum = arr[i] + arr[j];
         if(sum == val)
         {
          System.out.println(arr[i]+", "+arr[j]);
           
         }
        }
        
      }
     
    }
}