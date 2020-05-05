#include <stdio.h>
#include<math.h>

int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  int temp = num,digit=0;
  while(temp != 0)
  {
   digit++;
    temp = temp/10;
  }
  temp = num;
  int sum =0;
    while(temp != 0)
    {
      int rem = temp%10;
      sum = sum + pow(rem,digit);
      temp = temp/10;
    }
  if(sum==num)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}