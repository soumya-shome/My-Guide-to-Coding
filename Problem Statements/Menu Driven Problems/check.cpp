#include<iostream>
using namespace std;
class tourist{	
    private:
    int cno;
    char ctype;
    float perkm;
    float distance;
    void citycharges(){
        if(ctype=='A'){
            perkm=20;
        }
        else if(ctype=='B')
        {
            perkm=18;
        }
        else if(ctype=='C')
        {				
            perkm=15;			
            }		
            }	
    public:		
        void registercab()		
        {			
            cout<<"enter the value for cab no:\n";			
            cin>>cno;			
            cout<<"enter the for city type:\n";			
            cin>>ctype;			
            citycharges();		
        }		
        void display()		
        {			
            cout<<"enter distance:\n";			
            cin>>distance;			
            cout<<"cab no:"<<cno;			
            cout<<"city type:\n"<<ctype;			
            cout<<"per";
        }
}
#include<iostream>
using namespace std;
private:	
int tourist;
class tourist
{	
    int cno;	
    char ctype;	
    float perkm;	
    float distance;	
    public:		
    tourist()		
    {			
        ctype='A';			
        cno=0000;		
        }		
        void citycharges()		
        {			
            if(ctype=='A')			
            {				
                perkm=20;			
                }			
                else if(ctype=='B')			
                {				
                    perkm=18;			
                    }			
                    else if(ctype=='C')			
                    {				
                        perkm=15;			
                        }		
                        }		
                        void registercab()		
                        {			
                            cout<<"enter the value for cab no:\n";			
                            cin>>cno;			
                            cout<<"enter the for city type:\n";			
                            cin>>ctype;			
                            citycharges();		
                            }		
                            void display()		
                            {			
                                cout<<"enter distance:\n";			
                                cin>>distance;			
                                cout<<"cab no:"<<cno;			
                                cout<<"city type:\n"<<ctype;			
                                cout<<"per km:\n"<<perkm;			
                                cout<<"amount=\n"<<perkm*distance;		
                                }
                                }
                                
                                main()
                                {	
                                    tourist ob;	
                                    ob.registercab();	
                                    ob.display();
                    }