#include <stdio.h>
int main() {
	//Type your code here
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int res = gcd_three(n1,n2);
  int final = gcd_three(res,n3);
  printf("%d",final);
	return 0;
}
int gcd_three(int a,int b)
{
  int min ,gcd=0;
  if(a>b)
    min = a;
  else
    min = b;
  while(min >=1)
  {
    if(a%min==0 && b%min==0)
    {
      gcd = min;
      break;
    }
    else
      min--;
  }
  return gcd;
}