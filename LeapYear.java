import java.util.Scanner;
class LeapYear{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int n = sc.nextInt();

		if(n%100!=0)
		{
			if(n%4==0)
			{
				System.out.println("Its a leap year");
			}else{
				System.out.println("Its a leap year");
			}
		}else{
			if (n%400==0) {
				System.out.println("Its a Centuries leap year");
			}else{
				System.out.println("Its Not a Centuries leap year");
			}
		}
	}
}