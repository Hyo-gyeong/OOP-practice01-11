//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		Scanner input = new Scanner(System.in);

		System.out.print("������� ������ : ");
		int r = input.nextInt();
		System.out.print("������� ����: ");
		int h = input.nextInt();
		
		double volume = PI * r * r * h;
		
		System.out.println("������� ���Ǵ� "+ volume);
		
		input.close();
	}

}
