#include<iostream>
using namespace std;

int main() 
{
	cout<<"Enter The Size Of Array: ";
	int size;
	cin>>size;

	int array[size], key,i,loc = -1;
	
	for(int j=0;j<size;j++)
	{
		cout<<"Enter "<<j+1<<" Element: ";
		cin>>array[j];
	}
	
	cout<<"array[ ";
	for(int a=0;a<size;a++)
	{
		cout<<array[a]<<", ";
	}
	cout<<"]\n";
	
	cout<<"Enter Value To Search in Array : ";
	cin>>key;
	for(i=0;i<size;i++)
	{
		if(key==array[i])
		{
			loc = i;
			break;
		}
	}
	if(loc!=-1)
		cout<<"Value Found At Index Number : "<<loc<<endl;
	else
		cout<<"Value not found in Array"<<endl;
   return 0;
}


