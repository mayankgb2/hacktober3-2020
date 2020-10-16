#include<stdio.h>
void main()
{
    int n,a=0,b=1,d,c;
    printf("enter the number of terms\n");
    scanf("%d" ,&n);
    for(c=0;c<n;c++)
    {
        if (c<=1)
        d=c;
    else
    {
       d=a+b;
       a=b;
       b=d; 
    }    
    printf("%d",d);
    }
}
