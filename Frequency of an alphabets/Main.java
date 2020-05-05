// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include <string.h>

// Main function
int main()
{
  // Enter your code here 
  char str[20],count[26] = {0};
  int i = 0,j=0;
  scanf("%[^\n]s", str);
  
  while(str[i] != '\0')
  {
   if(str[i] >= 'a' && str[i]<='z')
   {
     j = str[i] - 'a';
     count[j]++;
   }
  i++;
  }
  
  for(i=0;i<26;i++)
  {
   if(count[i] != 0)
   {
     printf("%c%d ",i+'a',count[i]);
     count[i] = 0;
   }
  }
  
   return 0;
}