import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get new user info
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your current age: ");
        int currentAge = scanner.nextInt();

        System.out.print("Enter your expected retirement age: ");
        int retAge = scanner.nextInt();

        User user = new User(name, currentAge, retAge);
        Menu menu = new Menu();

        // Enter the menu system
        Menu.Main();

        // If the user chooses to exit, display a goodbye message
        System.out.print("\nSession complete.  Goodbye.\n");
    }
}