#include<iostream>
using namespace std;
struct gift
{
	int gcode;
	char gDe[20];
	gift *link;
};
class Stack
{
	gift *top;
	public:
		Stack()
		{
			top=NULL;
		}
		void push()
		{
			gift *t=new gift ;
			cout<<"Enter value";
			cin>>t->gcode;
			t->link=top;
			top=t;
		}
		void show()
		{
			gift *t=top;
			while (t!=NULL)
			{
				cout<<t->gcode<<endl;
				t=t->top;
			}
		}
}
main()
{
	Stacl o;
	o.push();
	o.show();
}

