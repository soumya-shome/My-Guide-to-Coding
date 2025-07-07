#include<iostream>
using namespace std;
int main(){
    int line = 5;
    for(int i = 1; i<=line; i++){
        for(int s=1;s<=line-i;s++){
            cout<<"  ";
        }
        for(int j = 1; j <= i*2-1; j++){
            cout<<"* ";
        }
        cout<<"\n";
    } 
    return 0;
}