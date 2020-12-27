#include<iostream>
using namespace std;
main(){
    int a[10],i,max,min;
    cout<<"Enter 10 numbers : ";
    for(i=0;i<10;i++)
        cin>>a[i];
    min=a[0];
    max=a[0];
    for(i=0;i<10;i++){
        if(a[i]>max)
            max=a[i];
        if(a[i]<min)
            min=a[i];
    }
    cout<<"Maximum in Array : "<<max<<endl;
    cout<<"Minimum in Array : "<<min;
}