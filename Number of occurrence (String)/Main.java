#include<stdio.h>
#include<string.h>
void to_uppercase(char s[])
{
  int i = 0;
  while(s[i] != '\0')
  {
    if(s[i] >= 'a' && s[i] <= 'z')
      s[i] -=32;
    i++;
  }

}
int main()
{
  //Type your code here
  char str[50],sub[50];
  gets(str);
  to_uppercase(str);
  gets(sub);
  to_uppercase(sub);
  int count = number_of_occurrences(str,sub);
  printf("%d",count);
  return 0;
}
int number_of_occurrences(char str[],char  sub[])
{
 int l1 = strlen(str);
  int l2 = strlen(sub);
  int i ,j,count = 0,found;
  for(i=0;i<=l1-l2;i++)
  {
    found = 1;
    for(j = 0;j<l2;j++)
    {
      if(str[i+j] != sub[j])
      {
       found = 0;
        break;
      }
    }
    if(found == 1)
      count++;
  }
  return count;
}