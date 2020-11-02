#include<iostream>
using namespace std;
int main()
{
	cout<<"Enter the elements of the matrix:\n";
	int a[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			cin>>a[i][j];
		}
	}
	
	cout<<"The matrix entered by you is:\n";
	for(int i1=0;i1<3;i1++)
	{
		for(int j1=0;j1<3;j1++)
		{
			cout<<a[i1][j1]<<"\t";
			
		}
		cout<<"\n";
	}
	
	cout<<"The transpose of the matrix is :\n";
	for(int i3=0;i3<3;i3++)
	{
		for(int j3=0;j3<3;j3++)
		{
			cout<<a[j3][i3]<<"\t";
		}
		cout<<"\n";
	
	}
	return(0);
}
