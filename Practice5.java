//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �� : ");
		int getMoney = input.nextInt();
		
		System.out.print("��ǰ�� �Ѿ� : ");
		int total = input.nextInt();
		
		double surtax = total * 0.1;
		System.out.println("�ΰ��� : " + (int)surtax);
		
		int change = getMoney - total;
		System.out.print("�ܵ� : "+ change);
		
		input.close();
	}

}
