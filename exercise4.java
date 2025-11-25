import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.print("Enter yout height in metres: ");
        double height = input.nextDouble();
        
        System.out.println("You are " + age + "years old and " + height + " metres tall.");
    }
}