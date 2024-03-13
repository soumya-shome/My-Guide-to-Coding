import javax.swing.*;
import java.awt.event.*;
class polo
{
    public static void meth()
    {
        JFrame t=new JFrame();
        JButton a=new JButton("1");
        JButton b=new JButton("2");
        JButton c=new JButton("3");

        JButton d=new JButton("4");
        JButton e=new JButton("5");
        JButton f=new JButton("6");

        JButton g=new JButton("7");
        JButton h=new JButton("8");
        JButton i=new JButton("9");

        JButton j=new JButton("0");
        JButton k=new JButton("+");
        JButton l=new JButton("-");

        JButton m=new JButton("*");
        JButton n=new JButton("/");
        JButton o=new JButton("=");

        a.setBounds(0,20,50,50);
        b.setBounds(50,20,50,50);
        c.setBounds(100,20,50,50);

        d.setBounds(0,70,50,50);
        e.setBounds(50,70,50,50);
        f.setBounds(100,70,50,50);

        g.setBounds(0,120,50,50);
        h.setBounds(50,120,50,50);
        i.setBounds(100,120,50,50);

        j.setBounds(0,170,50,50);//0
        k.setBounds(150,20,50,50);//+
        l.setBounds(150,70,50,50);//-

        m.setBounds(50,170,50,50);//*
        n.setBounds(100,170,50,50);// /
        o.setBounds(150,120,50,100);//=

        t.add(a);
        t.add(b);
        t.add(c);
        t.add(d);
        t.add(e);
        t.add(f);
        t.add(g);
        t.add(h);
        t.add(i);
        t.add(j);
        t.add(k);
        t.add(l);
        t.add(m);
        t.add(n);
        t.add(o);
        t.setSize(200,200);
        t.setLayout(null);
        t.setVisible(true);
    }

    private void showTextFieldDemo(){
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
    }
}