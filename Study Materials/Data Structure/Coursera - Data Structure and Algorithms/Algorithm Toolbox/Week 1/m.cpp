// C++ program to find maximum pair sum whose 
// difference is less than K 
#include <iostream> 
using namespace std; 

// Method to return maximum sum we can get by 
// finding less than K difference pairs 
int maxSumPairWithDifferenceLessThanK(int arr[], int N, int k) 
{ 
	int maxSum = 0; 

	// Sort elements to ensure every i and i-1 is closest 
	// possible pair 
	//sort(arr, arr+N); 
	for (int i=N-1; i>0; --i) 
	{ 
		if (arr[i]-arr[i-1] < k) 
		{ 
			//Assuming only positive numbers. 
			maxSum += arr[i]; 
			maxSum += arr[i-1]; 

			//When a match is found skip this pair 
			--i; 
		} 
	} 

	return maxSum; 
} 

// Driver code to test above methods 
int main() 
{ 
	int arr[] = {100000, 90000}; 
	int N = sizeof(arr)/sizeof(int);
	int K = 2; 
	cout << maxSumPairWithDifferenceLessThanK(arr, N, K); 
	return 0; 
} 
