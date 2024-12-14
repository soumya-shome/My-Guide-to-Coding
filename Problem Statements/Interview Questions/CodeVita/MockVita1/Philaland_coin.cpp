#include <iostream> 
#include<math.h>
using namespace std; 
int findMinDenomin(int n) 
{ 
	return log2(n) + 1; 
} 

main() 
{ 
    int n;
	cin>>n;
    int t[n];
    for (int i=0;i<n;i++){
        cin>>t[i];
    }
    for(int i=0;i<n;i++){
	    cout<<findMinDenomin(t[i]); 
    }
}
