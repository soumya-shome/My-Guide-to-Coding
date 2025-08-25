#include <stdio.h>

int search(int [],int,int);
int main(void)
{

    int n,i,a[100],e,res;
    printf("Enter the number of Elements : ");
    scanf("%d",&n);
    printf("Enter Elements of Array in Ascending order : ");
    for(i=0;i<n;++i)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter element to search : ");
    scanf("%d",&e);
    
    res=search(a,n,e);
    
    if(res!=-1)
        printf("Element found at position %d",res+1);
    else
        printf("Element is not found!"); 
    return 0;
}
 
int search(int a[],int n,int e)
{
    int f,l,m;
    f=0;
    l=n-1;
    
    while(f<=l)
    {
        m=(f+l)/2;
        if(e==a[m])
            return(m);
        else
            if(e>a[m])
                f=m+1;
            else
                l=m-1;
    }
    
    return -1;
}