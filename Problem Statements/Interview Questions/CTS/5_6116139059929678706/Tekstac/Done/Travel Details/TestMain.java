import java.util.Scanner;
public class TestMain {
    public static BusTicket getTicketDetails()
    {
        Scanner sc = new Scanner(System.in);
        
        BusTicket bt = new BusTicket();
        System.out.println("Enter the ticket no:");
        bt.setTicketNo(sc.nextInt());
        System.out.println("Enter the ticket price:");
        bt.setTicketPrice(sc.nextFloat());
        return bt;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p=new Person();
        BusTicket bt;
        System.out.println("Enter the passenger name:");
        p.setName(sc.nextLine());
        System.out.println("Enter the gender(M or F/ m or f):");
        p.setGender(sc.next().charAt(0));
        System.out.println("Enter the age:");
        p.setAge(sc.nextInt());
        
        bt = getTicketDetails();
        System.out.println("Ticket no:"+bt.getTicketNo());
        System.out.println("Passenger Name:"+p.getName());
        System.out.println("Price of a ticket : "+bt.getTicketPrice());
        bt.calculateTotal();
        System.out.println("Total Amount : "+bt.getTotalAmount());

    }

}