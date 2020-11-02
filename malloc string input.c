void main(){
    int n;
    char *text;

    printf("Enter the limit of the text: ");
    scanf("%d",&n);

    text=(char*)malloc(n*sizeof(char));

    printf("Enter the text: ");
    scanf(" ");
    gets(text);

    printf("Inputted Text is %s \n",text);

    free(text);
}
