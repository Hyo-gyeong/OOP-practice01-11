import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("거스름돈 총액: ");
		int change = input.nextInt();
		
		int c500 = change / 500;
		int rest1 = change % 500;
		
		int c100 = rest1 /100;
		int rest2 = rest1 % 100;
		
		int c50 = rest2 / 50;
		
		int c10 = rest2 % 50 / 10;
		
		System.out.println("500원짜리 동전 : " + c500 + "개");
		System.out.println("100원짜리 동전 : " + c100 + "개");
		System.out.println("50원짜리 동전 : " + c50 + "개");
		System.out.println("10원짜리 동전 : " + c10 + "개");
		
		input.close();

	}

}
