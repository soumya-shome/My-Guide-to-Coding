#include<iostream>
using namespace std;
class tollboth
{
	private:
		int ncars;
		int ttax;
		tollboth()
		{
			ncars=0;
			ttax=0;
		}
	public:
		void paycar()
		{
			ttax=ttax+10;
			ncars++;
		}
		void freecar()
		{
			ncars++;
		}
		void show()
		{
			cout<<"The Total number of Ca"
		}
};
main()
{
	tollboth ob ;
	ob.paycar();
	ob.freecar();
	ob.show();
	
}
