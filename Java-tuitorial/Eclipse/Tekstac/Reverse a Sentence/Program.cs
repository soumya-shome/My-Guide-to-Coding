using System;
     using System.Linq;
     using System.Threading.Tasks;
     using System.IO;
     namespace Program
     {
         class Program
         {
             static void Main(string[] args)
            {
                int temp,i;
                Console.WriteLine("Enter a string");
                string s =Console.ReadLine();
                string[] a =s.Split(' ');
                int k = a.Length - 1;
                temp = k;
                for( i=k; temp>=0; k--)
                {
                    Console.Write(a[temp] + "" + ' ');
                     --temp;
                }
                Console.ReadKey();
            }
        }
    }

