//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("500�� ¥���� ����: ");
		int c500 = input.nextInt();
		
		System.out.print("100�� ¥���� ����: ");
		int c100 = input.nextInt();
		
		System.out.print("50�� ¥���� ����: ");
		int c50 = input.nextInt();
		
		System.out.print("10�� ¥���� ����: ");
		int c10 = input.nextInt();
		
		int total = 500 * c500 + 100 * c100 + 50 * c50 + 10 * c10;
		System.out.println("�����뿡 �ִ� �Ѿ� : " + total+"��");
		
		input.close();

	}

}
