#include<iostream>
using namespace std;

// Pass By Value
// int swap(int , int);
// int main(){
    
//     int a,b,c;
//     cout<<"enter the values for a and b\n";

//     cin>>a>>b;

//     cout<<"before swapping values of a and b are "<< a << " "<< b <<endl;

//     c=swap(a,b);
//     cout<<"after swapping values of a and b are "<<a << " "<< b <<endl;


// }
// int swap(int x,int y){
//     int temp = x;
//     x = y;
//     y = temp;

//     cout<<"value of x = "<< x <<"  "<<"value of y = "<< y <<endl;
//     return x,y;
// }






// Pass By Address
void swap(int *, int *);
int main(){

    int a,b,c;
    cout<<"Enter values for a and b: "<<endl;
    cin >> a >> b;

    cout << "Values of a and b before swapping are: " << a << " "<< b << endl;

    swap(&a, &b);
    cout <<" values of a and b after swapping: " << a << " " << b << endl;
}

void swap(int* x, int * y){
    int temp = *x;
    *x = *y;
    *y = temp;

    // cout<<"value of x = "<< *x <<"  "<<"value of y = "<< *y <<endl;
    
}