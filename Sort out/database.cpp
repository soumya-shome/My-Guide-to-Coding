#include <iostream>
#include <string>
#include <fstream>
#include <cstdio>

using namespace std;
class input_data
{
	private:
		void searchname();
		void search();
		string name;
		int age;
	public:
		void input(long int number)
		{
 			ofstream data("data.txt", ios::app);
 			system("cls");
 			cout << "Enter the new name" << endl;
 			cin >> name;
 			cin.sync();
 			cout << "Enter the age." << endl;
 			cin >> age;
 			data << number << ' ' << name << ' ' << age << endl;     
 			data.close();
			system("cls"); 
     	}
     	
     	void displayall()
		{
			long int number;
     		ifstream data("data.txt");
     		system ("CLS");
    		cout << "Entire  database"<< endl;
    		cout << "Number" << '\t' << "Name" << '\t' << "Age" << endl;
     		cout << "---------------" << endl;
     		while (data>>number >> name >> age)
			{
     			cout << number << '\t' << name << '\t' << age << endl ;
     		}
     		cin.get();    
     	}
     	
     	void deleteFile()
		{
     		ofstream data("data.txt");
     		system("cls");
     		cout << "Successfully Completed!" << endl;
     	}
     	
     	void searchage()
 		{
 			long int number;
     		ifstream data("data.txt");
     		int fage;
     		long int salary;
     		system ("CLS");
     		cout << "Enter the age of an employee:";
     		cin >> fage;
     		while (data >> number >> name >> age)
			{
           		if (fage == age)
				{
                    cout << "Number" << '\t' << "Name" << '\t' << "Age" << endl;
     				cout << "---------------" << endl;
                    cout << number << '\t' << name << '\t' << age << endl ;
                }
            }
           	system ("pause");
           	cin.get();
        }
};
main()
{
	input_data ob;
	for(int i=1;i<=6;i++)
	{
		ob.input(i);	
	}
	ob.displayall();
	system("cls");
	ob.searchage();
	system("pause");
	ob.deleteFile();
}