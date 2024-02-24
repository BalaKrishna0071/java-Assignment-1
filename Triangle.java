import java.util.Scanner;

class Triangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Side");
		int a = sc.nextInt();
		System.out.println("Enter the Second Side");
		int b = sc.nextInt();
		System.out.println("Enter the  Third Side");
		int c = sc.nextInt();

		int sum = a+b+c;
		if(sum >= 180)
		{
			System.out.println("Its a Triangle");
		}else{
			System.out.println("Its Not a Triangle");
		}

	}
}