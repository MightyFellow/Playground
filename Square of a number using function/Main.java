#include<stdio.h>
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  int square = square_of(n);
  printf("%d",square);
   return 0;
}
int square_of(int n)
{
 return n*n;
}