import java.util.Scanner;
class Paper2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the First marks ");
		int num1 = sc.nextInt();
		System.out.println(" Enter the Second marks ");
		int num2 = sc.nextInt();
		System.out.println(" Enter the Third marks ");
		int num3 = sc.nextInt();
		System.out.println(" Enter the Fourth marks ");
		int num4 = sc.nextInt();
		System.out.println(" Enter the Fifth marks ");
		int num5 = sc.nextInt();
		System.out.println(" Enter your Gender ");
		String gen = sc.next();

		int total = num1+num2+num3+num4+num5;

		float per = total*100/500;

		if(per > 60 || gen == "male")
		{
			System.out.println(" You are Eligible for admission ");

		}else if(per > 80 || gen == "female")
		{
			System.out.println(" You are Eligible for admission ");
		}
	}
}