//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = input.next();
		System.out.print("����: ");
		int age = input.nextInt();
		System.out.println("�̸��� "+name+"�̰� ���̴� "+age+"���Դϴ�.");
		
		input.close();
	}

}
