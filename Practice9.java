//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("�Ž����� �Ѿ�: ");
		int change = input.nextInt();
		
		int c500 = change / 500;
		int rest1 = change % 500;
		
		int c100 = rest1 /100;
		int rest2 = rest1 % 100;
		
		int c50 = rest2 / 50;
		
		int c10 = rest2 % 50 / 10;
		
		System.out.println("500��¥�� ���� : " + c500 + "��");
		System.out.println("100��¥�� ���� : " + c100 + "��");
		System.out.println("50��¥�� ���� : " + c50 + "��");
		System.out.println("10��¥�� ���� : " + c10 + "��");
		
		input.close();

	}

}
