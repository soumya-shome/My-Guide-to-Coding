package dbcheck;

import com.mysql.jdbc.Connection;
import java.sql.*;  
import java.util.Scanner;
public class DBCheck {
    Connection conn;
    public void openConn()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        this.conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test_db?useSSL=false","root","");
        System.out.println("Connection Established");
    }
    
    public void display()throws Exception{
        String query = "SELECT * FROM `users`";
        Statement st= this.conn.createStatement();
        ResultSet resultSet = st.executeQuery("SELECT * FROM `users`");
        while (resultSet.next()) {
            String usn=resultSet.getString("username");
            String pass=resultSet.getString("password");
            System.out.println("Username: "+usn+" Password : "+pass);
        }
        st.close();
        resultSet.close();
    }
    
    public void insert()throws Exception{
        Scanner sc=new Scanner(System.in);
        String username,fname,lname,pass;
        System.out.println("Enter Username");
        username=sc.next();
        System.out.println(username);
        
        System.out.println("Enter name");
        fname=sc.next();
        System.out.println(fname);
        
        System.out.println("Enter Last name");
        lname=sc.next();
        System.out.println(lname);
        
        System.out.println("Enter Password");
        pass=sc.next();
        System.out.println(pass);
        String query = "INSERT INTO `users`(`username`, `name`, `lastname`, `password`) VALUES ('"+username+"','"+fname+"','"+lname+"','"+pass+"')";
        Statement statement = this.conn.createStatement();
        statement.executeUpdate(query);
        statement.close();
    }
    
    void coun()throws Exception{
        String query = "SELECT count(*) FROM `users`";
        Statement st= this.conn.createStatement();
        ResultSet resultSet = st.executeQuery(query);
        resultSet.next();
        int c=resultSet.getInt("count(*)");
        System.out.println("Count : "+c);
        st.close();
        resultSet.close();
    }
    
    public static void main(String[] args)throws Exception {
        
        DBCheck db=new DBCheck();
        db.openConn();
        db.display();
        db.coun();
        //db.insert();
        //db.display();
    }
    
}
