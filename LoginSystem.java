import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Username: ");
		String Username = input.nextLine();

		System.out.print("Enter Password: ");
		String password = input.nextLine();

		if (Username.equals("Josh") && password.equals("@JoshuaATU")) {
			System.out.println("Login Successful !");
		} else {
			System.out.println("Invalid Credentials Try again !");
		}
	}
}