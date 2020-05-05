#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
   scanf("%d ",(arr+i));
  }
  sum_subsequence(n,arr);
  return 0;
}
void sum_subsequence(int n,int arr[])
{
  int running_sum = arr[0];
  int max_sub_sum = arr[0];
  for(int i = 1;i<n;i++)
  {
    if(arr[i] > arr[i-1])
      running_sum += arr[i];
    else
      running_sum = arr[i];
    
}
  if(running_sum > max_sub_sum)
    {
      max_sub_sum = running_sum;
    printf("%d",max_sub_sum);
  }
}