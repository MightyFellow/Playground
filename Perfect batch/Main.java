/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i = 0;i<n;i++)
    scanf("%d ",&arr[i]);
  perfect_batch(n,arr);
  return 0;
}
void perfect_batch(int n,int arr[])
{
  int batch1=0,batch2=0;
  for(int i = 0;i<n/2;i++)
    batch1 = batch1+ arr[i];
  for(int i = n/2;i<n;i++)
    batch2 = batch2 + arr[i]; 
  if(batch1==batch2)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
}