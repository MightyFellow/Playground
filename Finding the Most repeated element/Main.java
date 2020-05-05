#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
 printf("%d",most_repeated_ele(n,arr));
  return 0;
}
int most_repeated_ele(int n,int arr[])
{
  int i,curr_count = 1,max_count=0,j;
  int freq[n];
  for(i=0;i<n;i++)
  {
   for(j=i+1;j<n;j++)
   {
     if(arr[i] == arr[j])
       curr_count++;
   }
    freq[i] = curr_count;
    curr_count = 1;
  }
for(i=0;i<n;i++)
{
  if(freq[i]>freq[max_count])
    max_count = i;
}
return arr[max_count];  
  
}