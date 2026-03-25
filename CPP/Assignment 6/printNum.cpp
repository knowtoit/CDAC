#include<iostream>
using namespace std;


int main()
{
    int n;
    cout<< "enter number n: " <<endl;
    cin >> n ;

    for(int i=1; i<=n; i++){
        if(i % 5 == 0 && i% 3==0){
        cout << "fizzbuzz" << endl;
    }
    else if (i% 5==0) {
        cout << "buzz" << endl;
    } else if(i%3==0) {
        cout << "fizz" << endl;   
    }
    else{
        cout<< i << endl;
    }
    }
}