#include <stdio.h>
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int res = greatest_of_three(n1,n2);
  int num = greatest_of_three(res,n3);
  printf("%d",num);
  	return 0;
}
int greatest_of_three(int a,int b)
{
  int greatest = 0;
  if(a>b)
    greatest = a;
  else
    greatest = b;
  return greatest;
}