#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d\n",&n);
  int arr[n];
  for(int i = 0;i<n;i++)
    scanf("%d ",&arr[i]);
  int key1,key2;
  scanf("%d\n%d\n",&key1,&key2);
  int i1=0,i2=0;
  for(int i = 0;i<n;i++)
  {
    if(key1==arr[i])
    {
      i1 = i;
      break;
    }
    else
      i1= -1;
  }
  for(int i = 0;i<n;i++)
  {
    if(key2==arr[i])
    {
      i2= i;
      break;
    }
    else
      i2 = -1;
  }
  printf("%d\n%d",i1,i2);
  return 0;
}
