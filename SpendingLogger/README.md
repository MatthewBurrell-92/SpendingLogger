# Overview

I recently had an interview for an internship for a company that mostly uses Java. I was not prepared for a few of their questions, and I could not confidently say I knew anythin about Java. Thus, I decided to write this porogram, to get some experience with Java.

The program is pretty simple. It records expenses, as input by the user. These expenses are either Fixed, Variable, or Periodic. The 30 minutes I spent studying finances on Google taught me that's one way to divide expenses. So that's what I designed the program around! The three types of expenses inherit from an abstract parent class called Expense. These different expenses are stored in an ArrayList in an object of the Expense Library class. The user can interact with the library, creating simple queries based on date, cost of the expenses, or the category.

I wanted to learn more about Java. I feel like this project has helped me develop a firm foundation in Java, making it so I can move forward, being as effective at Java as I am in C# or C++.

[Software Demo Video](https://youtu.be/1Ec7nVYVnHQ)

# Development Environment

I used Visual Studio Code with the Java developer extension.

I used a few built in Java libraries, including Time, the scanner utility, and the Regex utilities of Matcher and Pattern.

# Useful Websites

{Make a list of websites that you found helpful in this project}

- [Visual Studio Code Java Tutorial](https://code.visualstudio.com/docs/java/java-tutorial)
- [W3 Schools Java Introduction](http://www.w3schools.com/java/java_intro.asp)



# Future Work

- One day I want to implement a Machine Learning algorithm that will help the user to predict future expenses.
- I will also build on the Variable and Periodic classes. Variable expenses include bills that you cannot precisely predict the amount, such as utility payments. I was to implement a notification system that will remind the user to record the cost of those bills.
- Right now, everything is ran in the terminal. I want to develop a visual interface that the user can interact with, allowing them to click on values instead of entering 1 or 2 or 3 to make decisions along the program.
