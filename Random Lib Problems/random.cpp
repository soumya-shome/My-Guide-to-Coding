#include<cstdlib>
#include<iostream>
#include<ctime>
using namespace std;
main()
{
      srand(time(0));
      for(int i=0;i<10;i++)
      {
              int n=(rand()%8)+1;
              cout<<n<<endl;
      }
      system("pause");
}      
