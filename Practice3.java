//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�簢���� ����: ");
		int width = input.nextInt();
		
		System.out.print("�簢���� ����: ");
		int height = input.nextInt();

		System.out.println("�簢���� ���̴� "+ width * height + "�Դϴ�.");
		
		input.close();
	}

}
