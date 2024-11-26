using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProgFundamentals12                 //DO NOT CHANGE the name of namespace
{
    public class Program                    //DO NOT CHANGE the name of class 'Program'
    {
        public static void Main(string[] args)   //DO NOT CHANGE 'Main' Signature
        {
           
           // Fill the code here
           Console.Write("Number of Rows :  ");
               int row=Convert.ToInt32(Console.ReadLine());
               Console.Write("Number of Symbols : ");
               int symbol = Convert.ToInt32(Console.ReadLine());
               for(int i=0;i<(row-1);i++)
               {
                   for(int j=0;j<symbol;j++)
                   {
                       Console.Write("/\\");
                   }
                   Console.WriteLine();
                   Console.Write("|");
                   for(int k=0;k<(symbol*2-2);k++)
                   {
                       Console.Write(" ");
                   }
                   Console.WriteLine("|");
               }
               for(int j=0;j<symbol;j++)
               {
                   Console.Write("/\\");
               }
               
           
        }
    }
}
