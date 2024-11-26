import java.io.*;
import java.net.*;

public class server1{
public static void main(String args[]) throws IOException{
ServerSocket ss= new ServerSocket(2222);
Socket s= ss.accept();
System.out.println("client connected");
// to read message
InputStreamReader in= new InputStreamReader(s.getInputStream());
BufferedReader bf= new BufferedReader(in);
String str= bf.readLine();
System.out.println("server "+ str);
// to send message
PrintWriter pr= new PrintWriter(s.getOutputStream());
pr.println("hello from server");
pr.flush();
}}
import java.io.*;
import java.net.*;

public class client1{

public static void main(String args[]) throws IOException{

Socket s= new Socket("localhost",2222); // IP address of server, port number

// to send a message
PrintWriter pr= new PrintWriter(s.getOutputStream());
pr.println("hello from client");
pr.flush();
// to read message

InputStreamReader in= new InputStreamReader(s.getInputStream());
BufferedReader bf= new BufferedReader(in);

String str= bf.readLine();
System.out.println("client "+ str);

}
}