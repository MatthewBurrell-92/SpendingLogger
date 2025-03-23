public abstract class Expense {
    protected double cost;
    protected String expense_name;
    protected String description;
    protected Date date;
    protected String category;

    Expense()
    {
        cost = 0.0;
        expense_name = "Default expenditure";
        description = "Default description";
    }

    Expense(double cost, String expense_name, String description, Date date, String category)
    {
        this.cost = cost;
        this.expense_name = expense_name;
        this.description = description;
        this.date = date;
        this.category = category;
    }

    public String getExpenseName()
    {
        return expense_name;
    }

    public double getCost()
    {
        return cost;
    }

    public String getDescription()
    {
        return description;
    }

    public void display()
    {
        String dollars = String.format("%.2f", cost);
        System.out.println(expense_name + " which cost: $" + dollars + " took place on:" + date.getDate());
        System.out.println("Description: " + description);
    }

    public Date getDate()
    {
        return date;
    }

    public String getCategory()
    {
        return category;
    }
}

