import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseLibrary {

    private ArrayList<Expense> expenses;
    Scanner scanner = new Scanner(System.in);

    ExpenseLibrary()
    {
        expenses = new ArrayList<>();
    }

    public void createExpense()
    {
        System.out.println("Is this a Fixed, Variable, or Periodic expense? ");
        System.out.println("1: Fixed ");
        System.out.println("2: Variable ");
        System.out.println("3: Periodic ");
        System.out.println("4: Review differences ");
        System.out.println("5: Go back ");
        String choice = scanner.nextLine();

        if (choice.equals("1"))
        {
            System.out.println("What would you like to call this expense? ");
            String name = scanner.nextLine();

            System.out.println("What was the cost? ");
            String cost_string = scanner.nextLine();
            Double cost = 0.0;
            Boolean cost_valid = false;

            while (!cost_valid)
            {
                try {
                    cost = Double.parseDouble(cost_string); // Convert the String to a double
                    cost_valid = true;
                    if (cost >= 0) {
                        cost_valid = true; // Valid input
                    } else {
                        System.out.println("Invalid input.");
                        cost_string = scanner.nextLine(); // Prompt for input again
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    cost_string = scanner.nextLine(); // Prompt for input again
                }
            }

            System.out.println("Would you like to add a description? ");
            String description = scanner.nextLine();

            System.out.println("On what date was this expense made? ");
            System.out.println("Use format mm/dd/yyyy ");
            String date_string = scanner.nextLine();
            Date date = new Date(date_string);

            System.out.println("What category does this expense belong to? ");
            System.out.println("Examples: Rent, Credit Card Payment, Car Payment. ");
            String category = scanner.nextLine();

            System.out.println("How frequently does this expense happen? ");
            System.out.println("1: daily, 2: weekly, 3: monthly, 4: yearly. ");
            String frequency_string = scanner.nextLine();
            Integer frequency = 0;
            Boolean frequency_valid = false;

            while (!frequency_valid)
            {
                try {
                    frequency = Integer.parseInt(frequency_string); // Convert the String to a double
                    frequency_valid = true;
                    if (frequency >= 1 && frequency <= 4) {
                        frequency_valid = true; // Valid input
                    } else {
                        System.out.println("Invalid input. Please enter 1, 2, or 3.");
                        frequency_string = scanner.nextLine(); // Prompt for input again
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number .");
                    frequency_string = scanner.nextLine(); // Prompt for input again
                }
            }

            if (frequency.equals(4))
            {
                System.out.println("This will be stored as a Periodic Expense, due to being yearly.  ");
                PeriodicExpense periodic = new PeriodicExpense(cost, name, description, date, category);
                expenses.add(periodic);
                return;
            }

            System.out.println("When does this expense take place? ");
            System.out.println("For monthly expenses, enter the day of the month.  ");
            System.out.println("For weekly expenses, enter the day of the week (1 for Sunday, 2 for Monday, etc).  ");
            System.out.println("If this is a daily expense, enter 1. ");
            String occ_string = scanner.nextLine();
            Integer occurance = 0;
            Boolean occ_valid = false;

            while (!occ_valid)
            {
                try {
                    occurance = Integer.parseInt(occ_string); // Convert the String to a double
                    occ_valid = true;
                    if (occurance >= 1 && occurance <= 31) {
                        occ_valid = true; // Valid input
                    } else {
                        System.out.println("Invalid input.");
                        occ_string = scanner.nextLine(); // Prompt for input again
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    occ_string = scanner.nextLine(); // Prompt for input again
                }
            }

            FixedExpense fixed = new FixedExpense(cost, name, description, date, category, frequency, occurance);
            expenses.add(fixed);
            return;
        }
        else if (choice.equals("2"))
        {
            System.out.println("What would you like to call this expense? ");
            String name = scanner.nextLine();

            System.out.println("What was the cost? ");
            String cost_string = scanner.nextLine();
            Double cost = 0.0;
            Boolean cost_valid = false;

            while (!cost_valid)
            {
                try {
                    cost = Double.parseDouble(cost_string); // Convert the String to a double
                    cost_valid = true;
                    if (cost > 0) {
                        cost_valid = true; // Valid input
                    } else {
                        System.out.println("Invalid input.");
                        cost_string = scanner.nextLine(); // Prompt for input again
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    cost_string = scanner.nextLine(); // Prompt for input again
                }
            }

            System.out.println("Would you like to add a description? ");
            String description = scanner.nextLine();

            System.out.println("On what date was this expense made? ");
            System.out.println("Use format mm/dd/yyyy ");
            String date_string = scanner.nextLine();
            Date date = new Date(date_string);

            System.out.println("What category does this expense belong to? ");
            System.out.println("Examples: Utilities bill, Grocery, Small hobby purchase. ");
            String category = scanner.nextLine();

            VariableExpense variable = new VariableExpense(cost, name, description, date, category);
            expenses.add(variable);
            return;
        }
        else if (choice.equals("3"))
        {
            System.out.println("What would you like to call this expense? ");
            String name = scanner.nextLine();

            System.out.println("What was the cost? ");
            String cost_string = scanner.nextLine();
            Double cost = 0.0;
            Boolean cost_valid = false;

            while (!cost_valid)
            {
                try {
                    cost = Double.parseDouble(cost_string); // Convert the String to a double
                    cost_valid = true;
                    if (cost > 0) {
                        cost_valid = true; // Valid input
                    } else {
                        System.out.println("Invalid input.");
                        cost_string = scanner.nextLine(); // Prompt for input again
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    cost_string = scanner.nextLine(); // Prompt for input again
                }
            }

            System.out.println("Would you like to add a description? ");
            String description = scanner.nextLine();

            System.out.println("On what date was this expense made? ");
            System.out.println("Use format mm/dd/yyyy ");
            String date_string = scanner.nextLine();
            Date date = new Date(date_string);

            System.out.println("What category does this expense belong to? ");
            System.out.println("Examples: Annual membership, Clothing, Large hobby purchase. ");
            String category = scanner.nextLine();

            PeriodicExpense periodic = new PeriodicExpense(cost, name, description, date, category);
            expenses.add(periodic);
            return;
        }
        else if (choice.equals("4"))
        {
            System.out.println("Fixed expenses are predictable, they occur daily, weekly, or monthly always ");
            System.out.println("with the same cost. Examples would be rent or mortgage payments, ");
            System.out.println("regular cell phone bills, and subscriptions (Nextflix, Disney +). ");

            System.out.println("Variable expenses happen regularly, but without a predictable cost. ");
            System.out.println("These include buying groceries, eating out at a restaurant, buying gas ");
            System.out.println("for your car, toiletries, or any other frequent expense. ");

            System.out.println("Periodic expenses occur irregularly, or regularly with intervals greater ");
            System.out.println("than one month. These can be fixed or variable, including annual taxes, ");
            System.out.println("buying clothes, making large hobby purchases, or vechicle maintanance. ");

            System.out.println("Press Enter to continue. ");
            scanner.nextLine();
            return;
        }
        else if (choice.equals("5"))
        {
            return;
        }
        else
        {
            System.out.println("I'm sorry, I didn't understand that. ");
            return;
        }
    }

    public void displayExpenses()
    {
        System.out.println("How would you like to view your total expenses? ");
        System.out.println("1: Date range ");
        System.out.println("2: Specific Category ");
        System.out.println("3: Cost range ");
        System.out.println("4: Go back ");

        String choice = scanner.nextLine();

        if (choice.equals("1"))
        {
            System.out.println("Enter dates in format mm/dd/yyy ");
            System.out.println("Starting date: ");
            String start_date = scanner.nextLine();

            Date startDate = new Date(start_date);

            System.out.println("Ending date: ");
            String end_date = scanner.nextLine();

            Date endDate = new Date(end_date);

            Boolean valid = startDate.isBefore(endDate);

            if (!valid)
            {
                System.out.println("Your dates are in the wrong order. Try again. ");
                return;
            }

            for (Expense expense : getExpensesByDate(startDate, endDate))
            {
                expense.display();
            }
        }
        else if (choice.equals("2"))
        {
            System.out.println("What category would you like to see? ");
            String category = scanner.nextLine();

            for (Expense expense : getExpensesByCategory(category))
            {
                expense.display();
            }
        }
        else if (choice.equals("3"))
        {
            System.out.println("What is the lower limit for your search? ");
            String lower_string = scanner.nextLine();
            Double lower = 0.0;
            Boolean cost_valid = false;

            while (!cost_valid)
            {
                try {
                    lower = Double.parseDouble(lower_string); // Convert the String to a double
                    cost_valid = true;
                    if (lower >= 0) {
                        cost_valid = true; // Valid input
                    } else {
                        System.out.println("Invalid input.");
                        lower_string = scanner.nextLine(); // Prompt for input again
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    lower_string = scanner.nextLine(); // Prompt for input again
                }
            }

            cost_valid = false;
            System.out.println("What was the upper limit for your search? ");
            String upper_string = scanner.nextLine();
            Double upper = 0.0;

            while (!cost_valid)
            {
                try {
                    upper = Double.parseDouble(upper_string); // Convert the String to a double
                    cost_valid = true;
                    if (upper >= 0.01) {
                        cost_valid = true; // Valid input
                    } else {
                        System.out.println("Invalid input.");
                        upper_string = scanner.nextLine(); // Prompt for input again
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    upper_string = scanner.nextLine(); // Prompt for input again
                }
            }

            for (Expense expense : getExpensesByCost(lower, upper))
            {
                expense.display();
            }
        }
        else if (choice.equals("4"))
        {
            return;
        }
        else
        {
            
        }
    }

    public void displayTotals()
    {
        double total = 0.0;

        System.out.println("How would you like to view your expenses? ");
        System.out.println("1: Date range ");
        System.out.println("2: Specific Category ");
        System.out.println("3: Cost range ");
        System.out.println("4: Go back ");

        String choice = scanner.nextLine();

        if (choice.equals("1"))
        {
            System.out.println("Enter dates in format mm/dd/yyy ");
            System.out.println("Starting date: ");
            String start_date = scanner.nextLine();

            Date startDate = new Date(start_date);

            System.out.println("Starting date: ");
            String end_date = scanner.nextLine();

            Date endDate = new Date(end_date);

            Boolean valid = startDate.isBefore(endDate);

            if (!valid)
            {
                System.out.println("One of your dates is invalid. ");
                return;
            }

            for (Expense expense : getExpensesByDate(startDate, endDate))
            {
                total += expense.getCost();
            }
        }
        else if (choice.equals("2"))
        {
            System.out.println("What category would you like to see? ");
            String category = scanner.nextLine();

            for (Expense expense : getExpensesByCategory(category))
            {
                total += expense.getCost();
            }
        }
        else if (choice.equals("3"))
        {
            System.out.println("What is the lower limit for your search? ");
            String lower_string = scanner.nextLine();
            Double lower = 0.0;
            Boolean cost_valid = false;

            while (!cost_valid)
            {
                try {
                    lower = Double.parseDouble(lower_string); // Convert the String to a double
                    cost_valid = true;
                    if (lower >= 0) {
                        cost_valid = true; // Valid input
                    } else {
                        System.out.println("Invalid input.");
                        lower_string = scanner.nextLine(); // Prompt for input again
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    lower_string = scanner.nextLine(); // Prompt for input again
                }
            }

            cost_valid = false;
            System.out.println("What was the upper limit for your search? ");
            String upper_string = scanner.nextLine();
            Double upper = 0.0;

            while (!cost_valid)
            {
                try {
                    upper = Double.parseDouble(upper_string); // Convert the String to a double
                    cost_valid = true;
                    if (upper >= 0.01) {
                        cost_valid = true; // Valid input
                    } else {
                        System.out.println("Invalid input.");
                        upper_string = scanner.nextLine(); // Prompt for input again
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    upper_string = scanner.nextLine(); // Prompt for input again
                }
            }

            for (Expense expense : getExpensesByCost(lower, upper))
            {
                total += expense.getCost();
            }
        }
        else if (choice.equals("4"))
        {
            return;
        }
        else
        {
            System.out.println("I'm sorry, I didn't understand that. '");
            return;
        }
        String dollars = String.format("%.2f", total);

        System.out.println("The total expenses for your search is $" + dollars);
    }

    private ArrayList<Expense> getExpensesByDate(Date start, Date end)
    {
        ArrayList<Expense> expensesByDate = new ArrayList<>();

        for (Expense expense : expenses)
        {
            if (expense.getDate().isAfter(start) && expense.getDate().isBefore(end))
            {
                expensesByDate.add(expense);
            }
        }
        return expensesByDate;
    }

    private ArrayList<Expense> getExpensesByCost(Double lower, Double higher)
    {
        ArrayList<Expense> expensesByCost = new ArrayList<>();

        for (Expense expense : expenses)
        {
            if (expense.getCost() >= lower && expense.getCost() <= higher){
                expensesByCost.add(expense);
            }
        }
        return expensesByCost;
    }

    private ArrayList<Expense> getExpensesByCategory(String category)
    {
        ArrayList<Expense> expensesByCategory = new ArrayList<>();

        for (Expense expense : expenses)
        {
            if (expense.getCategory().equals(category))
            {
                expensesByCategory.add(expense);
            }
        }
        return expensesByCategory;
    }

    // public void removeExpense(Expense expense)
    // {
    //     expenses.remove(expense);
    // }
}
