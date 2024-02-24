import java.util.Scanner;
class CharacterCheck{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Character");
		int ch = sc.nextInt();
		if((ch>='A' && ch<='Z'))
		{
			System.out.println("Its a Upper Case Character ");
		}else if(ch >='a' && ch<='z')
		{
			System.out.println("Its a Lower Case Character ");
		}else if(ch>='0' && ch<='9')
		{
			System.out.println("Its a Digit ");
		}else{
			System.out.println("Its a Special Character ");
		}
	}
}