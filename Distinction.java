import java.util.Scanner;
class Distinction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the marks ");
		int mark = sc.nextInt();
		if(mark > 95)
		{
			System.out.println(" You got Distinction ");
		}else{
			System.out.println(" You didnt got Distinction ");
		}
	}
}