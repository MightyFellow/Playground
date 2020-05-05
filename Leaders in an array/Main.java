#include <stdio.h>
int main() 
{
    //write your code here
  int n;
  scanf("%d", &n);
  int arr[n];
  int i,j;
  for(i=0;i<n;i++)
    scanf("%d", (arr + i));
  for(i=0;i<n;i++)
  {
    int flag=1;
   for(j=i+1;j<n;j++)
   { 
    if(arr[i]<arr[j])
    {
     flag=0;
      break;
    }
   }
    if(flag==1)
      printf("%d ",arr[i]);
  }
    return 0;
}