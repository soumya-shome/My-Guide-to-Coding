#include<iostream>
using namespace std;
int main(){
    int i,j,s,sp=0;
    int line = 5;
    for(i=1;i<=line;i++)
    {
        for(s=1;s<=sp;s++)
        {
            cout<<" ";
        }
        sp++;
        for(j=i;j<=line;j++)
        {
            cout<<"* ";
        }
        cout<<"\n";
    }
    sp--;
    for(i=line;i>=1;i--)
    {
        for(s=1;s<=sp;s++)
        {
            cout<<" ";
        }
        sp--;
        for(j=i;j<=line;j++)
        {
            cout<<"* ";
        }
        cout<<"\n";
    }
    return 0;
}
