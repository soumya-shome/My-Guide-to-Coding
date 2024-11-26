import java.util.*;
class ThreadPriority extends Thread{
    public ThreadPriority(String tname){
        this.setName(tname);
    }
    public void run(){
        System.out.println("Inside run method");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Thread 1 name:");
        String t1name=sc.next();
        System.out.println("Enter Thread 2 name:");
        String t2name=sc.next();
        System.out.println("Enter Thread 3 name:");
        String t3name=sc.next();

        ThreadPriority t1=new ThreadPriority(t1name);
        ThreadPriority t2=new ThreadPriority(t2name);
        ThreadPriority t3=new ThreadPriority(t3name);

        System.out.println("Thread priority of: "+t1.getName()+" "+t1.getPriority());
        System.out.println("Thread priority of: "+t2.getName()+" "+t2.getPriority());
        System.out.println("Thread priority of: "+t3.getName()+" "+t3.getPriority());
        
        System.out.println("Enter Thread 1 priority:");
        int t1p=sc.nextInt();
        System.out.println("Enter Thread 2 priority:");
        int t2p=sc.nextInt();
        System.out.println("Enter Thread 3 priority:");
        int t3p=sc.nextInt();
        sc.close();
        t1.setPriority(t1p);
        t2.setPriority(t2p);
        t3.setPriority(t3p);
        sc.close();
        
        System.out.println("Thread priority of: "+t1.getName()+" "+t1.getPriority());
        System.out.println("Thread priority of: "+t2.getName()+" "+t2.getPriority());
        System.out.println("Thread priority of: "+t3.getName()+" "+t3.getPriority());
        
    }
}