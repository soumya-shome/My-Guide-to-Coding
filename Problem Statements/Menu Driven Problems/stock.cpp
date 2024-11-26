#include<iostream>
using namespace std;
class Stock
{
	private:
		int icode,qty;
		float price,disc;
		char item[30];
		void fixed_disc()
		{
			if(qty<50)
			{
				disc=0.0;
			}
			else if(qty>=50 && qty<100)
			{
				disc=0.05;
			}
			else if(qty>100)
			{
				disc=0.10;
			}
		}
	public:
		void buy();
		void display();	
};
void Stock::buy()
{
	cout<<"Enter item name\n";
	cin.getline(item,30);
	cout<<"Enter item code\n";
	cin>>icode;
	cout<<"Enter quantity \n";
	cin>>qty;
	cout<<"Enter Price \n";
	cin>>price;
	fixed_disc();
	price=price-(price*disc);
	cout<<"PRICE"<<price<<endl;
}
void Stock::display()
{
	cout<<"Item name "<<item<<endl;
	cout<<"Item code "<<icode<<endl;
	cout<<"Quantity "<<qty<<endl;
	cout<<"Disc "<<disc<<endl;
	cout<<"Price="<<price<<endl;
}

main()
{
	Stock a;
	a.buy();
	a.display();
}
