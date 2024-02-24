import java.util.Scanner;
class AmongLadder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number");
		int num3 = sc.nextInt();
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(" num1 is Greater Among them "+num1);
		}else if(num2 > num1 && num2 > num3)
		{
			System.out.println(" num2 is Greater Among them "+num2);
		}else if(num3 > num1 && num3 > num2)
		{
			System.out.println(" num3 is Greater Among them "+num3);
		}else{
			System.out.println(" Invalid Input");
		}
	}
}