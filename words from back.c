main()
{
    char a[100],b[50];
    int i,j,e=0,l;
    printf("Enter a sentence ");
    gets(a);
    l=strlen(a);
    a[l]=' ';
    l++;
    a[l]='\0';
    for(i=l-1;i>=-1;i--)
    {
        if(a[i]!=' ' && i!=-1)
        {
            b[e]=a[i];
            e++;
        }
        else
        {
            for(j=e-1;j>=0;j--)
            {
                printf("%c",b[j]);
            }
            printf(" ");
            for(j=0;j<=0;j++)
            {
                b[j]='\0';
            }
            e=0;
        }
    }
}
