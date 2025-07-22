#include <iostream>
using namespace std;
int main()
{
    int i, j;
    int line = 5;
    int h=(line%2==0)?line/2:(line/2+1);
    // Loop to print upper half of the pattern
    for(i=1; i<=h; i++)
    {
        for(j=i; j<=h; j++)
        {
            cout<<"* ";
        }

        for(j=1; j<=2*(i-1); j++)
        {
            cout<<"  ";
        }

        for(j=i; j<=h; j++)
        {
            cout<<"* ";
        }

        cout<<"\n";
    }

    // Loop to print lower half of the pattern
    for(i=h; i>=1; i--)
    {
        for(j=h; j>=i; j--)
        {
            cout<<"* ";
        }

        for(j=2*(i-1); j>=1; j--)
        {
            cout<<"  ";
        }

        for(j=h; j>=i; j--)
        {
            cout<<"* ";
        }

        cout<<"\n";
    }
    return 0;
}