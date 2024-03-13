import javax.swing.*;
class Buttons
{
    public static void meth()
    {
        JFrame t=new JFrame();
        JButton b=new JButton("1");
        b.setBounds(0,0,50,50);
        JButton c=new JButton("2");
        c.setBounds(50,0,50,50);
        JButton d=new JButton("3");
        d.setBounds(100,0,50,50);
        
        JButton e=new JButton("4");
        e.setBounds(0,50,50,50);
        JButton f=new JButton("5");
        f.setBounds(50,50,50,50);
        JButton g=new JButton("6");
        g.setBounds(100,50,50,50);
        
        JButton h=new JButton("7");
        h.setBounds(0,100,50,50);
        JButton i=new JButton("8");
        i.setBounds(50,100,50,50);
        JButton j=new JButton("9");
        j.setBounds(100,100,50,50);
        t.add(b);
        t.add(c);
        t.add(d);
        t.add(e);
        t.add(f);
        t.add(g);
        t.add(h);
        t.add(i);
        t.add(j);
        t.setSize(167,180);
        t.setLayout(null);
        t.setVisible(true);
    }
}