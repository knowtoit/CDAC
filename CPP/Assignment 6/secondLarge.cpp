#include<iostream>
#include<algorithm>
using namespace std;

int main(){
    int num, secMax;
    cout << "How many numbers you want : ";
    cin >> num;
    int arr[num];
    int m = sizeof(arr)/ sizeof(arr[0]);

    for(int i=0; i< num; i++){
        cin >> arr[i];
    }

    for(int i = 0; i< num; i++){
        std::sort(arr, arr+m);
        cout << arr[i] << " ";
        secMax = arr[m-2]; 
    }
    cout<< "Second largest number is " << secMax;
}