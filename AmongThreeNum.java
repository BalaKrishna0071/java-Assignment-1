import java.util.Scanner;
class AmongThreeNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the First Number ");
		int num1 = sc.nextInt();
		System.out.println(" Enter the Second Number ");
		int num2 = sc.nextInt();
		System.out.println(" Enter the Third Number ");
		int num3 = sc.nextInt();

		if(num1 > num2 && num1 > num3)
		{
			System.out.println(" The largest Number is " + num1);
		}else if(num2 > num1 && num1 > num2)
		{
			System.out.println(" The largest Number is " + num2);
		}else if(num3 > num2 && num3 > num1)
		{
			System.out.println(" The largest Number is " + num3);
		}else{
			System.out.println(" Invalid Input");
		}
	}
}