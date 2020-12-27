#include<iostream>
using namespace std;
struct stu
{
	char name[20];
	int roll;
	char clas;
	char sec;
};
void detail(stu student2)
{
	cout<<"Name="<<student2.name;
	cout<<"Class="<<student2.clas;
	cout<<"Section="<<student2.sec;
	cout<<"Roll="<<student2.roll;
}
main()
{
	stu student1;
	cout<<"Enter Name \n";
	cin.getline(student1.name,20);
	cout<<"Enter Roll Number \n";
	cin>>student1.roll;
	cout<<"Enter Class \n";
	cin>>student1.clas;
	cout<<"Enter Section\n";
	cin>>student1.sec;
	detail(student1);
}
