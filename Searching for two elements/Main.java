import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      int i,ele1,ele2,idx1 =-1,idx2=-1;
      for(i=0;i<n;i++)
        arr[i] = s.nextInt();
      ele1 = s.nextInt();
      ele2 = s.nextInt();
      for(i=0;i<n;i++)
      {
        if(ele1 == arr[i])
          idx1 = i;
        else if(ele2 == arr[i])
          idx2 = i;
      }
      System.out.println(idx1);
      System.out.print(idx2);
    }
}