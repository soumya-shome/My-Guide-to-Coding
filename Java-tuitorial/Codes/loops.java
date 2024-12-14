class loops
{
    public static void main(){
        System.out.println("for loop");
        int i;
        for(i=11;i<=10;i++)
        {
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("while loop");
        i=11;
        while(i<=10)
        {
            System.out.print(i+",");
            i++;
        }
        System.out.println();
        System.out.println("do while loop");
        i=11;
        do{
            System.out.print(i+",");
            i++;
        }while(i<=10);
    }
}