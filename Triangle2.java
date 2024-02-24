import java.util.Scanner;
class Triangle2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the first angle value ");
		int a = sc.nextInt();
		System.out.println(" Enter the Second angle value ");
		int b = sc.nextInt();
		System.out.println(" Enter the Third angle value ");
		int c = sc.nextInt();

		int sum =a+b+c;

		if(sum > 60)
		{
			System.out.println("Equilatrel Triangle");
		}else if(sum <90)
		{
			System.out.println("Acute Angled  Triangle");
		}else if(sum == 90)
		{
			System.out.println("Right angled Triangle");
		}else if(sum > 90)
		{
			System.out.println("Obtuse Angled  Triangle");
		}else{
			System.out.println("Invalid Input");
		}
	}
}