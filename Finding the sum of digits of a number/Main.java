#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  int sum = 0;
  while(num > 0)
  {
  int r = num % 10;
    sum = sum + r;
    num = num/10;
  }
  printf("%d",sum);
	return 0;
}