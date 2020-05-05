#include<stdio.h>
int main()
{
	//Try out your code here
  int r,c;
  scanf("%d\n%d\n",&r,&c);
  int m[r][c];
  int i,j;
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
     scanf("%d ",&m[i][j]);
  }
upper_matrix(r,c,m);
	return 0;
}
void upper_matrix(int r,int c,int m[r][c])
{
 int i,j,k;
  for(k=0;k<c;k++)
  {
   for(i=0,j=k;j<c;i++,j++)
     printf("%d ",m[i][j]);
  }
}