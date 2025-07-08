#include<iostream>
using namespace std;
int main(){
    int n = 0,i,j;
    cout<<"Enter number of lines: ";
    cin>>n;
    for (i=0;i<n;i++){
        for (j=0;j<n;j++){
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}