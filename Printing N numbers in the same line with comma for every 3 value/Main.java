#include <stdio.h>
int main() {
	//Type your code
  int n;
  int m = 3;
  scanf("%d",&n);
  for(int i = 1;i <= n;i++)
  {
    printf("%d",i);
    if((i % m == 0) && (m !=n))
      printf(",");
  }
	return 0;
}