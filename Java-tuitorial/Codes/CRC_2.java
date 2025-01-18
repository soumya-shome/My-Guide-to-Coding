import java.util.*;
class CRC_2
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data stream:" );
        String datastream = sc.nextLine();
        System.out.print("Enter generator:" );
        String generator = sc.nextLine();

        int data[] = new int[datastream.length() + generator.length()-1];
        int divisor[] = new int[generator.length()];
        int p[] = new int[generator.length()-1];

        for(int i=0;i<datastream.length();i++)
            data[i] = Integer.parseInt(datastream.charAt(i)+"");

        for(int i=0;i<generator.length();i++)
            divisor[i] = Integer.parseInt(generator.charAt(i)+"");

        //Display of appended dada
        System.out.print("the appended data is: ");
        for(int i=0;i<datastream.length()+generator.length()-1;i++)
            System.out.print(data[i]);
        System.out.println();

        //Calculation of CRC
        for(int i=0;i<datastream.length();i++){
            if(data[i]==1)
                for(int j=0;j<divisor.length;j++){
                    data[i+j] ^= divisor[j];
                }
        }

        //Display CRC

        for(int i=0;i<datastream.length();i++){
            data[i] = Integer.parseInt(datastream.charAt(i)+"");
        }

        int s= data.length;
        for(int i = 0;i<generator.length()-1;i++){
            p[i]=data[s-1];
            s--;
        }

        System.out.print("Parity bit is: ");
        for(int i = generator.length()-2; i>=0; i--){
            System.out.print(p[i]);
        }

        System.out.println();
        System.out.print("The CRC code is: ");
        for(int i=0;i<data.length;i++) {
            System.out.print(data[i]);
        }
        System.out.println();

        int data1[] = new int[datastream.length() + generator.length()-1];
        int n = 0;

        //Generating the random number
        Random randomGenerator=new Random();
        for (int i = 0; i < 10; i++) {
            n= randomGenerator.nextInt(10);

        }


        if(n==0){
            for (int i = 0; i < data.length; i++) {
                data1[i] =  data[i];
            }
        }else{
            if(data[n-1]==0){
                data[n-1]=1;
            }else{
                data[n-1]=0;
            }
            for (int i = 0; i < data.length; i++) {
                data1[i] =  data[i];
            }
        }
        System.out.print("the random code: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data1[i]);
        }


        System.out.println();
        System.out.print("Enter generator was:  ");

        for(int i=0;i<generator.length();i++){
            System.out.print(divisor[i]);
        }

        //Calculation of remainder
        for(int i=0;i<datastream.length();i++){
            if(data1[i]==1)
                for(int j=0;j<divisor.length;j++)
                    data1[i+j] ^= divisor[j];
        }

        //Display validity of data
        boolean valid = true;

        for(int i=0;i<data.length;i++)
            if(data1[i]==1){
                valid = false;
                break;
            }
        System.out.println();
        if(valid==true) System.out.println("Data stream is valid");
        else System.out.println("Data stream is invalid. CRC error occured.");

    }

}