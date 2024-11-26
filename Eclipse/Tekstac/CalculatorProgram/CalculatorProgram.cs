using System;
     public class CalculatorProgram
     {
         public int Addition(int a, int b)
         {
             return(a+b);
         }
         public int Subtraction(int a, int b)
         {
            return(a-b);
        }
        public int Multiplication(int a, int b)
        {
            return(a*b);
        }
        public double Division(int a,int b,out double remainder)
        {
            remainder = a%b;
            return (a/b);
        }
    }
    public class Program{
        static void Main()
        {
            CalculatorProgram p =new CalculatorProgram();
            Console.WriteLine("Enter the operator");
            string opr = Console.ReadLine();
            Console.WriteLine("Enter the operand");
            int a = Convert.ToInt32(Console.ReadLine());
            int b = Convert.ToInt32(Console.ReadLine());
            if(opr=="+")
            {
                Console.WriteLine("result of {0} + {1} is{2}",a,b,p.Addition(a,b));
            }
            if(opr=="-")
            {
                Console.WriteLine("result of {0} - {1} is{2}",a,b,p.Subtraction(a,b));
            }
            if(opr=="*")
            {
                Console.WriteLine("result of {0} + {1} is{2}",a,b,p.Multiplication(a,b));
            }
            if(opr=="/")
            {
                double div=p.Division(a,b, out double remainder);
                Console.WriteLine("result of {0} / {1} is {2}",a,b,div);
                Console.WriteLine("Remainder ={0}",remainder);
            }
        }
    }
