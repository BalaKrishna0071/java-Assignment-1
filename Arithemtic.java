import java.util.Scanner;
class Arithemtic{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("1 , Addition");
		System.out.println("2 , Subtraction");
		System.out.println("3 , Multiplication");
		System.out.println("4 , Divison");
		System.out.println("5 , Exit");
		System.out.println("6 , Select any Choice ");
		int s = sc.nextInt();
		switch(s){
		case 1: System.out.println("Addition "+(a+b));
			break;
		case 2:System.out.println("Subtraction "+(a-b));
			break;
		case 3:System.out.println("Multiplication "+(a*b));
			break;
		case 4:System.out.println("Divison "+(a%b));
			break;	
		case 5:System.exit(0);
		default: System.out.println("Invalid");
		}

	}
}