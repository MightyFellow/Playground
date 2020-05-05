#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  int temp = num,sum=0;
  while(temp != 0)
  {
    int rem = temp %10;
    int fact = 1;
    for(int i = 1;i<=rem;i++)
    {
      fact = fact*i;
    }
    sum = sum + fact;
     temp = temp/10;
      
    
  }
  if(sum == num)
    printf("Yes");
  else
    printf("No");
return 0;
}