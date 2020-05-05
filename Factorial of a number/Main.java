#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  int fact = 1;
  for(int i =1;i<=num;i++)
    fact = fact * i;
  printf("%d",fact);
	return 0;
}