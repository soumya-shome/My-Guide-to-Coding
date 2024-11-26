using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Score            //DO NOT CHANGE the name of namespace
{
    public class Program                //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)   //DO NOT CHANGE 'Main' Signature
        {
            //Implement code here
            Console.Write("Player Name : ");
                string p1= Console.ReadLine();
                Console.Write("Player Name : ");
                string p2= Console.ReadLine();
                Console.Write("player Name : ");
                string p3= Console.ReadLine();
                Console.Write("player Name : ");
                string p4= Console.ReadLine();
                Console.Write("player Name : ");
                string p5= Console.ReadLine();
                Console.Write("player Name : ");
                string p6= Console.ReadLine();
                int b=0, d=0, t=0;
                string bn= "Bill", dn="Daisy", tn="Tommy";
                if(p1.Equals (bn))
                {
                    b++;
                }
                if(p2.Equals (bn))
                {
                    b++;
                }
                if(p3.Equals (bn))
                {
                    b++;
                }
                if(p4.Equals (bn))
                {
                    b++;
                }
                if(p5.Equals (bn))
                {
                    b++;
                }
                if(p6.Equals (bn))
                {
                    b++;
                }
                if(p1.Equals (bn) && p2.Equals (bn))
                {
                    b++;
                }
                if(p2.Equals (bn) && p3.Equals (bn))
                {
                    b++;
                }
                if(p3.Equals (bn) && p4.Equals (bn))
                {
                    b++;
                }
                if(p4.Equals (bn) && p5.Equals (bn))
                {
                    b++;
                }
                if(p5.Equals (bn) && p6.Equals (bn))
                {
                    b++;
                }
                if(p1.Equals (tn))
                {
                    t++;
                }
                if(p2.Equals (tn))
                {
                    t++;
                }
                if(p3.Equals (tn))
                {
                    t++;
                }
                if(p4.Equals (tn))
                {
                    t++;
                }
                if(p5.Equals (tn))
                {
                   t++;
                }
                if(p6.Equals (tn))
                {
                    t++;
                }
                if(p1.Equals(tn) && p2.Equals(tn))
                {
                   t++;
                }
               if(p2.Equals(tn) && p3.Equals(tn))
               {
                   t++;
               }
               if(p3.Equals(tn) && p4.Equals(tn))
               {
                   t++;
               }
               if(p4.Equals(tn) && p5.Equals(tn))
               {
                   t++;
               }
               if(p5.Equals(tn) && p6.Equals(tn))
               {
                   t++;
               }
               if(p1.Equals(dn))
               {
                   d++;
               }
               if(p2.Equals(dn))
               {
                   d++;
               }
               if(p3.Equals(dn))
               {
                   d++;
               }
               if(p4.Equals(dn))
               {
                   d++;
               }
               if(p5.Equals(dn))
               {
                   d++;
               }
               if(p6.Equals(dn))
               {
                   d++;
               }
               if(p1.Equals (dn) && p2.Equals(dn))
               {
                   d++;
               }
               if(p2.Equals (dn) && p3.Equals(dn))
               {
                   d++;
               }
               if(p3.Equals (dn) && p4.Equals(dn))
               {
                   d++;
               }
               if(p4.Equals (dn) && p5.Equals(dn))
               {
                   d++;
               }
               if(p5.Equals (dn) && p6.Equals(dn))
               {
                   d++;
               }
               Console.WriteLine("Bill score : {0}",b);
               Console.WriteLine("Tommy Score : {0}",t);
               Console.WriteLine("Daisy Score : {0}",d);
               
            
        }
    }
}
