import java.util.Scanner;

class Operations{
	public static int factorial(int n){
		int fact = 1;
		for(int i=0; i<n; i++){
			fact = fact * j;
		}
		return fact;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int f = factorial(n);
		System.out.println(f);
		sc.close();
	}
}