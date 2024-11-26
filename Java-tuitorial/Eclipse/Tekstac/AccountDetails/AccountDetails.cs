//Implement code here
using System;
     class program
     {
         static void Main(string[] args)
         {
             Console.WriteLine("Enthe account id");
             int Id1 = Convert.ToInt32(Console.ReadLine());
             Console.WriteLine("Enter account type");
            string AccountType1 = Console.ReadLine();
            Console.WriteLine("Enter account balance");
            double Balance1 = double.Parse(Console.ReadLine());
            Account obj = new Account(Id1, AccountType1, Balance1);
            obj.GetDetails();
        }
    }
    class Account 
    {
        private int id;
        private string accountType;
        private double balance;
        public int Id 
        {
            get{return id;}
            set{id=value;}
        }
        public string AccountType
        {
            get{return accountType;}
            set{accountType = value;}
        }
        public double Balance 
        {
            get 
            {
                if(balance<0)
                {
                    balance=0;
                    return balance;
                }
                else
                {
                    return balance;
                }
            }
            set{balance = value; }
        }
        public Account(){}
        public Account (int Id, string AccountType, double Balance)
        {
            this.Id = Id;
            this.AccountType = AccountType;
            this.Balance = Balance;
        }
        public void GetDetails()
        {
          Console.WriteLine("Account Id: "+Id);
          Console.WriteLine("Account Type: "+AccountType);
            Console.WriteLine("Balance: "+Balance);
        }
        public bool WithDraw(double amount)
        {
            if(balance<amount)
            {
                return false;
            }
            else 
            {
                Balance = Balance-amount;
                return true;
                
            }
        }
    }
