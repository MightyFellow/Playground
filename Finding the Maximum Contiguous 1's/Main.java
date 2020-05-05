#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  int freq[n];
  int idx = most_frequent_element(arr,n,freq);
  int max = max_element(freq,n,idx);
  printf("%d",max);
  return 0;
}
int max_element(int freq[],int n,int idx)
{
  int max = 0;
  if(freq[0] > freq[1] || idx == 0)
    max = freq[0];
  else
    max = freq[1];
  for(int i=2;i<idx;i++)
  {
   if(freq[i]>max)
     max = freq[i];
  }
  return max;
}
int most_frequent_element(int arr[],int n,int freq[])
{
 int count = 0;
  int i,freq_idx =0;
  for(i=0;i<n;i++)
  {
    if(arr[i] == 1)
      count++;
    if(arr[i] == 0 || i==n-1)
    {
      freq[freq_idx] = count;
      count = 0;
      freq_idx++;
    }
  }
  return freq_idx;
}