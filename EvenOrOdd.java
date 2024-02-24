import java.util.Scanner;
class EvenOrOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println(" Its a Even Number ");
		}else{
			System.out.println(" Its a Odd Number ");
		}
	}
}