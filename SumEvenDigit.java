import java.util.Scanner;
class SumEvenDigit{
	public static void main(String[] args) {
		        int num,sum=0;
				Scanner sc = new Scanner(System.in);
				System.out.println("ENTER NUMBER");
				num = sc.nextInt();
				for(int i=1;i<=num;i++){
					if(i%2==0){
							sum=sum+i;
					}

				}
				System.out.println(sum);
	}
}