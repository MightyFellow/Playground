#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  int ld=0,fd=0,sum=0;
  ld = num %10;
  while(num >=10)
  {
    num = num/10;
   }
  fd = num;
  sum = fd +ld;
  printf("%d",sum);
	return 0;
}