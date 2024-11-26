#include<stdio.h>
#include<stdlib.h>
string decimalToBinary(int n)
{
    //finding the binary form of the number and
    //coneverting it to string.
    string s = bitset<64> (n).to_string();
    //Finding the first occurance of "1"
    //to strip off the leading zeroes.
    const auto loc1 = s.find('1');
    if(loc1 != string::npos)
        return s.substr(loc1);
    return "0";
}
int main()
{
	char a[20],s[2],st[2];
	int i,j,m=0;
	printf("Enter the bits:\n");
	scanf("%s",&a);
	//window size=2 no. of bits=2
	for(i=0;i<strlen(a);i++)
	{
		s[0]='0';
		if(i<3)
		{
			s[1]=decimalToBinary(i);
		}
		else
		{
			j=i%4;
			s[1]=decimalToBinary(j);
		}
		printf("Frame No.:%d\n",i);
		printf("User data:%s\n",a[m]);
		printf("Seq no.:%d",a[m+1]);
	}
}