public class FixedExpense extends Expense {
    private int frequency; // 1: daily, 2: weekly, 3: monthly, 4: yearly
    private int occurance;
    // if frequency is weekly, day 1 is Monday, 2 Tuesday...
    // if frequency is monthly, day 1 = first, 2 = second of month...
    // if frequency is daily, day is set to 1 and is irrelevant.

    FixedExpense(double cost, String expense_name, String description, Date date, String category, int frequency, int occurance){
        super(cost, expense_name, description, date, category);
        this.frequency = frequency;
        this.occurance = occurance;
    }

    @Override
    public void display()
    {

        String dollars = String.format("%.2f", cost);

        System.out.println(expense_name + " which costs: $" + dollars + " took place on:" + date.getDate());
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);

        if (frequency == 1) // daily
        {
            System.out.println("This expense happens daily. ");
        }
        else if (frequency == 2) // weekly
        {
            String dayOfWeek = "Sunday";

            if (occurance == 2)
            {
                dayOfWeek = "Monday";
            }
            else if (occurance == 3)
            {
                dayOfWeek = "Tuesday";
            }
            else if (occurance == 4)
            {
                dayOfWeek = "Wednesday";
            }
            else if (occurance == 5)
            {
                dayOfWeek = "Thursday";
            }
            else if (occurance == 6)
            {
                dayOfWeek = "Friday";
            }
            else if (occurance == 7)
            {
                dayOfWeek = "Saturday";
            }

            System.out.println("This expense happens weekly, on " + dayOfWeek + "s. ");
        }
        else if (frequency == 2) // monthly
        {
            String numSuffix = "th";
            if (occurance == 1 || occurance == 21 || occurance == 31)
            {
                numSuffix = "st";
            }
            else if (occurance == 2 || occurance == 22)
            {
                numSuffix = "nd";
            }
            else if (occurance == 3 || occurance == 23)
            {
                numSuffix = "rd";
            }

            System.out.println("This expense happens on the " + occurance + numSuffix + " of every month. ");
        }
    }
}
