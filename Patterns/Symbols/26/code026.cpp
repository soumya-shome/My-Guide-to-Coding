#include<iostream>
using namespace std;
int main(){
    int n = 0,i,j;
    cout<<"Enter number of lines: ";
    cin>>n;
    for (i=1;i<=n;i++){
        for (j=1;j<=n;j++){
            if (i==1 || j ==1 || i == n || j == n)
                cout<<"* ";
            else
                cout<<"  ";
        }
        cout<<"\n";
    }
    return 0;
}