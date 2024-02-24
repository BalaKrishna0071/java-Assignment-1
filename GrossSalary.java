import java.util.Scanner;
class GrossSalary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary");
		int sal = sc.nextInt();
		System.out.println("Enter the Daily Allowence");
		int allow = sc.nextInt();
		System.out.println("Enter the Traveling Salary");
		int travel = sc.nextInt();
		System.out.println("Enter the House Rent");
		int rent = sc.nextInt();

		int gros = allow+travel+rent;

		System.out.println("gross salary is ="+gros);

	}
}