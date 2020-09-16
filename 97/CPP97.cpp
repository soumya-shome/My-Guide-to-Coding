#include<iostream>
#include<math.h>
using namespace std;
main()
{
	int n;
	cout<<"Enter rows \n";
	cin>>n;
	int s=n-1;
	int d[n];
	for(int i=1;i<=n;i++)
	{
		for(int sp=1;sp<=s;sp++)
		{
			cout<<" ";
		}
		s--;
		int k=(float)pow(11,i-1);
		int y=i-1;
		//cout<<k<<" "<<y;
		while(k!=0)
		{
			d[y]=k%10;
			//cout<<" "<<d[y]<<" "<<k;
			k=k/10;
			y--;
		}
		for(int j=0;j<i;j++)
		{
			cout<<d[j]<<" ";
		}
		cout<<endl;
		
	}
}
