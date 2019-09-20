import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("받은 돈 : ");
		int getMoney = input.nextInt();
		
		System.out.print("상품의 총액 : ");
		int total = input.nextInt();
		
		double surtax = total * 0.1;
		System.out.println("부가세 : " + (int)surtax);
		
		int change = getMoney - total;
		System.out.print("잔돈 : "+ change);
		
		input.close();
	}

}
