import java.util.Scanner;

public class Menu {
    private static Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public static void Main() {
        int menuOption = investmentMenu();
        switch(menuOption) {
            case 1:
                int employerMatchMenuOption = createNew401kOr403bMenu();
                if(employerMatchMenuOption == 1) {
                    // create a new 401k/403b investment
                }
                break;
            case 2:
                int iraMenuOption = createNewIRAMenu();
                if(iraMenuOption == 1) {
                    // create a new ira investment
                }
                break;
            case 3:
                int stockMenuOption = createNewStocksMenu();
                if(stockMenuOption == 1) {
                    // create new stocks investment
                }
                break;
            default:
                System.out.print("\nFatal error.  Option out of range.\n");
        }

    }

    public static int investmentMenu() {
        int menuOption;

        do {
            System.out.print("\nWhat would you like to do today?\n");
            System.out.print("\n1 - Create a new 401k/403b investment");
            System.out.print("\n2 - Create a new IRA investment");
            System.out.print("\n3 - Create a new Stocks investment");
            System.out.print("\n4 - Exit program\n");
            System.out.print("\nEnter menu option here: ");

            menuOption = scanner.nextInt();
            System.out.print("\n");

            if(1 > menuOption || 4 < menuOption)
                System.out.print("***Option out of range***\n");

        }while(1 > menuOption || 4 < menuOption);

        return menuOption;
    }

    public static int createNew401kOr403bMenu() {
        int menuOption;

        do {
            System.out.print("\nEnter a menu option: ");
            System.out.print("\n1 - Create a new 401k/403b investment");
            System.out.print("\n2 - Return to the main menu\n");

            menuOption = scanner.nextInt();
            System.out.print("\n");

            if(1 > menuOption || 2 < menuOption)
                System.out.print("***Option out of range***\n");

        }while(1 > menuOption || 2 < menuOption);

        return menuOption;
    }

    public static int createNewIRAMenu() {
        int menuOption;

        do {
            System.out.print("\nEnter a menu option: ");
            System.out.print("\n1 - Create a new IRA investment");
            System.out.print("\n2 - Return to the main menu\n");

            menuOption = scanner.nextInt();
            System.out.print("\n");

            if(1 > menuOption || 2 < menuOption)
                System.out.print("***Option out of range***\n");

        }while(1 > menuOption || 2 < menuOption);

        return menuOption;
    }

    public static int createNewStocksMenu() {
        int menuOption;

        do {
           System.out.print("\nEnter a menu option: ");
           System.out.print("\n1 - Create a new Stock investment");
           System.out.print("\n2 - Return to the main menu\n");

           menuOption = scanner.nextInt();
           System.out.print("\n");

            if(1 > menuOption || 2 < menuOption)
                System.out.print("***Option out of range***\n");

        }while(1 > menuOption || 2 < menuOption);

        return menuOption;
    }
}