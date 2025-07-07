#include<iostream>
using namespace std;
int main(){
    int line = 5;
    for(int i = line ; i >= 1; i--){
        for(int j = 1;j<=i;j++){
            cout<<"* ";
        }
        cout<<"\n";
    }
    for(int i = 2; i <= line; i++){
        for(int j = 1;j<=i;j++){
            cout<<"* ";
        }
        cout<<"\n";
    }
    
    return 0;
}