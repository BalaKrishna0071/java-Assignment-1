import java.util.Scanner;
class Check20{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		if(n > 20)
		{
			System.out.print("Number is more then 20");
		}else{
			System.out.print("Number is less then 20");
		}
	}
}