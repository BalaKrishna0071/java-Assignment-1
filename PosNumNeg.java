import java.util.Scanner;
class PosNumNeg{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Number ");
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println(" Its a Postive Number ");
		}else{
			System.out.println(" Its a Negative  Number ");
		}
	}
}