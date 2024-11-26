import javax.swing.*;
class cal
{
    public static void meth()
    {
        JFrame t=new JFrame();
        JButton a=new JButton("1");
        a.setBounds(0,0,50,50);
        JButton b=new JButton("2");
        b.setBounds(50,0,50,50);
        JButton c=new JButton("3");
        c.setBounds(100,0,50,50);
        
        JButton d=new JButton("4");
        d.setBounds(0,50,50,50);
        JButton e=new JButton("5");
        e.setBounds(50,50,50,50);
        JButton f=new JButton("6");
        f.setBounds(100,50,50,50);
        
        JButton g=new JButton("7");
        g.setBounds(0,100,50,50);
        JButton h=new JButton("8");
        h.setBounds(50,100,50,50);
        JButton i=new JButton("9");
        i.setBounds(100,100,50,50);
        
        JButton j=new JButton("*");
        j.setBounds(0,150,50,50);
        JButton k=new JButton("/");
        k.setBounds(50,150,50,50);
        JButton l=new JButton(".");
        l.setBounds(100,150,50,50);
        
        JButton m=new JButton("+");
        m.setBounds(150,0,50,50);
        JButton n=new JButton("-");
        n.setBounds(150,50,50,50);
        JButton o=new JButton("=");
        o.setBounds(150,100,50,100);
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
        t.setSize(250,250);
        t.setLayout(null);
        t.setVisible(true);
    }
}