#include<iostream>
using namespace std;
void main(){
    int year;
    cout<<"Enter a Year : ";
    cin>>year;
    if (year % 400 == 0) {
        cout<<year<<" is a Leap Year";
    }else if (year % 100 == 0) {
        cout<<year<<" is not a Leap Year";
    }else if (year % 4 == 0) {
        cout<<year<<" is a Leap Year";
    }else {
        cout<<year<<" is not a Leap Year";
    }
}