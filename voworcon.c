#include <stdio.h>

int main()
{
    char c;
    fflush(stdin);
    scanf("%c",&c);
    if((c>=65&&c<=92)||(c>=97&&c<=122))
    {
      if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='U')
     printf("vowel");
     else
     printf("consonent");
    }
    else
    {
    printf("invalid");
    }

    return 0;
}
