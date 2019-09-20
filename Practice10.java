
import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		Scanner input = new Scanner(System.in);

		System.out.print("원뿔의 반지름: ");
		int r = input.nextInt();
		System.out.print("원뿔의 높이: ");
		int h = input.nextInt();
		
		double semiVolume = PI * r * r * h;
		System.out.println("원뿔의 부피는 "+semiVolume/3);
		
		input.close();
	}

}
