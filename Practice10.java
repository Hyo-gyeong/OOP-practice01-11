//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		Scanner input = new Scanner(System.in);

		System.out.print("������ ������: ");
		int r = input.nextInt();
		System.out.print("������ ����: ");
		int h = input.nextInt();
		
		double semiVolume = PI * r * r * h;
		System.out.println("������ ���Ǵ� "+semiVolume/3);
		
		input.close();
	}

}
