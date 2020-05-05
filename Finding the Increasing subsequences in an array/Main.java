#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d", &n);
  int arr[n];
  for(int i =0;i<n;i++)
    scanf("%d", (arr+i));
  subsequence(n,arr);
	return 0;
}
void subsequence(int n,int arr[])
{
   int i,j;
  for(i=0;i<n;i++)
  {
    int key = arr[i];
    for(j=i+1;j<n;j++)
    {
       if(arr[j]>key)
         printf("%d,%d\n",key,arr[j]);
    }
    
  }
     
}