using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Departments           //DO NOT CHANGE the name of namespace
{
    public class Program              //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)     //DO NOT CHANGE 'Main' Signature
        {
            Console.WriteLine("Total students placed in CS ");
                int c=Convert.ToInt32(Console.ReadLine());
                //Add code here
                
                Console.WriteLine("Total students placed in MECH ");
                int m=Convert.ToInt32(Console.ReadLine());
                //Add code here
    
                Console.WriteLine("Total students placed in MET ");
                int me=Convert.ToInt32(Console.ReadLine());
                //Add code here
                 
                //Implement the logic here
                if(c>m&&c>me)
                {
                    Console.WriteLine("Highest placement CS");
                }
                else if(m>me&&c<m)
                {
                    Console.WriteLine("Highest placement MECH");
                }
                else if(me>m&&c<me)
                {
                    Console.WriteLine("Highest placement MET");
                }
                else if(c==m)
                {
                    Console.WriteLine("Highest placement CS");
                    Console.WriteLine("Highest placement MECH");
                }
                else if(me==m)
                {
                    Console.WriteLine("Highest placement MECH");
                    Console.WriteLine("Highest placement MET");
                }
                else if(me==m)
                {
                    Console.WriteLine("Highest placement MET");
                    Console.WriteLine("Highest placement CS");
                }

        }
    }
}
