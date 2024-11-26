    using System;
    class Program
    {
        static void Main(string[] args)
        {
            Product obj = new Product();
            Console.WriteLine("Enter product id");
            obj.ProductId=Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter product name :");
            obj.ProductName=Console.ReadLine();
            Console.WriteLine("Enter product price");
            obj.Price = double.Parse(Console.ReadLine());
        }
    }
    class Product
    {
        private int productId;
        private string productName;
        private double price;
        public string ProductName{
            get{return productName;}
            set{productName = value;}
            
        }
        public int ProductId
        {
            get{return productId;}
            set{productId = value;}
        }
        public double Price
        {
            get
            {
                if(price<0)
                {
                    price = 0;
                    return price;
                    
                    
                }
                else
                {
                    return price;
                }
            }
            set{price = value;}
        }
        public void Display()
        {
            Console.WriteLine("Product ID:"+ProductId);
            Console.WriteLine("ProductName:"+ProductName);
            Console.WriteLine("Product Price:"+Price);
        }
    }
