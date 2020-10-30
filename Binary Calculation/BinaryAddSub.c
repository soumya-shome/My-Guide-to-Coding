int binAddition(int a,int b)
{
      int c;
      while (b != 0) {
              c = (a & b) << 1;
              a=a^b;
              b=c;
      }
      return a;
}
int binSubtracton(int a, int b)
{
      int carry;
      b = binAddition(~b, 1);
      while (b != 0) {
              carry = (a & b) << 1;
              a = a ^ b;
              b = carry;
      }
      return a;
}
void main()
{
    int n1,n2, binAdd;
    printf("Input first integer value: ");
    scanf("%d",&n1);
    printf("Input second integer value: ");
    scanf("%d",&n2);
    int c;
    while (n2 != 0) {
    c = (n1 & n2) << 1;
    n1=n1^n2;
    n2=c;
    }
    binAdd=n1;
    printf("Binary Addition: %d\n",binAdd);
}