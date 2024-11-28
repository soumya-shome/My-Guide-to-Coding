import java.util.Scanner;
public class NumberTypeUtility implements NumberType
{
   public static NumberType isOdd(){
       NumberType num=(n)->{
           if(n%2!=0) 
           return true;
           else
           return false;
       };
       return num;
   }
  public static void main (String[] args) {
      NumberTypeUtility obj=new NumberTypeUtility();
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        obj.isOdd();
      if(obj.checkNumberType(n))
      System.out.println(n+" is odd");
      else
      System.out.println(n+" is not odd");
   }
   public boolean checkNumberType(int n){
       if(n%2!=0) return true;
       else
       return false;
   }
}