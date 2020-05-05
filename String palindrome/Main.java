#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char string[20];
  gets(string);
  int i,len,flag=0;
  len = strlen(string);
  for(i=0;i<len;i++)
  {
    if(string[i] != string[len-i-1])
    {
    flag =1;
      break;
    }
  }
  if(flag==0)
    printf("%s is a palindrome");
  else
    printf("%s is not a palindrome");
  return 0;
}