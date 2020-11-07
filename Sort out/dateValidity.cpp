#include <iostream>
using namespace std;

int main()
{
    int val=0;
	int date;
	int month;
	int year;
    cout << "Enter a date: ";
    cin >> date;
	cout << "Enter a month: ";
    cin >> month;
    cout << "Enter a year: ";
    cin >> year;
    
    if(date<=31 && month<=12)
    {
    	if(month==2)
    	{
    		if (year % 4 == 0)
   			{
        		if (year % 100 == 0)
        		{
            		if (year % 400 == 0)
                	{
						if(date<=29)
						{
							val=1;
						}
            		}
					else
					{
                		if(date<=28)
						{
							val=1;
						}
       				}
       			}
        		else
				{
			    	if(date<=29)
						{
							val=1;
						}
    			}
    		}
    		else
    		{
        		if(date<=28)
						{
							val=1;
						}
			}
    	}
    	else if((month ==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12))
    	{
    		if(date<=31)
    		{
    			val=1;
			}
		}
		else if((month==4)||(month==6)||(month==9)||(month==11))
		{
			if(date<=30)
			{
				val=1;
			}
		}
    }
    else 
	{
		val=0;
	}
	
	if(val==1)
	{
		cout<<"Valid Date";
	}
	else 
	{
		cout<<"Not Valid";
	}
}
