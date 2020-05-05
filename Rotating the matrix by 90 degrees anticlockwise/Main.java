#include<stdio.h>
int main()
{
	//Try out your code here
  int r,c;
  scanf("%d %d",&r,&c);
  int m[r][c];
  int i,j;
  for(i=0;i<r;i++)
  {
   for(j=0;j<c;j++)
     scanf("%d ",&m[i][j]);
  }
  for(i=r-1;i>=0;i--)
  {
   for(j=0;j<c;j++)
     printf("%d ",m[j][i]);
    printf("\n");
  }
	return 0;
}