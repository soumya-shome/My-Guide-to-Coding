import java.util.*;

class Lists{
    public static void main(String[] args){
        // ARRAYLIST
        System.out.println("\nARRAY LIST");
        ArrayList<Integer> l1=new ArrayList<Integer>(); 
        /*
            1. maintain insertion order
            2.non-syncronized
            3.can be randomly accessed
        */

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(2);
        l1.add(4);

        for(int i:l1){
            System.out.print(i+" ");
        }

        Iterator itr=l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println(l1);
        System.out.println(l1.get(3));
        System.out.println("Size : "+l1.size());




        
        //LINKEDLIST
        System.out.println("\nLNKED LIST");
        LinkedList<Integer> l2=new LinkedList<Integer>();  
        
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(2);
        l2.add(4);
        for(int i:l2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(l2.get(3));
        System.out.println("Size : "+l2.size());
        
        // VECTOR
        System.out.println("\nVECTOR LIST");
        Vector<Integer> l3=new Vector<Integer>();
        
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(2);
        l3.add(4);
        for(int i:l3){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(l3.get(3));
        System.out.println("Size : "+l3.size());

        // STACK
        System.out.println("\nSTACK LIST");
        Stack<Integer> l4=new Stack<Integer>();
        
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(2);
        l4.add(4);
        l4.pop();
        for(int i:l4){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(l4.get(3));
        System.out.println("Size : "+l4.size());
    }
}