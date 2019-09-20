import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("원하는 마일을 입력하세요: ");
		double mile = input.nextDouble();
		double kilo = mile * 1.609;
		System.out.print(mile+"마일은 "+kilo+"킬로입니다.");
		
		input.close();		
	}

}
