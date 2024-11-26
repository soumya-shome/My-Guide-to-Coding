using System;
     using System.IO;
     
     public class Person
     {
         //Fill code here
         private string firstName;
         private string lastName;
         private DateTime dob;
        private string age;
        public string FirstName
        {
            get{return firstName;}
            set{firstName = value;}
        }
        public string LastName
        {
            get{return lastName;}
            set{lastName = value;}
        }
        public DateTime Dob{
            get{return dob;}
            set{dob = value;}
        }
        public string Adult
        {
            get{
                if(GetAge(dob)>=18)
                return "Adult";
                else
                return "False";
            }
        }
        public int GetAge(DateTime dob)
        {
            int y = new DateTime(DateTime.Now.Subtract(dob).Ticks).Year;
            return y;
        }
        public void DisplayDetails()
        {
            Console.WriteLine("First Name: "+firstName);
            Console.WriteLine("Last Name: "+lastName);
            Console.WriteLine("Age: "+GetAge(dob));
            Console.WriteLine(Adult);
        }
    } 
    public class Progarm
    {
        public static void Main(String[] args)
        {
            Person p = new Person();
            Console.WriteLine("Enter first name");
            p.FirstName = Console.ReadLine();
            Console.WriteLine("Enter last name");
            p.LastName = Console.ReadLine();
            Console.WriteLine("Entre date of birth in yyyy/mm/dd format");
            p.Dob = Convert.ToDateTime(Console.ReadLine());
            p.DisplayDetails();
        }
    }
