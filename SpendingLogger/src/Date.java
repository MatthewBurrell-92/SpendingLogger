import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Date {
    private int month;
    private int day;
    private int year;

    Date(String date_string)
    {
        parseString(date_string);
    }

    private void parseString(String date_string) {

        Boolean valid = false;

        Scanner scanner = new Scanner(System.in);

        while(!valid)
        {
            // Check if the input is "today"
            if (date_string.equalsIgnoreCase("today")) {
                // Set to the current date (for simplicity, we'll use a fixed date here)
                // In a real application, you would use java.time.LocalDate to get the current date
                LocalDate today = LocalDate.now();
                this.month = today.getMonthValue();
                this.day = today.getDayOfMonth();
                this.year = today.getYear();
                return;
            }

            // Regular expression to match the "mm/dd/yyyy" format
            String regex = "^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/(\\d{4})$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(date_string);

            // Validate the date string

            matcher = pattern.matcher(date_string);

            if (matcher.matches()) {
                this.month = Integer.parseInt(matcher.group(1));
                this.day = Integer.parseInt(matcher.group(2));
                this.year = Integer.parseInt(matcher.group(3));
                break; // ends while loop
            } else {
                System.out.println("Invalid date format. Please use mm/dd/yyyy or 'today'.");
                date_string = scanner.nextLine();
            }
            
        }
    }
    

    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
    }

    // Method to return the date in "mm/dd/yyyy" format
    public String getDate() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public Boolean isAfter(Date date)
    {
        if (this.year < date.getYear())
        {
            return false;
        }

        else if (this.year > date.getYear())
        {
            return true;
        }

        // only catches if years are equal

        else if (this.month < date.getMonth())
        {
            return false;
        }
        else if (this.month > date.getMonth())
        {
            return true;
        }

        // only catches if years and months are equal
        else if (this.day < date.getDay())
        {
            return false;
        }

        // only catches if months and years are equal, and if the day is greater than or equal
        else 
        {
            return true;
        }
    }
    public Boolean isBefore(Date date)
    {
        if (this.year > date.getYear())
        {
            return false;
        }

        else if (this.year < date.getYear())
        {
            return true;
        }

        // only catches if years are equal

        else if (this.month > date.getMonth())
        {
            return false;
        }
        else if (this.month < date.getMonth())
        {
            return true;
        }

        // only catches if years and months are equal
        else if (this.day > date.getDay())
        {
            return false;
        }

        // only catches if months and years are equal, and if the day is less than or equal
        else 
        {
            return true;
        }
    }

}
