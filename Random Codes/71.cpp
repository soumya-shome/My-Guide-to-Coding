#include <iostream>
#include <ctype.h>
using namespace std;
void Encode (char Info[ ],int N) ;
main ( )
{
	char Memo [ ] = "Justnow" ; 
	Encode (Memo, 2) ;
	cout<<Memo<<endl ;
}
void Encode (char Info [ ], int N)
{
 for (int i=0 ; Info[i] !='\0' ; i++)
	if (i%2==0)
		Info[i] = Info[i] -N ;
 	else if (islower(Info[i]))
		Info[i] = toupper(Info[i]) ;
	else
		Info[i] = Info[i] +N ;
}

