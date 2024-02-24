import java.util.Scanner;
class Week{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input ="monday";
			if(input =="monday" || input=="tuesday" || input=="wednesday" || input=="thursday" || input=="friday")
			{
				System.out.println("its not a holiday");
			}else{
				System.out.println("its a holiday");
			}
	}
}