// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i = 0;i<n;i++)
    scanf("%d ",&arr[i]);
  max_element(n,arr);
   return 0;
}
void max_element(int n,int arr[])
{
  int max = arr[0];
  for(int i = 0;i<n;i++)
  {
     if(max < arr[i])
       max = i;
  }
  printf("%d",max);
}