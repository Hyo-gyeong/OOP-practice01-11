//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("ȭ���� �Է��ϼ���: ");
		int fahrenheit = input.nextInt();
		
		double celsius = (double)(fahrenheit - 32) * 5 / 9;
		System.out.println("ȭ�� " + fahrenheit + "���� ����" + celsius+"�� �ش��մϴ�.");
		
		input.close();

	}
}
