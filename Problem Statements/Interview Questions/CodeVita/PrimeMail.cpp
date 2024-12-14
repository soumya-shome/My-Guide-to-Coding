// C++ implementation of the approach
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

const int sz = 1e5;
bool isPrime[sz + 1];

void sieve()
{
	memset(isPrime, true, sizeof(isPrime));
	isPrime[0] = isPrime[1] = false;
	for (int i = 2; i * i <= sz; i++) {
		if (isPrime[i]) {
			for (int j = i * i; j < sz; j += i) {
				isPrime[j] = false;
			}
		}
	}
}

int removePrimes(int arr[], int len)
{
	sieve();
	for (int i = 0; i < len; i++) {
		if (isPrime[arr[i]]) {
			for (int j = i; j < len; j++) {
				arr[j] = arr[j + 1];
			}
			i--;
			len--;
		}
	}
    int c=0;
    for(int i=0;i<len;i++) 
        c++;
    return c;
}
int main()
{
    int n,count=1;
    cin>>n;
    if(n>=1 && n<=10000){}
	while(n>1){
        int arr[n];
        for(int i=0;i<n;i++) 
            arr[i]=i+1;
        int len = sizeof(arr) / sizeof(int);
        n = removePrimes(arr, len);
        //cout<<n;
        count++;
    }

    cout<<count;
    return 0;
}
