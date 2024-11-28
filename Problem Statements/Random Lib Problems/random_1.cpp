#include<iostream>
#include<cstdlib>
#include<ctime>
#include<stdlib.h>
using namespace std;
int main()
{	
	int i = 0;
	void randomize();
	while(i++ < 10) {
		int r = (rand() % 100) + 1;
		cout << r << " ";
	}
	for(int i=0;i<=10;i++)
	{
		int n=rand()*3;
		cout<<n<<endl;
	}
	int num=rand();
	for(int i=0;i<5;i++)
	{
		cout<<num;
	}
	return 0;
}
/*
int main()
{
	int n;
	srand(time(0));
	n = rand() % 91 + 10;
	cout<<"The randomly selected number is :"<<n;
	
	return 0;
}
*/
/*
main()
{
	srand(time(NULL));
	int a[]={1,2,3,4,5,6,7,8,9};
	int r=random()*9;
}
*/
