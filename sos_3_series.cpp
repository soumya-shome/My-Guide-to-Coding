#include<iostream>
using namespace std;
main()
{
	int  c,n;
	double s,t,i,j,a,f;
	cout<<"Enter \n";
	cin>>c;
	
	switch(c)
	{
		case 1:
			cout<<"Terms";
			cin>>n;
			s=0.0;
			for(i=1;i<=n;i++)
			{
				t=1/i;
				s=s+t;
			}
			cout<<"sum= "<<s;
		break;
		
		case 2:
			cout<<"Terms";
			cin>>n;
			s=1.0;
			a=1.0;
			for(i=2;i<=n;i++)
			{
				t=1/(a*a);
				s=s+t;
				a=a+2;
			}
			cout<<"sum= "<<s;
		break;
		
		case 3:
			cout<<"Terms";
			cin>>n;
			s=0.0;
			for(i=1;i<=n;i++)
			{
				f=1.0;
				for(j=1.0;j<=i;j++)
				{
					f=f*j;
				}
				t=1/f;
				s=s+t;
			}
			cout<<"sum= "<<s;
		break;
		
		default:
			cout<<"Wrong";
	}
	
}
