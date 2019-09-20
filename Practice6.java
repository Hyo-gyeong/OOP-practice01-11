import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = input.next();
		System.out.print("나이: ");
		int age = input.nextInt();
		System.out.println("이름은 "+name+"이고 나이는 "+age+"세입니다.");
		
		input.close();
	}

}
