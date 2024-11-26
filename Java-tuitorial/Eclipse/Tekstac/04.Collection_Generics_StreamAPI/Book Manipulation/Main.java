import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Library l=new Library();
        int choice;
        for(int i=1;i<50;i++){
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author");
            System.out.println("4.Count number of books-by book name");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            if(choice==1){
                    Book b=new Book();
                    System.out.println("Enter the isbn no:");
                    int isbn=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the book name:");
                    String bname=sc.nextLine();
                    System.out.println("Enter the author name:");
                    String aut=sc.nextLine();
                    b.setIsbnno(isbn);
                    b.setBookName(bname);
                    b.setAuthor(aut);
                    l.addBook(b);
            }
                
            else if(choice==2){
                    ArrayList<Book> list=l.viewAllBooks();
                    if(list.isEmpty()){
                        System.out.println("The list is empty");
                        continue;
                    }
                    Iterator it=list.iterator();
                    while(it.hasNext()){
                        Book b=(Book)it.next();
                        System.out.println("Isbn no:"+b.getIsbnno());
                        System.out.println("Book name:"+b.getBookName());
                        System.out.println("Author name:"+b.getAuthor());
                    }
            }
            
            else if(choice==3){
                    System.out.println("Enter the author name:");
                    String aut=sc.nextLine();
                    ArrayList<Book> list=l.viewBooksByAuthor(aut);
                    if(list.isEmpty()){
                        System.out.println("None of the book published by author"+aut);
                        continue;
                    }
                    Iterator it=list.iterator();
                    while(it.hasNext()){
                        Book b=(Book)it.next();
                        System.out.println("Isbn no:"+b.getIsbnno());
                        System.out.println("Book name:"+b.getBookName());
                        System.out.println("Author name:"+b.getAuthor());
                    }
            }
                
            else if(choice==4){
                    System.out.println("Enter the book name");
                    String bname=sc.nextLine();
                    System.out.println("Count is"+l.countnoofbook(bname));
            }
                
            else if(choice==5){
                    System.exit(0);
            }
        }
    }
}