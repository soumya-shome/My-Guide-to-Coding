#include<iostream>
using namespace std;
class Hotel
{
	private:
		int rno,days;
		float price,amount;
		char name[30];
		void compute()
		{
			if((days*price)>=11000)
			{
				cout<<"Total amount="<<(1.02*days*price);
			}
			else
			{
				cout<<"Total amount="<<(days*price);
			}
		}
	public:
		void getinfo();
		void displayinfo();	
};
void Hotel::getinfo()
{
	cout<<"Enter name\n";
	cin.getline(name,30);
	cout<<"Enter room number\n";
	cin>>rno;
	cout<<"Enter days of stay\n";
	cin>>days;
	cout<<"Enter Price \n";
	cin>>price;
}
void Hotel::displayinfo()
{
	cout<<"Name "<<name<<endl;
	cout<<"room number"<<rno<<endl;
	cout<<"Days "<<days<<endl;
	cout<<"price "<<price<<endl;
	compute();
}

main()
{
	Hotel a;
	a.getinfo();
	a.displayinfo();
}
