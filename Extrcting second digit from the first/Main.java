#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  while(num >=100)
  {
    num = num /10;
  }
  int digit = num%10;
  printf("%d",digit);
	return 0;
}