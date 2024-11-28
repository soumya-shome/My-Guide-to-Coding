using System;

public class Program   //DO NOT change the class name
{
    static void Main(string[] args)       //DO NOT change the 'Main' method signature
    {
        //Fill code hereConsole.WriteLine("Enter a number:");
             int n=Convert.ToInt32(Console.ReadLine());
            int[,] arr = new int[50,50];
            arr = GetArray(n);
            for(int k = 0;k<n;k++)
            {
                for(int l=0;l<n;l++)
                {
                    Console.Write(string.Format("{0}", arr[k,l]));
                }
                Console.Write(Environment.NewLine);
            }
        }
        public static int[,] GetArray(int num)
        {
            int[,] a =new int[num,num];
            for(int i=0;i<num;i++)
            {
                for(int j=0;j<num;j++)
                {
                    if(i==j)
                    {
                        a[i,j] = 0;
                    }
                    else if(j>i)
                    {
                        a[i,j] = 1;
                    }
                    else
                    {
                        a[i,j]=-1;
                    }
                }
            }
            return a;
        }
    }
