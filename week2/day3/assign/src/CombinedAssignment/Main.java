package CombinedAssignment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Mini Banking Application
//        Create a BankAccount class with deposit(), withdraw(), and getBalance() methods.
//                Add exception handling for invalid amounts and overdrafts.
//        Keep track of total accounts using a static variable.

        try{
            BankAccount acc1 = new BankAccount(101, "Ashi", 5000);
            BankAccount acc2 = new BankAccount(102, "Ayushi", 10000);

            acc1.deposit(2000);
            acc1.withdraw(1500);
            System.out.println("Current Balance: ₹" + acc1.getBalance());

            acc2.withdraw(12000); // Will throw exception

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());


//        Employee Management System
//        Create an Employee class (POJO).
//                Extend it with FullTimeEmployee and PartTimeEmployee subclasses.
//        Override a method to calculate salary differently for each.
//                Use polymorphism to call methods on a list of employees.
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Ashi", 50000);
        Employee e2 = new PartTimeEmployee(102, "Ayushi", 500, 40);
        Employee e3 = new FullTimeEmployee(103, "Casie", 60000);
        Employee e4 = new PartTimeEmployee(104, "Nina", 400, 30);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("Employee Salary Details:\n");
        for (Employee emp : employees) {
            emp.displayInfo();
        }

//        Product Catalog (with Encapsulation & Exceptions)
//        Create a Product class with private fields for id, name, and price.
//                Throw a custom exception if price is negative.
//                Create 3–5 product objects and display their details.
        try {
            Product p1 = new Product(101, "Laptop", 75000);
            Product p2 = new Product(102, "Smartphone", 25000);
            Product p3 = new Product(103, "Headphones", 3000);
            Product p4 = new Product(104, "Keyboard", 1500);


            Product[] products = {p1, p2, p3, p4};

            System.out.println("Product Details:");
            for (Product p : products) {
                p.displayDetails();
            }
            Product p5 = new Product(105, "Camera", -40000); // Will throw exception

        } catch (InvalidPriceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
