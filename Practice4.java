//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ϴ� ������ �Է��ϼ���: ");
		double mile = input.nextDouble();
		double kilo = mile * 1.609;
		System.out.print(mile+"������ "+kilo+"ų���Դϴ�.");
		
		input.close();		
	}

}
