# include<iostream>
using namespace std;
main()
{
	long a,b,c,d=0,e=1;
	cout<<"Enter a number:";
	cin>>a;
	while(a>0)
	{
		b=a%2;
		d=d+b*e;
		a=a/2;
		e=e*10;
	}
	cout<<"Input number is:"<<d<<endl;
	system("pause");
}

