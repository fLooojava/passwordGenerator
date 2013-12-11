import java.util.Scanner;


public class CodeGenerator
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("lenght of the new pw: ");
		String input = 	scanner.nextLine();
		int length= Integer.parseInt(input);
		scanner.close();
		
		CreatePassword createpw= new CreatePassword();
		createpw.generateRandomCode(length);
		System.out.print("generated from: ");
		System.out.println(System.getProperty("user.name")+" on " +System.getProperty("os.name"));
	}

}
