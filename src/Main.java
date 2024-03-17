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

        int menuOption = menu.investmentMenu();
        while(menuOption != 4) {
            switch (menuOption) {
                case 1:
                    int employerMatchMenuOption = menu.createNew401kOr403bMenu();
                    if (employerMatchMenuOption == 1) {
                        // create a new 401k/403b investment
                    }
                    break;
                case 2:
                    int iraMenuOption = menu.createNewIRAMenu();
                    if (iraMenuOption == 1) {
                        // create a new ira investment
                    }
                    break;
                case 3:
                    int stockMenuOption = menu.createNewStocksMenu();
                    if (stockMenuOption == 1) {
                        // create new stocks investment
                    }
                    break;
                default:
                    System.out.print("\nFatal error.  Option out of range.\n");
            }
            menuOption = menu.investmentMenu();
        }

        // If the user chooses to exit, display a goodbye message
        System.out.print("\nSession complete.  Goodbye.\n");
    }
}