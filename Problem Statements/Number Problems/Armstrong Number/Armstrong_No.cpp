#include<iostream>
using namespace std;
int num_digits(int n){
    int nd=0;
    for(nd=0;n!=0;nd++,n=n/10);
    return nd;
}

int powe(int d,int p){
    int po=1,j;
    for(j=1;j<=p;j++)
        po=po*d;
    return po;
}

int armstrong(int n){
    int r,n2,t=num_digits(n),s=0,y,j;
    for(n2=n;n2!=0;n2/=10)
        s=s+powe(n2%10,t);
    if(n==s)
        return 1;
    else
        return 0;
}

int main(){
    int n,i;
    cout<<"Enter A Number : ";
    cin>>n;
    if(armstrong(n)==1)
        cout<<n<<" is an Armstrong Numeber";
    else
        cout<<n<<" is not a Armstrong Number";
    return 0;
}
