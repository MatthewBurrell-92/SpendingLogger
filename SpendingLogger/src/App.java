import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        ExpenseLibrary explib = new ExpenseLibrary();

        System.out.println("Welcome to the Expense Tracker App!");

        Boolean loop = true;

        while (loop)
        {
            System.out.println("What would you like to do? ");
            System.out.println("1: Create new Expense ");
            System.out.println("2: View Expenses ");
            System.out.println("3: View Totals ");
            System.out.println("4: Quit ");
            String choice = scanner.nextLine();

            if (choice.equals("1"))
            {
                explib.createExpense();
            }

            else if (choice.equals("2"))
            {
                explib.displayExpenses();
            }

            else if (choice.equals("3"))
            {
                explib.displayTotals();
            }
            
            else if (choice.equals("4"))
            {
                loop = false;
            }
        }
    }
}
