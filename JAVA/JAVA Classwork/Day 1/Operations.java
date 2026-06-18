import java.util.Scanner;

class Operations{
	public static int Factorial(int n){
		int fact = 1;
		for(int i=1; i<=n; i++){
			fact = fact * i;
		}
		return fact;
	}
	
	public static void printTable(int num){
		for(int i=1; i<=10; i++){
			System.out.println(num + "*"+ i + "=" + num * i);
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		
		int f = Operations.Factorial(n);
		System.out.println(f);
		printTable(n);
		sc.close();
	}
}