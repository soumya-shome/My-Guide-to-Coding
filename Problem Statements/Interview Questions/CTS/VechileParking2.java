/*

Input: <License number>:<Name>:<Vechile Type>:<Parking hours>

Conditions for license number:
    1.Must be of 15 characters
    2.First 2 character must be alphabets in upper case
    3.Next 2 characters must be numbers
    4.Next 4 character represent vechile registration year, must be between 1900 to 2021
    5.Next 7 character must be digits

Condition for Parking:
    1.If vechile is a fourwheeler , park in area 'B' ,with Rs.30 per hr charge
    2.If vechile is a twowheeler , park in area 'A' ,with Rs.10 per hr charge

Print error message accordingly
 Example: 
    Input - WB1220161243567:Rajesh:Fourwheeler:4
    Output - Park in B : Fare - 120.0
*/
import java.util.*;
public class VechileParking2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
        String s1=sc.nextLine();
        String[] s=s1.split(":");
        String lno=s[0];
        String ctype=s[2];
        int hrs=Integer.parseInt(s[3]);
        if(lno.length()<=15){
            boolean c1=Character.isUpperCase(lno.charAt(0));
            boolean c2=Character.isUpperCase(lno.charAt(1));
            boolean c3=Character.isDigit(lno.charAt(2));
            boolean c4=Character.isDigit(lno.charAt(3));
            int year=Integer.parseInt(lno.substring(4, 8));
            boolean flag=true;
            int re=0;
            try{
                re=Integer.parseInt(lno.substring(8));
            }catch(Exception e){
                flag=false;
            }
            double price=0.0;
            if(lno.matches("[A-Z]{2}(.*)")){
                if(lno.matches("[A-Z]{2}[0-9]{2}(.*)")){
                    if(year>=1900 && year<=2021){
                        if(flag){
                            if(ctype.equalsIgnoreCase("fourwheeler")){
                                price=hrs*30;
                                System.out.println("Park in B : Fare - "+price);
                            }
                            else if(ctype.equalsIgnoreCase("twowheeler")){
                                price=hrs*10;
                                System.out.println("Park in A : Fare - "+price);
                            }
                            else{
                                System.out.println("Wrong car type");
                            }
                        }
                        else
                            System.out.println("Last 7 digits must be numbers");
                    }
                    else
                        System.out.println("Not a valid car Year");
                }
                else
                    System.out.println(lno.substring(2, 4)+" must be digits");
            }
            else
                System.out.println(lno.substring(0,2)+" must be in uppercase");
        }
        sc.close();
    }
}