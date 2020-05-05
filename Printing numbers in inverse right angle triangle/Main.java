#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  
  for(int i = 1;i<=n;i++)
  {
    int start = n-i+1;
    for(int j=1;j<=n-i+1;j++)
    {
      printf("%d",start);
      start--;
    }
    printf("\n");
  }
	return 0;
}