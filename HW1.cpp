#include <iostream> //c++ i/o library included
#include <vector> //vector library included

using namespace std;

const int N=40;  //define converted to const

inline void sum(int &p, vector<int>data) //inline funtion used
{
	for(int i = 0; i < data.size(); ++i)
		p = p + data[i];
}

int main()
{
	int accum = 0;
	vector<int>data(40); //array converted to vector
	for(int i = 0; i < N; ++i)
		data.push_back(i);
	sum(accum, data);
	cout<<"sum is "<<accum<<"\n"; //printing the sum
	return 0;

}
