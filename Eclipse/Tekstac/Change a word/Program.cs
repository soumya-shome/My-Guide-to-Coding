using System;
class pro 
{
	static void Main(string[] args)
    {
    	Console.WriteLine("Enter a string");
        string u = Console.ReadLine();
        string t="the";
        if(u.Contains(t))
        {
        	Console.WriteLine(u.Replace("the","that"));
        }
        else
        {
        	Console.WriteLine("Word 'the' not found");
        }
    }
}