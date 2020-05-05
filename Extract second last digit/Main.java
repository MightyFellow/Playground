#include<stdio.h>
int main()
{
  //Type your code here
  int num,digit;
  scanf("%d",&num);
  digit = num/10;
  digit=digit%10;
  printf("%d",digit);
  return 0;
}