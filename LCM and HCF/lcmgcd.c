void main()
{
    int x,y,i,g=0;
    printf("Enter 2 number ");
    scanf("%d %d",&x,&y);
    for(i=0;i<=x && i<=y;i++)
    {
        if(x%i==0 && y%i==0)
        {
            g=i;
        }
    }
    printf("Gdc= %d",g);
}
