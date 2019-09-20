import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("화씨를 입력하세요: ");
		int fahrenheit = input.nextInt();
		
		double celsius = (double)(fahrenheit - 32) * 5 / 9;
		System.out.println("화씨 " + fahrenheit + "도는 섭씨" + celsius+"에 해당합니다.");
		
		input.close();

	}
}
