import java.util.*;
class Date_Difference{
    
    void age(int s_d, int s_m, int s_y, int f_d, int f_m, int f_y) {
        int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (f_d > s_d) {
            s_d = s_d + month[f_m - 1];
            s_m = s_m - 1;
        }
        if (f_m > s_m) {
            s_y = s_y - 1;
            s_m = s_m + 12;
        }
        int d_d = s_d - f_d;
        int d_m = s_m - f_m;
        int d_y = s_y - f_y;
        System.out.print("Difference: Years: "+d_y+" Months: "+d_m+" Days: "+d_d);
    }

    public static void main(String[] args){
        Date_Difference ob=new Date_Difference();
        Scanner sc=new Scanner(System.in);
        System.out.println("Date Difference :From 1st Date to 2nd Date");
        System.out.print("Enter 1st Date : ");
        int f_d=sc.nextInt();
        System.out.print("Enter 1st Month : ");
        int f_m=sc.nextInt();
        System.out.print("Enter 1st Year : ");
        int f_y=sc.nextInt();
        System.out.print("Enter 2nd Date : ");
        int s_d=sc.nextInt();
        System.out.print("Enter 2nd Month : ");
        int s_m=sc.nextInt();
        System.out.print("Enter 2nd Year : ");
        int s_y=sc.nextInt();
        sc.close();
        System.out.println("1st Date : "+f_d+"."+f_m+"."+f_y);
        System.out.println("2nd Date : "+s_d+"."+s_m+"."+s_y);
        ob.age(s_d,s_m,s_y, f_d, f_m,f_y);
    }
}