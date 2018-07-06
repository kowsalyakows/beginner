#include <stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
    if(n%2==0&&n>0)
      printf("even");
  else if(n<0)
 
    printf("Invalid");
  else
    printf("odd");

    return 0;
}
