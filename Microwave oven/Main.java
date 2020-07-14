#include<iostream>
using namespace std;
int main()
{
  int n;
  float x,c,d,f;
  cin>>n>>x;
  c=n*x;
  d=(x*50)/100;
  if(n<=2)
    printf("%.2f",(c-d));
  else if(n==3)
    cout<<2*x;
  else
    cout<<"Number of items is more";
  
  //Type your code here.
}