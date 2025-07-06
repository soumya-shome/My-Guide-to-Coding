#include<iostream>
using namespace std;
int main(){
    int line = 5;
    int i,j,s;
    for(i = 1; i<=line; i++){
        for( j = line; j>=i; j--){
            if (i == 1 || i == line || j == i || j == line)
                cout<<"* ";
            else
                cout<<"  ";
        }
        cout<<"\n";
    }
}