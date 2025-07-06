#include<iostream>
using namespace std;
int main(){
    int line = 5;
    int i,j,s;
    for(i = 1; i<=line; i++){
        for( j = 1; j<=i; j++){
            if (i == 1 || i == line || j == 1 || j ==i)
                cout<<"* ";
            else
                cout<<"  ";
        }
        cout<<"\n";
    }
}