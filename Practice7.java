//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		Scanner input = new Scanner(System.in);

		System.out.print("원기둥의 반지름 : ");
		int r = input.nextInt();
		System.out.print("원기둥의 높이: ");
		int h = input.nextInt();
		
		double volume = PI * r * r * h;
		
		System.out.println("원기둥의 부피는 "+ volume);
		
		input.close();
	}

}
