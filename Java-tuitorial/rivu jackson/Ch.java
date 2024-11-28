import java.util.*;
class Ch
{
    public static void main()
    {
        char a='6';
        System.out.println("Character= "+a);
        System.out.println("Is Letter or Digit ? "+Character.isLetterOrDigit(a));
        System.out.println("Is Letter ? "+Character.isLetter(a));
        System.out.println("Is Digit ? "+Character.isDigit(a));
        System.out.println("Is Lower Case ? "+Character.isLowerCase(a));
        System.out.println("Is Upper Case ? "+Character.isUpperCase(a));
        System.out.println("Is Whitespace ? "+Character.isWhitespace(a));
        
        char b='E';
        System.out.println("Character= "+b);
        System.out.println("Is Letter or Digit ? "+Character.isLetterOrDigit(b));
        System.out.println("Is Letter ? "+Character.isLetter(b));
        System.out.println("To Lower Case ? "+Character.toLowerCase(b));
        System.out.println("To Upper Case ? "+Character.toUpperCase(b));
System.out.println("CABLE".compareTo("CADET"));
    }
}