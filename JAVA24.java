class JAVA24{
    public static void main(String[] args){
        int sp=9;
        int a[]=new int[]{1,2,3,4,5,6,7,8,9,0};
        for(int i=9;i>=0;i--){
            for(int s=1;s<=sp;s++){
                System.out.print(" ");
            }
            sp--;
            for(int j=i;j<=9;j++){
                System.out.print(a[j]);
            }
            for(int j=8;j>=i;j--){
                System.out.print(a[j]);
            }            
            System.out.println();
        }
    }
}

