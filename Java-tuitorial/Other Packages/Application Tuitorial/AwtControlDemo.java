import java.awt.*;
import java.awt.event.*;

public class AwtControlDemo 
{

    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    public AwtControlDemo()
    {
        prepareGUI();
    }

    public static void main()
    {
        AwtControlDemo  awtControlDemo = new AwtControlDemo();
        awtControlDemo.showTextFieldDemo();
    }

    private void prepareGUI()
    {
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent windowEvent){
                    System.exit(0);
                }        
            });    
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();        
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);  
    }

    private void showTextFieldDemo()
    {
        headerLabel.setText("Control in action: TextField"); 

        Label  namelabel= new Label("User ID: ", Label.RIGHT);
        Label  passwordLabel = new Label("Password: ", Label.CENTER);
        final TextField userText = new TextField(6);
        final TextField passwordText = new TextField(6);
        passwordText.setEchoChar('*');

        Button loginButton = new Button("Login");

        loginButton.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) {     
                    String data = "Username: " + userText.getText();
                    data += ", Password: " + passwordText.getText();
                    statusLabel.setText(data);        
                }
            }); 

        controlPanel.add(namelabel);
        controlPanel.add(userText);
        controlPanel.add(passwordLabel);       
        controlPanel.add(passwordText);
        controlPanel.add(loginButton);
        mainFrame.setVisible(true);  
    }
}