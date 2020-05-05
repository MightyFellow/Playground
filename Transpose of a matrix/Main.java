#include<stdio.h>
int main()
{
  //Type your code here
  int row,column;
  scanf("%d %d\n",&row,&column);
  int matrix[row][column];
  int transpose[column][row],i,j;
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
     scanf("%d ",&matrix[i][j]);
  }
  for(i=0;i<row;i++)
  {
   for(j=0;j<column;j++)
   {
      transpose[j][i] = matrix[i][j];
   }
  }
  for(i=0;i<column;i++)
  {
     for(j=0;j<row;j++)
        printf("%d ",transpose[i][j]);
    printf("\n");
   }
  return 0;
}