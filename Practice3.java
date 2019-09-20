import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("사각형의 가로: ");
		int width = input.nextInt();
		
		System.out.print("사각형의 세로: ");
		int height = input.nextInt();

		System.out.println("사각형의 넓이는 "+ width * height + "입니다.");
		
		input.close();
	}

}
