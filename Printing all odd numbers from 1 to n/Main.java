#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  for(int i = 1;i <= num; i++)
  {
    if(i % 2 == 1)
    {
      printf("%d\n",i);
      i = i + 1;
    }
  }
	return 0;
}