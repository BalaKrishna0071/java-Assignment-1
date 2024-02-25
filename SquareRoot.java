import java.util.Scanner;
class SquareRoot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number");
		int in = sc.nextInt();

		for(int i =1 ;i<=in;i++){
			double sqrt = Math.sqrt(i);
			   System.out.println("Square root of " + i + " is: " + sqrt);
		}
	}
}