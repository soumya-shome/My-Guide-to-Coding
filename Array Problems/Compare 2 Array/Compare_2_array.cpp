#include<iostream>
using namespace std;
main(){
    int a[5],b[5];
    int i,f=0;
    cout<<"Enter 5 number for 1st array : ";
    for (i=0;i<5;i++)
        cin>>a[i];
    cout<<"Enter 5 number for 2nd array : ";
    for (i=0;i<5;i++)
        cin>>b[i];
    cout<<"1st Array : ";
    for (i=0;i<5;i++)
        cout<<a[i]<<" ";
    cout<<endl<<"2nd Array : ";
    for (i=0;i<5;i++)
        cout<<b[i]<<" ";
    for(i=0;i<5;i++)
        if(a[i]!=b[i]){
            f=1;
            break;
        }
    if(f==0)
        cout<<"\nBoth the array are same.";
    else
        cout<<"\nBoth the array are different.";   
}