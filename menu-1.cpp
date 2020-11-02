#include<iostream>
using namespace std;
main()
{
	int n,m,c,n1,m1,t,t2;
	cout<<"enter 1,2,3\n";
	cin>>c;
	cout<<"Enter 1st number\n";
	cin>>n;
	cout<<"Enter 2nd number\n";
	cin>>m;
	switch(c)
	{
		case 1:
			n1=n;
			m1=m;
			t=0,t2=0;
			for(int i=1;i<=n1;i++)
			{
				if(n1%i==0)
				{
					t++;
				}
			}
			for(int i=1;i<=m1;i++)
			{
				if(m1%i==0)
				{
					t2++;
				}
			}
			if(t==2&&t2==2)
			{
				cout<<"Both are Prime\n";
			}
			else 
			{
				cout<<"Both are not Prime\n";
			}
		break;
		
		case 2:
			n1=n,m1=m,t=0,t2=0;
			for(int i=1;i<n1;i++)
			{
				if(n1%i==0)
				{
					t=t+i;
				}
			}
			for(int i=1;i<m1;i++)
			{
				if(m1%i==0)
				{
					t2=t2+i;
				}
			}
			cout<<t<<" "<<t2;
			if(t==m&&t2==n)
			{
				cout<<"Armadilo";
			}
			else
			{
				cout<<"Noy";
			}
		break;
		
			
	}
}
