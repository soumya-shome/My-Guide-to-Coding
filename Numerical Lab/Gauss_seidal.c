#include <stdio.h>
#include<stdlib.h>
#include<math.h>
void main()
{
    int i,j,k,n;
    float a[20][20],x[20],s;
    printf("\n Enter the order of the matrix: ");
    scanf("%d",&n);
    printf("\n Enter the elements :");
    for(i=1;i<=n;i++){
        for(j=1;j<=n+1;j++)
            scanf("%f",&a[i][j]);
    }
    printf("Enter the initial approximation: \n");
    for (i=1;i<=n;i++)
        scanf("%f",&x[i]);
    for(k=1;k<=15;k++){
        for(i=1;i<=n;i++){
            s=a[i][n+1];
            for(j=1;j<=n;j++){
                if(j!=i)
                    s=s-(a[i][j]*x[j]);
            }
            x[i]=s/a[i][i];
        }
    }
    printf("\n\nThe Required Solution is  : ");
    for(i=1;i<=n;i++)
        printf("x[%d]=%6.4f\n",i,x[i]);
}