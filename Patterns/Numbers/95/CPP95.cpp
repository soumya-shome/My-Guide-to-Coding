#include <iostream>
using namespace std;
main()
{
	int i,j;
	for(i=1;i<=5;i++){
		for(j=1;j<=i;j++){
			if(j%2==0){
				cout<<"0 ";
			}else{
				cout<<"1 ";
			}
		}
		cout<<"\n";
	}
}