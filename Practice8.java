//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("500원 짜리의 개수: ");
		int c500 = input.nextInt();
		
		System.out.print("100원 짜리의 개수: ");
		int c100 = input.nextInt();
		
		System.out.print("50원 짜리의 개수: ");
		int c50 = input.nextInt();
		
		System.out.print("10원 짜리의 개수: ");
		int c10 = input.nextInt();
		
		int total = 500 * c500 + 100 * c100 + 50 * c50 + 10 * c10;
		System.out.println("저금통에 있는 총액 : " + total+"원");
		
		input.close();

	}

}
