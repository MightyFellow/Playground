#include <stdio.h>

int main(int argc, char *argv[])
{
  //Type your code here
  int n;
  scanf("%d ",&n);
  int sum = sum_of_numbers(n);
  printf("%d",sum);
  return 0;
}
int sum_of_numbers(int n)
{
   int sum=0;
  if(n==1)
    return 1;
  else
    return n + sum_of_numbers(n-1);
}