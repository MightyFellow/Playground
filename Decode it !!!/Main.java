#include<stdio.h>
int main()
{
	//Your Code here!!
  char string[50];
  gets(string);
  int l = strlen(string);
  int key;
  scanf("%d", &key);
  key = key%26;
  char c;
  for(int i=0;i<l;i++)
  {
    c = string[i];
    if(c >= 'A' && c <= 'Z')
    {
      c = c - key;
      if(c < 'A')
        c = c + 'Z' - 'A' + 1;
    }
    else if(c >= 'a' && c <= 'z')
    {
       c = c-key;
      if(c < 'a')
        c = c + 'z' - 'a' + 1;
    }
    string[i] = c;
  }
  printf("%s", string);
  return 0;
}