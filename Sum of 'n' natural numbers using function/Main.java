#include<stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int sum = sum_of(n);
  printf("%d",sum);
  	return 0;
}
int sum_of(int n)
{
 return n*(n+1)/2;
}