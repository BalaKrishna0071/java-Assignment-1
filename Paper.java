import java.util.Scanner;
class Paper{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Subject marks");
		int Eng = sc.nextInt();
		System.out.println("Enter the Second Subject marks");
		int Hindi = sc.nextInt();
		System.out.println("Enter the Third Subject marks");
		int Math = sc.nextInt();
		System.out.println("Enter the Fourth Subject marks");
		int Geog = sc.nextInt();
		System.out.println("Enter the Fifth Subject marks");
		int Hist = sc.nextInt();
		int total = Eng+Hindi+Math+Geog+Hist;
		float per = total*100/500;
		System.out.println(" Percentage is = " + per + " Total is = "+total);
	}
}