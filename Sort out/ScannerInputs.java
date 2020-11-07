import java.util.*;
class ScannerInputs
{
    public static void meth()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char c=sc.next().charAt(0);
        System.out.println("Enter a word");
        String s1=sc.next();
        System.out.println("Enter a Integer");
        int a=sc.nextInt();
        System.out.println("Enter a Double");
        double b=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter a Sentence");
        String s2=sc.nextLine();
        
        System.out.println("Character= "+c);
        System.out.println("Word= "+s1);
        System.out.println("Sentence= "+s2);
        System.out.println("Intger= "+a);
        System.out.println("Double= "+b);
    }
}