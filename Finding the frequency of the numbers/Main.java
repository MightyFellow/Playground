#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int k;
  scanf("%d\n",&k);
  int arr[n];
  for(int i = 0;i<n;i++)
    scanf("%d ",(arr+i));
  int freq[k];
  for(int j = 0;j<k;j++)
    freq[j] = 0;
  for(int idx = 0;idx<n;idx++)
    freq[arr[idx]-1]++;
  for(int idx =0;idx<k;idx++)
    printf("%d %d\n",idx+1,freq[idx]);
  return 0;
}