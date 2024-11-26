import java.util.*;
public class selectiveRepeat {
    static  String decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[2];

        // counter for binary array
        int i = 0;
        while (n > 0) {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        int b[] = new int[2];

        b[0]=binaryNum[1];
        b[1] = binaryNum[0];

         return  Arrays.toString(b);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the packet:");

        String s = scan.nextLine();
        String temp = "";

         // reverse of string
        for (int i = s.length() - 1; i >= 0; i--) {
            temp = temp + s.charAt(i);
        }

        char a[] = temp.toCharArray();
        String st[] = new String[2];
        String str[] = new String[2];


        int j = 0;
        int m=0;

        int n=0 ;
        Random randomGenerator=new Random();
        for (int w = 0; w < 5; w++) {
            n= randomGenerator.nextInt(5);

        }
        System.out.println(n);

        for (int i = 0; i < temp.length(); i++)
        {
            st[0] = "0";
            if (i<3) {
                st[1] = decToBinary(i);
            } else {
                j = i % 4;
            st[1] = decToBinary(j);
            }
            System.out.println();
            System.out.println("  Frame No. || User data || seq.No  ");
            System.out.print("   "+i+"            " +a[m]+" "+a[m+1]);
            for (int k = 1; k < 2; k++) {
                System.out.print("        "+st[k] + " ");
            }
            if(n%2==0) {
                if ((i - 1) == n) {
                    System.out.println();
                    System.out.print("  Receiver side ack:");
                    str[0] = "1";
                    if (i < 3) {
                        str[1] = decToBinary(i - 1);
                    } else {
                        j = (i + 1) % 4;
                        str[1] = decToBinary(j - 1);
                    }
                    for (int k = 0; k < 2; k++) {
                        System.out.print(str[k] + " ");
                    }
                    System.out.println("  Send Frame: " + (i - 1) + " Again");
                    System.out.println();
                    System.out.println("  Frame No.(Again) || User data || seq.No  ");
                    System.out.print("   " + (i - 1) + "            " + a[m - 2] + " " + a[m - 1]);
                    //System.out.print("Sequence no. of frame" +i+" : ");
                    for (int k = 1; k < 2; k++) {
                        System.out.print("        " + st[k] + " ");
                    }
                }
            }else
                {
                    if(i==n){
                        {
                            System.out.println();
                            System.out.print("  Receiver side ack:");
                            str[0] = "1";
                            if (i < 3) {
                                str[1] = decToBinary(i);
                            } else {
                                j = (i + 1) % 4;
                                str[1] = decToBinary(j - 1);
                            }
                            for (int k = 0; k < 2; k++) {
                                System.out.print(str[k] + " ");
                            }
                            System.out.println("  Send Frame: " + (i ) + " Again");
                            System.out.println();
                            System.out.println("  Frame No.(Again) || User data || seq.No  ");
                            System.out.print("   " + (i) + "            " + a[m] + " " + a[m +1]);
                            //System.out.print("Sequence no. of frame" +i+" : ");
                            for (int k = 1; k < 2; k++) {
                                System.out.print("        " + st[k] + " ");
                            }
                        }
                    }
                }
            if(i%2!=0 && i!=0)
            {
                System.out.println();
                System.out.print("  Receiver side ack:");
                str[0] = "0";
                if (i<3) {
                    str[1] = decToBinary(i+1);
                } else {
                    j = (i+1) % 4;
                    str[1] = decToBinary(j);
                }
                for (int k = 0; k < 2; k++) {
                    System.out.print(str[k] + " ");
                }
                System.out.print("  Send Frame: "+(i+1));
                System.out.println();
            }
            if(m+2==temp.length()){
                break;
            }
            m=m+2;
        }
    }
}