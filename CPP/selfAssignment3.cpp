#include<iostream>
using namespace std;
  
void swap(int & ,int &);
int main(){
    int a ,b,c;
    cout<<"enter values of a and b \n";
    cin>>a>>b;

    cout<<"before calling function\n"<< a <<" " << b << endl;
    swap(a,b);

    cout<<"After calling function "<<a<<"  "<<b<<endl;

}
void swap(int &x ,int &y){
    int temp =x;
    x = y ;
    y =  temp ;

    cout<<"in function value of x = "<< x <<"  "<<"value of y = "<< y <<endl;
}