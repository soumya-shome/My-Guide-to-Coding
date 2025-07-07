#include <iostream>
using namespace std;
int main()
{
    int line = 5;
    for (int i = 1; i <= line; i++)
    {
        for (int sp = 1; sp <= line - i; sp++)
        {
            cout << " ";
        }
        for (int j = 1; j <= i; j++)
        {
            if(i == 1 || i == line || j == 1 || j == i)
                cout << "* ";
            else
                cout << "  ";
        }
        cout << endl;
    }
    return 0;
}
