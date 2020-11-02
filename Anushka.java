import java.util.*;
class Anushka
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER CURRENT DATE:");
        String a= sc.nextLine();  
        cap y=new cap();
        y.wish();
        y.otherwish();
    }
}
class cap
{
    void wish()
    {
        System.out.println("HHHH     HHHH       AA         PPPPPPPPPPP  PPPPPPPPPPP    YY         YY       ");
        System.out.println("HHHH     HHHH      AAAA        PP       PP  PP       PP     YY       YY           ");      
        System.out.println("HHHH     HHHH     AA  AA       PP       PP  PP       PP      YY     YY          ");
        System.out.println("HHHHHHHHHHHHH    AA    AA      PPPPPPPPPPP  PPPPPPPPPPP       YYYYYYY          ");
        System.out.println("HHHH     HHHH   AAAAAAAAAA     PP           PP                    YY             ");
        System.out.println("HHHH     HHHH  AA        AA    PP           PP                   YY              ");
        System.out.println("HHHH     HHHH AA          AA   PP           PP                  YY              ");

        System.out.println("\n");

        System.out.println("BBBBBBBBBBB  IIIIIIIIIIIII RRRRRRRRRRRR  TTTTTTTTTTTTTT HHHH       HHHH  DDDDDDDDDDD        AA   YY          YY ");
        System.out.println("BB        BB      II       RR        RR        TT       HHHH       HHHH  DD         D      AAAA   YY        YY ");      
        System.out.println("BB        BB      II       RR       RR         TT       HHHH       HHHH  DD          D    AA  AA   YY      YY ");
        System.out.println("BBBBBBBBBB        II       RRRRRRRRRRR         TT       HHHHHHHHHHHHHHH  DD          D   AA    AA   YYYYYYYY ");
        System.out.println("BB        BB      II       RR       RR         TT       HHHH       HHHH  DD          D  AAAAAAAAAA       YY ");
        System.out.println("BB        BB      II       RR        RR        TT       HHHH       HHHH  DD         D  AA        AA     YY  ");
        System.out.println("BBBBBBBBBBB  IIIIIIIIIIIII RR         RR       TT       HHHH       HHHH  DDDDDDDDDDD  AA          AA   YY ");

        System.out.println("\n");

        System.out.println("      A A           NN        NN      UU        UU      SSSSSSSSSS      HH       HH     KK      KK         A A               ");                          
        System.out.println("     AA AA          NN NN     NN      UU        UU      SS              HH       HH     KK    KK          AA AA            ");                    
        System.out.println("    AA   AA         NN  NN    NN      UU        UU      SS              HH       HH     KK  KK           AA   AA  "  );                    
        System.out.println("   AAAAAAAAA        NN   NN   NN      UU        UU      SSSSSSSSSS      HHHHHHHHHHH     KK K            AAAAAAAAA            ");                      
        System.out.println("  AA       AA       NN    NN  NN      UU        UU              SS      HH       HH     KK  KK         AA       AA         "  );
        System.out.println(" AA         AA      NN     NN NN      UU        UU              SS      HH       HH     KK    KK      AA         AA          ");                      
        System.out.println("AA           AA     NN      NNNN      UUUUUUUUUUUU      SSSSSSSSSS      HH       HH     KK      KK   AA           AA       "  );

        System.out.println("\n");

        System.out.println("                         ~~");
        System.out.println("                         ||");
        System.out.println("                         ||");
        System.out.println("                 ~~~~~~~~~~~~~~~~~   ");                                                                
        System.out.println("                |                 |");
        System.out.println("                |                 |");
        System.out.println("            ____|                 |___");
        System.out.println("           |     `````````````````    |");
        System.out.println("           |     HAPPY BIRTH DAY      |");
        System.out.println("     ______|                          |_____   ");
        System.out.println("     |      ```````````````````````````     | ");
        System.out.println("     |             08/AUG/2020              | ");
        System.out.println("     |______________________________________|    ");      
    }

    void otherwish(){
        Scanner sc=new Scanner(System.in);
        String c="";
        int a=0;
        while(a==0){ 
            System.out.println("Enter Initial of Friends to See wishes");
            System.out.println("AA-Aakash\nPK-Anik\nDK-Debarghyya\nK-Rahul\nRR-Rickraj\nRO-Rodosi\nAN-Ankita\nAY-Ayusmita\nBC-Barnojit\nA-Akash\nE-To Exit");
            c=sc.nextLine();
            c=c.toUpperCase();
            switch(c){
                case "AA":
                    System.out.println("Enter Here");
                break;
                
                case "PK":
                
                break;
                
                case "E":
                    System.out.println("Have a Nice Day !!");
                    a=1;
                break;
                
                default:
                    System.out.println("Try Again");
            }
            
        }
    }
}