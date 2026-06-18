import java.util.Scanner;

class ScannerDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a = sc.nextInt();
		
		double b = sc.nextDouble();
		System.out.println("a: " + a + "b: " + b);
		
		sc.close();
	}
}