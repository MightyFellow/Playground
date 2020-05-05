#include<stdio.h>
int main()
{
	//Try out your code here
  int n;
  scanf("%d", &n);
  int num = factorial(n);
  printf("%d ",num);
	return 0;
}
int factorial(int n)
{
   if(n==1)
     return 1;
  else
    return n*factorial(n-1);
}